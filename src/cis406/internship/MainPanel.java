/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainPanel.java
 *
 * Created on May 10, 2010, 5:43:34 PM
 */
package cis406.internship;

import cis406.CisPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Dean
 */
public class MainPanel extends javax.swing.JPanel implements CisPanel {

    String activeCard = "Browse";

    /** Creates new form MainPanel */
    public MainPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browsePanel = new cis406.internship.BrowsePanel();
        editPanel = new cis406.internship.EditPanel();

        setName("Form"); // NOI18N
        setLayout(new java.awt.CardLayout());

        browsePanel.setName("browsePanel"); // NOI18N
        add(browsePanel, "Browse");

        editPanel.setName("editPanel"); // NOI18N
        add(editPanel, "Edit");
    }// </editor-fold>//GEN-END:initComponents

    public void clickReset() {
        if (activeCard.equals("Edit")) {
            editPanel.reset();
        } else {
            browsePanel.loadTable();
        }
    }

    public void clickDelete() {
    }

    public void clickCancel() {
        clickBrowsing();
    }

    public void clickLoad() {
        clickEditing();
    }

    public void clickNew() {
        clickEditing();
    }

    public void clickEditing() {
        CardLayout cl = (CardLayout) (getLayout());
        cl.show(this, "Edit");
        activeCard = "Edit";
    }

    public void clickBrowsing() {
        if (JOptionPane.showConfirmDialog(null, "You may have unfinished changes. Save?") == JOptionPane.YES_OPTION) {
            editPanel.save();
        } else {
            CardLayout cl = (CardLayout) (getLayout());
            cl.show(this, "Browse");
            activeCard = "Browse";
            browsePanel.loadTable();
        }
    }

    public void clickSave() {
        if (editPanel.save()) {
            clickBrowsing();
        }
    }

    public Boolean switchAway() {
        /*if (activeCard.equals("Edit")) {
            if (JOptionPane.showConfirmDialog(null, "You may have unfinished changes. Save?") == JOptionPane.YES_OPTION) {
                editPanel.save();
                return false;
            }
        }*/
        return true;
    }

    public void switchTo(String actionCommand) {
        if (actionCommand.equalsIgnoreCase("Edit")) {
            clickEditing();
        } else {
            clickBrowsing();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cis406.internship.BrowsePanel browsePanel;
    private cis406.internship.EditPanel editPanel;
    // End of variables declaration//GEN-END:variables
}
