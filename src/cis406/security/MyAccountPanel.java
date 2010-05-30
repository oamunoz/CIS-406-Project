/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MyAccountPanel.java
 *
 * Created on May 26, 2010, 1:10:07 AM
 */

package cis406.security;

import cis406.PanelInterface;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class MyAccountPanel extends javax.swing.JPanel implements PanelInterface {

    /** Creates new form MyAccountPanel */
    public MyAccountPanel() {
        initComponents();
        try {
            ResultSet rs = cis406.Database.execute("select * from users where user_name = '" + cis406.MainApp.loginResult[1] + "'");
            while (rs.next()) {
                txtFirstName.setText(rs.getString("first_name"));
                txtLastName.setText(rs.getString("last_name"));
                txtAnswer.setText(rs.getString("answer"));

                // find user's security question and select it from the combo box
                ResultSet rsSecurityQuestion = cis406.Database.execute("select question from question_key where question_key_id = " + rs.getInt("question_key_id"));
                while (rsSecurityQuestion.next()) {
                    HashMap questions = new HashMap();

                    for (int i = 0; i < ddlSecurityQuestions.getItemCount(); i++) {
                        questions.put(i, ddlSecurityQuestions.getItemAt(i).toString());
                    }

                    for (int i = 0; i < questions.size(); i++) {
                        if (questions.get(i).equals(rsSecurityQuestion.getString("question"))) {
                            ddlSecurityQuestions.setSelectedIndex(i);
                        }
                    }
                }
            }

            } catch (Exception e) {
                System.out.println("Could not execute query");
                System.out.println(e.getMessage());
            }
    }
    public void clickNew() {
        clickReset();
    }

    public void clickSave() {
        String firstPassword = "";
        for (int i = 0; i < txtPassword1.getPassword().length; i++){
            firstPassword += txtPassword1.getPassword()[i];
        }
        String secondPassword = "";
        for (int i = 0; i < txtPassword2.getPassword().length; i++){
            secondPassword += txtPassword2.getPassword()[i];
        }

        if (!firstPassword.isEmpty()) {
            if (firstPassword.equals(secondPassword)){
                if (User.checkPassword(txtPassword1.getPassword(), cis406.MainApp.loginResult[1])) {
                    User user = new User();

                    user.setUsername(cis406.MainApp.loginResult[1]);
                    user.setPassword(txtPassword1.getPassword());
                    if (!user.setfName(txtFirstName.getText())) {
                        JOptionPane.showMessageDialog(null, "Incorrect first name format.  Bad: 'bob' Good: 'Bob'");
                        return;
                    }
                    if (!user.setlName(txtLastName.getText())) {
                        JOptionPane.showMessageDialog(null, "Incorrect last name format..  Bad: 'jones' Good: 'Jones'");
                        return;
                    }
                    user.setSecurityAnswer(txtAnswer.getText());
                    user.setSecurityQuestion(ddlSecurityQuestions.getSelectedItem().toString());

                    user.assistantUpdate();
                    txtPassword1.setText("");
                    txtPassword2.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "The passwords you entered do not match.");
            }
        }
        else {
            User user = new User();

            user.setUsername(cis406.MainApp.loginResult[1]);
            if (!user.setfName(txtFirstName.getText())) {
                JOptionPane.showMessageDialog(null, "Incorrect first name format.  Bad: 'bob' Good: 'Bob'");
                return;
            }
            if (!user.setlName(txtLastName.getText())) {
                JOptionPane.showMessageDialog(null, "Incorrect last name format..  Bad: 'jones' Good: 'Jones'");
                return;
            }
            user.setSecurityAnswer(txtAnswer.getText());
            user.setSecurityQuestion(ddlSecurityQuestions.getSelectedItem().toString());

            user.assistantUpdate();
        }
    }

    public void clickLoad() {

    }

    public void clickDelete() {

    }

    public void clickReset() {
        txtFirstName.setText("");
        txtLastName.setText("");
    }

    public void clickCancel() {

    }

    public void clickBrowsing() {

    }

    public void clickEditing() {

    }

    public void switchTo(String actionCommand) {

    }

    public Boolean switchAway() {
        return true;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtPassword2 = new javax.swing.JPasswordField();
        txtFirstName = new javax.swing.JTextField();
        txtPassword1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfPass = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ddlSecurityQuestions = new javax.swing.JComboBox();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getResourceMap(MyAccountPanel.class);
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
        });

        jSeparator2.setName("jSeparator2"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        lblLastName.setText(resourceMap.getString("lblLastName.text")); // NOI18N
        lblLastName.setName("lblLastName"); // NOI18N

        txtLastName.setName("txtLastName"); // NOI18N

        txtPassword2.setName("txtPassword2"); // NOI18N

        txtFirstName.setName("txtFirstName"); // NOI18N

        txtPassword1.setName("txtPassword1"); // NOI18N

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        lblFirstName.setText(resourceMap.getString("lblFirstName.text")); // NOI18N
        lblFirstName.setName("lblFirstName"); // NOI18N

        lblPassword.setText(resourceMap.getString("lblPassword.text")); // NOI18N
        lblPassword.setName("lblPassword"); // NOI18N

        lblConfPass.setText(resourceMap.getString("lblConfPass.text")); // NOI18N
        lblConfPass.setName("lblConfPass"); // NOI18N

        txtAnswer.setName("txtAnswer"); // NOI18N

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        ddlSecurityQuestions.setModel(new cis406.ComboBoxModel("question_key", "question"));
        ddlSecurityQuestions.setName("ddlSecurityQuestions"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblFirstName)
                                        .addComponent(lblLastName))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtLastName)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(63, 63, 63))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword)
                            .addComponent(lblConfPass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ddlSecurityQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfPass)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddlSecurityQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden
        // TODO add your handling code here:
}//GEN-LAST:event_jLabel1ComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ddlSecurityQuestions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblConfPass;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    // End of variables declaration//GEN-END:variables

}
