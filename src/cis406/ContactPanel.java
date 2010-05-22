package cis406;
import java.awt.CardLayout;

/**
 *
 * @author mark
 */
public class ContactPanel extends javax.swing.JPanel {
    String activeCard = "Edit";

    /** Creates new form ContactPanel */
    public ContactPanel() {
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

        contactBrowsePanel1 = new cis406.ContactBrowsePanel();
        contactEditPanel1 = new cis406.ContactEditPanel();

        setName("Form"); // NOI18N
        setLayout(new java.awt.CardLayout());

        contactBrowsePanel1.setName("contactBrowsePanel1"); // NOI18N

        org.jdesktop.layout.GroupLayout contactBrowsePanel1Layout = new org.jdesktop.layout.GroupLayout(contactBrowsePanel1);
        contactBrowsePanel1.setLayout(contactBrowsePanel1Layout);
        contactBrowsePanel1Layout.setHorizontalGroup(
            contactBrowsePanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 721, Short.MAX_VALUE)
        );
        contactBrowsePanel1Layout.setVerticalGroup(
            contactBrowsePanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 453, Short.MAX_VALUE)
        );

        add(contactBrowsePanel1, "Browse");

        contactEditPanel1.setName("contactEditPanel1"); // NOI18N
        add(contactEditPanel1, "Edit");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cis406.ContactBrowsePanel contactBrowsePanel1;
    private cis406.ContactEditPanel contactEditPanel1;
    // End of variables declaration//GEN-END:variables

    public void clickEditing() {
        CardLayout cl = (CardLayout) (getLayout());
        cl.show(this, "Edit");
        activeCard = "Edit";
    }
    public void clickBrowsing() {
        CardLayout cl = (CardLayout) (getLayout());
        cl.show(this, "Browse");
        activeCard = "Browse";
    }
}
