/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StudentBrowsePanel.java
 *
 * Created on May 24, 2010, 5:24:37 PM
 */
package cis406.student;

import cis406.TableModel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import org.jdesktop.application.Action;

/**
 *
 * @author Owner
 */
public class BrowsePanel extends javax.swing.JPanel implements Printable {

    /** Creates new form StudentBrowsePanel */
    public BrowsePanel() {
        initComponents();
        //loadTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        reportTable.setName("reportTable"); // NOI18N
        reportTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(reportTable);
        reportTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getActionMap(BrowsePanel.class, this);
        jButton1.setAction(actionMap.get("printTable")); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getResourceMap(BrowsePanel.class);
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reportTable;
    // End of variables declaration//GEN-END:variables

    public void loadTable() {
        reportTable.setModel(Student.generateTable());
    }

    public void renderReportTable(){
        reportTable.setModel(Student.generateReportTable());
    }


    public void delete() {
        int rowId = getSelectedRow();
        if (Student.delete(rowId)) {
            JOptionPane.showMessageDialog(null, "Student #" + rowId + " was deleted");
            loadTable();
        } else {
            JOptionPane.showMessageDialog(null, "Student #" + rowId + " could not be found");
        }
    }

    public int getSelectedRow() {
        int row = reportTable.getSelectedRow();
        if (row != -1) {
            return ((TableModel) reportTable.getModel()).getRowId(row);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return 0;
        }
    }

    @Action
    public void printTable() {
        PrinterJob pj = PrinterJob.getPrinterJob();
        renderReportTable();
        pj.setPrintable(this);
        pj.printDialog();
        try {
            pj.print();
            loadTable();
        } catch (Exception PrintException) {
            System.out.println(PrintException.getMessage());
        }
    }

    public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        int fontHeight = g2.getFontMetrics().getHeight();
        int fontDesent = g2.getFontMetrics().getDescent();

        //leave room for page number
        double pageHeight = pageFormat.getImageableHeight() - fontHeight;
        double pageWidth = pageFormat.getImageableWidth();
        double tableWidth = (double) reportTable.getColumnModel().getTotalColumnWidth();
        double scale = 1;
        //if (tableWidth >= pageWidth) {
          //  scale = pageWidth / tableWidth;
        //}

        double headerHeightOnPage = reportTable.getTableHeader().getHeight() * scale;
        double tableWidthOnPage = tableWidth * scale;

        double oneRowHeight = (reportTable.getRowHeight() + reportTable.getRowMargin()) * scale;
        int numRowsOnAPage = (int) ((pageHeight - headerHeightOnPage) / oneRowHeight);
        double pageHeightForTable = oneRowHeight * numRowsOnAPage;
        int totalNumPages = (int) Math.ceil(((double) reportTable.getRowCount()) / numRowsOnAPage);
        if (pageIndex >= totalNumPages) {
            return Printable.NO_SUCH_PAGE;
        }

        g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        //bottom center
        g2.drawString("Page: " + (pageIndex + 1), (int) pageWidth / 2 - 35, (int) (pageHeight + fontHeight - fontDesent));

        g2.translate(0f, headerHeightOnPage);
        g2.translate(0f, -pageIndex * pageHeightForTable);

        //If this piece of the table is smaller
        //than the size available,
        //clip to the appropriate bounds.
        if (pageIndex + 1 == totalNumPages) {
            int lastRowPrinted = numRowsOnAPage * pageIndex;
            int numRowsLeft = reportTable.getRowCount() - lastRowPrinted;
            g2.setClip(0, (int) (pageHeightForTable * pageIndex), (int) Math.ceil(tableWidthOnPage), (int) Math.ceil(oneRowHeight * numRowsLeft));
        } //else clip to the entire area available.
        else {
            g2.setClip(0, (int) (pageHeightForTable * pageIndex), (int) Math.ceil(tableWidthOnPage), (int) Math.ceil(pageHeightForTable));
        }

        g2.scale(scale, scale);
        reportTable.paint(g2);
        g2.scale(1 / scale, 1 / scale);
        g2.translate(0f, pageIndex * pageHeightForTable);
        g2.translate(0f, -headerHeightOnPage);
        g2.setClip(0, 0, (int) Math.ceil(tableWidthOnPage), (int) Math.ceil(headerHeightOnPage));
        g2.scale(scale, scale);
        reportTable.getTableHeader().paint(g2);
        //paint header at top

        return Printable.PAGE_EXISTS;
    }
}

