/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brock
 */

import javax.swing.JOptionPane;

public class SessionList extends javax.swing.JFrame {

    /**
     * Creates new form SessionList
     */
    public SessionList() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sessions = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        canAccessLabel = new javax.swing.JLabel();
        readAccessLabel = new javax.swing.JLabel();
        editingAcessLabel = new javax.swing.JLabel();
        fullAcessLabel = new javax.swing.JLabel();
        companyDocuments = new javax.swing.JLabel();
        testDocuments = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sessions.setText("Sessions");

        canAccessLabel.setForeground(new java.awt.Color(252, 11, 11));
        canAccessLabel.setText("No access");

        readAccessLabel.setForeground(new java.awt.Color(250, 101, 7));
        readAccessLabel.setText("Read Access");

        editingAcessLabel.setForeground(new java.awt.Color(0, 9, 255));
        editingAcessLabel.setText("Editing access");

        fullAcessLabel.setForeground(new java.awt.Color(5, 255, 0));
        fullAcessLabel.setText("Full access");

        companyDocuments.setForeground(new java.awt.Color(255, 0, 0));
        companyDocuments.setText("Company Documents");
        companyDocuments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                companyDocumentsMousePressed(evt);
            }
        });

        testDocuments.setForeground(new java.awt.Color(30, 255, 0));
        testDocuments.setText("Test Document");
        testDocuments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                testDocumentsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(canAccessLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(readAccessLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editingAcessLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fullAcessLabel))
                    .addComponent(companyDocuments)
                    .addComponent(testDocuments))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(companyDocuments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(testDocuments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canAccessLabel)
                    .addComponent(readAccessLabel)
                    .addComponent(editingAcessLabel)
                    .addComponent(fullAcessLabel))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sessions)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sessions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void companyDocumentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyDocumentsMousePressed
        javax.swing.JOptionPane.showMessageDialog(this, "You do not have sufficient access to read this document", "No access",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_companyDocumentsMousePressed

    private void testDocumentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testDocumentsMousePressed
        
    }//GEN-LAST:event_testDocumentsMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SessionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SessionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SessionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SessionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SessionList().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel canAccessLabel;
    private javax.swing.JLabel companyDocuments;
    private javax.swing.JLabel editingAcessLabel;
    private javax.swing.JLabel fullAcessLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel readAccessLabel;
    private javax.swing.JLabel sessions;
    private javax.swing.JLabel testDocuments;
    // End of variables declaration//GEN-END:variables
}
