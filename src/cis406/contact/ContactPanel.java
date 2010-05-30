package cis406.contact;
import cis406.PanelInterface;
import java.awt.CardLayout;

/**
 *
 * @author Mark Lenser
 */
public class ContactPanel extends javax.swing.JPanel implements PanelInterface {
    String activeCard = "Browse";

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

        contactEditPanel1 = new cis406.contact.ContactEditPanel();
        contactBrowsePanel1 = new cis406.contact.ContactBrowsePanel();

        setName("Form"); // NOI18N
        setLayout(new java.awt.CardLayout());

        contactEditPanel1.setName("contactEditPanel1"); // NOI18N
        add(contactEditPanel1, "Edit");

        contactBrowsePanel1.setName("contactBrowsePanel1"); // NOI18N
        add(contactBrowsePanel1, "Browse");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cis406.contact.ContactBrowsePanel contactBrowsePanel1;
    private cis406.contact.ContactEditPanel contactEditPanel1;
    // End of variables declaration//GEN-END:variables


    public void clickReset() {
        if (activeCard.equals("Edit")) {
            contactEditPanel1.reset();
        } else {
            contactBrowsePanel1.loadTable();
        }
    }

    public void clickDelete() {
        if (activeCard.equals("Browse")) {
            contactBrowsePanel1.delete();
        } else {
        }
    }

    public void clickCancel() {
        browsing();
    }

    public void clickLoad() {
        if (activeCard.equals("Browse")) {
            int record = contactBrowsePanel1.getSelectedRow();
            if (record != 0) {
                editing();
                contactEditPanel1.load(record);
            }
        }
    }

    public void clickNew() {
        contactEditPanel1.newContact();
        editing();
    }

    public void clickEditing() {
    }

    public void clickBrowsing() {
        if (false) { // (JOptionPane.showConfirmDialog(null, "You may have unfinished changes. Save?") == JOptionPane.YES_OPTION) {
            contactEditPanel1.save();
        }
    }

    public void clickSave() {
        if (activeCard.equals("Edit") && contactEditPanel1.save()) {
            browsing();
        }
    }

    public void editing() {
        CardLayout cl = (CardLayout) (getLayout());
        cl.show(this, "Edit");
        activeCard = "Edit";
    }

    public void browsing() {
        CardLayout cl = (CardLayout) (getLayout());
        cl.show(this, "Browse");
        activeCard = "Browse";
        contactBrowsePanel1.loadTable();
    }
    public void switchTo(String actionCommand) {
        browsing();
    }
    public Boolean switchAway() {
        return true;
    }
}
