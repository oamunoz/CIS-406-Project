/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TaskEditPanel.java
 *
 * Created on May 29, 2010, 12:30:51 AM
 */

package cis406.student;

import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class TaskEditPanel extends javax.swing.JPanel {

    /** Creates new form TaskEditPanel */
    public TaskEditPanel() {
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

        txtStartDate = new javax.swing.JTextField();
        lblDueDate = new javax.swing.JLabel();
        txtDueDate = new javax.swing.JTextField();
        txtTaskTitle = new javax.swing.JTextField();
        lblCompleteDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescription = new javax.swing.JTextArea();
        txtCompleteDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboTaskCategory = new javax.swing.JComboBox();
        chkCompleted = new javax.swing.JCheckBox();
        txtContactName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        btnDueCal = new org.sourceforge.jcalendarbutton.JCalendarButton();
        jLabel4 = new javax.swing.JLabel();
        btnStartCal = new org.sourceforge.jcalendarbutton.JCalendarButton();
        btnCompleteCal = new org.sourceforge.jcalendarbutton.JCalendarButton();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getResourceMap(TaskEditPanel.class);
        txtStartDate.setText(resourceMap.getString("txtStartDate.text")); // NOI18N
        txtStartDate.setName("txtStartDate"); // NOI18N

        lblDueDate.setText(resourceMap.getString("lblDueDate.text")); // NOI18N
        lblDueDate.setName("lblDueDate"); // NOI18N

        txtDueDate.setText(resourceMap.getString("txtDueDate.text")); // NOI18N
        txtDueDate.setName("txtDueDate"); // NOI18N
        txtDueDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDueDateActionPerformed(evt);
            }
        });

        txtTaskTitle.setName("txtTaskTitle"); // NOI18N

        lblCompleteDate.setText(resourceMap.getString("lblCompleteDate.text")); // NOI18N
        lblCompleteDate.setName("lblCompleteDate"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        txaDescription.setColumns(20);
        txaDescription.setRows(5);
        txaDescription.setName("txaDescription"); // NOI18N
        jScrollPane1.setViewportView(txaDescription);

        txtCompleteDate.setText(resourceMap.getString("txtCompleteDate.text")); // NOI18N
        txtCompleteDate.setName("txtCompleteDate"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        cboTaskCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Company", "Correspondance", "Industry", "Student", " " }));
        cboTaskCategory.setName("cboTaskCategory"); // NOI18N

        chkCompleted.setName("chkCompleted"); // NOI18N

        txtContactName.setName("txtContactName"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        lblStartDate.setText(resourceMap.getString("lblStartDate.text")); // NOI18N
        lblStartDate.setName("lblStartDate"); // NOI18N

        btnDueCal.setName("btnDueCal"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        btnStartCal.setName("btnStartCal"); // NOI18N

        btnCompleteCal.setName("btnCompleteCal"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lblStartDate)
                    .addComponent(lblDueDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDueCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnStartCal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCompleteDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCompleteDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCompleteCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkCompleted)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))))
                    .addComponent(cboTaskCategory, 0, 0, Short.MAX_VALUE)
                    .addComponent(txtContactName)
                    .addComponent(txtTaskTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCompleteDate, txtDueDate, txtStartDate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboTaskCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTaskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStartCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompleteDate)
                    .addComponent(txtCompleteDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompleteCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDueDate)
                    .addComponent(btnDueCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(chkCompleted))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCompleteDate, txtDueDate, txtStartDate});

    }// </editor-fold>//GEN-END:initComponents

    private void txtDueDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDueDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDueDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.sourceforge.jcalendarbutton.JCalendarButton btnCompleteCal;
    private org.sourceforge.jcalendarbutton.JCalendarButton btnDueCal;
    private org.sourceforge.jcalendarbutton.JCalendarButton btnStartCal;
    private javax.swing.JComboBox cboTaskCategory;
    private javax.swing.JCheckBox chkCompleted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompleteDate;
    private javax.swing.JLabel lblDueDate;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txtCompleteDate;
    private javax.swing.JTextField txtContactName;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTaskTitle;
    // End of variables declaration//GEN-END:variables
private int id;
private int category;
private String name;
private String taskTitle;
private String description;
private Date startDate;
private Date completeDate;
private Date dueDate;
private int complete;
private Task newTask = new Task();

public void newTask() {
        newTask = new Task();
        
    }

    public Boolean save() {
        Boolean success = true;
        newTask.category = cboTaskCategory.getSelectedIndex();
        newTask.description = txaDescription.getText();
        newTask.taskTitle = txtTaskTitle.getText();
        newTask.name = txtContactName.getText();
        newTask.setCompleted(chkCompleted.isSelected());
        /*if (!newTask.setEnterDate(txtStartDate.getText())) {
            lblStartDate.setForeground(Color.RED);
            success = false;
        } else {
            lblStartDate.setForeground(Color.BLACK);
        }
        if (!newTask.setDueDate(txtDueDate.getText())) {
            lblDueDate.setForeground(Color.RED);
            success = false;
        } else {
            lblDueDate.setForeground(Color.BLACK);
        }
        if (!newTask.setCompletionDate(txtCompleteDate.getText())) {
            lblCompleteDate.setForeground(Color.RED);
            success = false;
        } else {
            lblCompleteDate.setForeground(Color.BLACK);
        }
        */
        
        if (!success) {
            JOptionPane.showMessageDialog(null, "Please check the data for errors");
            success = false;
            return success;
        }else{
            newTask.save();
            return success;
        }
    }

    public void load(int id) {

    }
        public void reset() {
      
    }
}
