/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TestingPanel.java
 *
 * Created on May 5, 2010, 3:07:15 PM
 */

package cis406;

/**
 *
 * @author Dean
 */
public class TestingPanel extends javax.swing.JPanel implements CisPanel {

    /** Creates new form TestingPanel */
    public TestingPanel() {
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

        setName("Form"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


    public void clickNew(){
        System.out.println("new");
    }
    public void clickSave(){
        System.out.println("save");

    }
    public void clickLoad(){
        System.out.println("load");

    }
    public void clickDelete(){
        System.out.println("delete");

    }
    public void clickClear() {
        System.out.println("clear");

    }
    public void clickForm() {
        System.out.println("form");

    }
    public void clickReport() {
        System.out.println("report");

    }

    public void switchTo(javax.swing.ButtonGroup activeView) {
        System.out.println("switch to");

    }

    public void switchAway() {
        System.out.println("switch away");

    }

}
