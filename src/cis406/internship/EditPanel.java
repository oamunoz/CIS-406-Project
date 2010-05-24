/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditPanel.java
 *
 * Created on Apr 22, 2010, 6:03:34 AM
 */
package cis406.internship;

import cis406.CisComboBox;
import cis406.ComboItem;
import org.jdesktop.application.Action;

/**
 *
 * @author Dean Sofer
 */
public class EditPanel extends javax.swing.JPanel {

    /** Creates new form EditPanel */
    public EditPanel() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextarea = new javax.swing.JTextArea();
        postedField = new javax.swing.JFormattedTextField();
        expiresField = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        attachmentField = new javax.swing.JTextField();
        titleField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        attachmentLabel = new javax.swing.JLabel();
        postedLabel = new javax.swing.JLabel();
        quantity1Label = new javax.swing.JLabel();
        companyComboBox = new javax.swing.JComboBox();
        companyLabel = new javax.swing.JLabel();
        quantityField = new javax.swing.JFormattedTextField();
        careerComboBox = new javax.swing.JComboBox();
        careerLabel = new javax.swing.JLabel();
        expiresCheckBox = new javax.swing.JCheckBox();
        postedCalButton = new org.sourceforge.jcalendarbutton.JCalendarButton();
        expiresCalButton = new org.sourceforge.jcalendarbutton.JCalendarButton();
        quantity2Label = new javax.swing.JLabel();

        jFileChooser1.setName("jFileChooser1"); // NOI18N

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getResourceMap(EditPanel.class);
        titleLabel.setText(resourceMap.getString("titleLabel.text")); // NOI18N
        titleLabel.setName("titleLabel"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        descriptionTextarea.setColumns(20);
        descriptionTextarea.setRows(5);
        descriptionTextarea.setName("descriptionTextArea"); // NOI18N
        jScrollPane1.setViewportView(descriptionTextarea);

        postedField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM-dd-yyyy"))));
        postedField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        postedField.setText(resourceMap.getString("postedFTextField.text")); // NOI18N
        postedField.setName("postedFTextField"); // NOI18N

        expiresField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM-dd-yyyy"))));
        expiresField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expiresField.setText(resourceMap.getString("expiresFTextField.text")); // NOI18N
        expiresField.setEnabled(false);
        expiresField.setName("expiresFTextField"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getActionMap(EditPanel.class, this);
        jButton1.setAction(actionMap.get("browse")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        attachmentField.setText(resourceMap.getString("attachmentTextField.text")); // NOI18N
        attachmentField.setEnabled(false);
        attachmentField.setName("attachmentTextField"); // NOI18N

        titleField.setText(resourceMap.getString("titleTextField.text")); // NOI18N
        titleField.setName("titleTextField"); // NOI18N

        descriptionLabel.setText(resourceMap.getString("descriptionLabel.text")); // NOI18N
        descriptionLabel.setName("descriptionLabel"); // NOI18N

        attachmentLabel.setText(resourceMap.getString("attachmentLabel.text")); // NOI18N
        attachmentLabel.setName("attachmentLabel"); // NOI18N

        postedLabel.setText(resourceMap.getString("postedLabel.text")); // NOI18N
        postedLabel.setName("postedLabel"); // NOI18N

        quantity1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity1Label.setText(resourceMap.getString("quantity1Label.text")); // NOI18N
        quantity1Label.setName("quantity1Label"); // NOI18N

        companyComboBox.setModel(new CisComboBox("company", "name"));
        companyComboBox.setName("companyComboBox"); // NOI18N

        companyLabel.setText(resourceMap.getString("companyLabel.text")); // NOI18N
        companyLabel.setName("companyLabel"); // NOI18N

        quantityField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        quantityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantityField.setText(resourceMap.getString("quantityField.text")); // NOI18N
        quantityField.setName("quantityField"); // NOI18N

        careerComboBox.setEditable(true);
        careerComboBox.setModel(new CisComboBox("career_path", "name"));
        careerComboBox.setName("careerComboBox"); // NOI18N

        careerLabel.setText(resourceMap.getString("careerLabel.text")); // NOI18N
        careerLabel.setName("careerLabel"); // NOI18N

        expiresCheckBox.setAction(actionMap.get("toggleExpires")); // NOI18N
        expiresCheckBox.setText(resourceMap.getString("expiresCheckBox.text")); // NOI18N
        expiresCheckBox.setName("expiresCheckBox"); // NOI18N

        postedCalButton.setLabel(resourceMap.getString("postedCalButton.label")); // NOI18N
        postedCalButton.setName("postedCalButton"); // NOI18N

        expiresCalButton.setEnabled(false);
        expiresCalButton.setName("expiresCalButton"); // NOI18N

        quantity2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity2Label.setText(resourceMap.getString("quantity2Label.text")); // NOI18N
        quantity2Label.setName("quantity2Label"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(titleLabel)
                        .addGap(6, 6, 6)
                        .addComponent(titleField, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(attachmentLabel)
                                                .addGap(6, 6, 6))
                                            .addComponent(companyLabel)
                                            .addComponent(postedLabel)
                                            .addComponent(careerLabel)
                                            .addComponent(descriptionLabel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(quantityField)))
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantity1Label, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(quantity2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(attachmentField, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(companyComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 375, Short.MAX_VALUE)
                            .addComponent(careerComboBox, 0, 375, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(postedField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(postedCalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(expiresCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(expiresField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(expiresCalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(attachmentLabel)
                    .addComponent(attachmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postedLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expiresField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expiresCheckBox)))
                    .addComponent(postedCalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiresCalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(careerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(careerLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quantity1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap())
        );

        quantity1Label.getAccessibleContext().setAccessibleName(resourceMap.getString("quantityLabel.AccessibleContext.accessibleName")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    @Action
    public void browse() {
        int success = jFileChooser1.showOpenDialog(this);
        if (success == jFileChooser1.APPROVE_OPTION) {
            attachmentField.setText(jFileChooser1.getSelectedFile().getAbsolutePath());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attachmentField;
    private javax.swing.JLabel attachmentLabel;
    private javax.swing.JComboBox careerComboBox;
    private javax.swing.JLabel careerLabel;
    private javax.swing.JComboBox companyComboBox;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextarea;
    private org.sourceforge.jcalendarbutton.JCalendarButton expiresCalButton;
    private javax.swing.JCheckBox expiresCheckBox;
    private javax.swing.JFormattedTextField expiresField;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.sourceforge.jcalendarbutton.JCalendarButton postedCalButton;
    private javax.swing.JFormattedTextField postedField;
    private javax.swing.JLabel postedLabel;
    private javax.swing.JLabel quantity1Label;
    private javax.swing.JLabel quantity2Label;
    private javax.swing.JFormattedTextField quantityField;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    public Boolean save() {
        Internship record = new Internship();
        Boolean success = false;

        // Saves the career path if it's a new entry
        if (careerComboBox.getSelectedIndex() == -1) {
            CareerPath cp = new CareerPath(careerComboBox.getSelectedItem().toString());
            record.setCareerPathId(cp.save());
        } else {
            record.setCareerPathId(((ComboItem) careerComboBox.getSelectedItem()).id);
        }

        // Saves the rest of the internship record
        record.setTitle(titleField.getText());
        // The selected item must be cast into a ComboItem object so you can access it's attributes
        record.setCompanyId(((ComboItem) companyComboBox.getSelectedItem()).id);
        record.setAttachment(attachmentField.getText());
        record.setPostDate(postedField.getText());
        if (expiresCheckBox.isSelected()) {
            record.setExpiration(expiresField.getText());
        }
        record.setDescription(descriptionTextarea.getText());
        record.setQuantity(Integer.parseInt(quantityField.getText()));
        record.save();
        return success;
    }

    public void reset() {
        companyComboBox.setSelectedIndex(0);
        careerComboBox.setSelectedIndex(0);
        titleField.setText("");
        descriptionTextarea.setText("");
        postedField.setText("mm-dd-yyyy");
        expiresCheckBox.setSelected(false);
        expiresField.setText("mm-dd-yyyy");
        expiresField.setEnabled(false);
        expiresCalButton.setEnabled(false);
        quantityField.setText("1");
        attachmentField.setText("");
    }

    @Action
    public void toggleExpires() {
        expiresField.setEnabled(expiresCheckBox.isSelected());
        expiresCalButton.setEnabled(expiresCheckBox.isSelected());
    }
}
