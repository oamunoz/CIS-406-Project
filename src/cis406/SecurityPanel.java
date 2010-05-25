/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SecurityPanel.java
 *
 * Created on May 17, 2010, 2:55:45 PM
 */

package cis406;

/**
 *
 * @author Raf
 */
public class SecurityPanel extends javax.swing.JPanel implements CisPanel {

    private int activeTabIndex;

    /** Creates new form SecurityPanel */
    public SecurityPanel() {
        initComponents();

        activeTabIndex = securityTabs.getSelectedIndex();
    }

    public void clickNew() {
        ((CisPanel)securityTabs.getSelectedComponent()).clickNew();
    }
    public void clickSave() {
        ((CisPanel)securityTabs.getSelectedComponent()).clickSave();
    }
    public void clickLoad() {
        ((CisPanel)securityTabs.getSelectedComponent()).clickLoad();
    }
    public void clickDelete() {
        ((CisPanel)securityTabs.getSelectedComponent()).clickDelete();
    }
    public void clickReset() {
        ((CisPanel)securityTabs.getSelectedComponent()).clickReset();
    }
    public void clickCancel() {
        ((CisPanel)securityTabs.getSelectedComponent()).clickCancel();
    }
    public void clickEditing() {
        ((CisPanel)securityTabs.getSelectedComponent()).clickEditing();
    }
    public void clickBrowsing() {
        ((CisPanel)securityTabs.getSelectedComponent()).clickBrowsing();
    }
    public void switchTo(String actionCommand) {
    }

    public Boolean switchAway() {
    
        ((CisPanel)securityTabs.getSelectedComponent()).switchAway();
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

        securityTabs = new javax.swing.JTabbedPane();
        editUserPanel1 = new cis406.EditUserPanel();
        newUserPanel1 = new cis406.NewUserPanel();
        securityLogPanel1 = new cis406.SecurityLogPanel();
        settingsPanel1 = new cis406.SettingsPanel();

        setName("Form"); // NOI18N

        securityTabs.setName("securityTabs"); // NOI18N
        securityTabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                securityTabsStateChanged(evt);
            }
        });

        editUserPanel1.setName("editUserPanel1"); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getResourceMap(SecurityPanel.class);
        securityTabs.addTab(resourceMap.getString("editUserPanel1.TabConstraints.tabTitle"), editUserPanel1); // NOI18N

        newUserPanel1.setName("newUserPanel1"); // NOI18N
        securityTabs.addTab(resourceMap.getString("newUserPanel1.TabConstraints.tabTitle"), newUserPanel1); // NOI18N

        securityLogPanel1.setName("securityLogPanel1"); // NOI18N
        securityTabs.addTab(resourceMap.getString("securityLogPanel1.TabConstraints.tabTitle"), securityLogPanel1); // NOI18N

        settingsPanel1.setName("settingsPanel1"); // NOI18N
        securityTabs.addTab(resourceMap.getString("settingsPanel1.TabConstraints.tabTitle"), settingsPanel1); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(securityTabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(securityTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void securityTabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_securityTabsStateChanged
        if (activeTabIndex != securityTabs.getSelectedIndex()) {
            ((CisPanel) securityTabs.getComponentAt(activeTabIndex)).switchAway();
            activeTabIndex = securityTabs.getSelectedIndex();
            String actionCommand = "wonked";
            ((CisPanel) securityTabs.getSelectedComponent()).switchTo(actionCommand);

        }
    }//GEN-LAST:event_securityTabsStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cis406.EditUserPanel editUserPanel1;
    private cis406.NewUserPanel newUserPanel1;
    private cis406.SecurityLogPanel securityLogPanel1;
    private javax.swing.JTabbedPane securityTabs;
    private cis406.SettingsPanel settingsPanel1;
    // End of variables declaration//GEN-END:variables

}
