/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.frorm;
import view.frorm.InterfaceDeConnexion;
/**
 *
 * @author LENOVO P51S
 */
public class TableauDebordSecretaire extends javax.swing.JFrame {

   
    /**
     * Creates new form TableauDebordSecretaire
     */
    public TableauDebordSecretaire() {
        initComponents();
         setChangePage();
        
        
 
    }
    
     private void setChangePage(){
         tableauDeBordSecretaire2.getBtnDeconnexion().addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mousePressed(java.awt.event.MouseEvent evt) {
              OnClickDeconnexion();
   
           }
 
       });
          tableauDeBordSecretaire2.getBtnQuitter().addMouseListener(new java.awt.event.MouseAdapter() {
              
              
           public void mousePressed(java.awt.event.MouseEvent evt) {
      
               
              System.exit(0);
   
           }
           
 
       });
         
     }
    
    private void OnClickDeconnexion(){
       InterfaceDeConnexion intrfaceDeconnexion=new InterfaceDeConnexion() ;
          
        intrfaceDeconnexion.show();
        TableauDebordSecretaire.this.hide();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableauDeBordSecretaire1 = new view.page.TableauDeBordSecretaire();
        tableauDeBordSecretaire2 = new view.page.TableauDeBordSecretaire();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tableauDeBordSecretaire2, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableauDeBordSecretaire2, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1204, 893));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TableauDebordSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableauDebordSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableauDebordSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableauDebordSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableauDebordSecretaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.page.TableauDeBordSecretaire tableauDeBordSecretaire1;
    private view.page.TableauDeBordSecretaire tableauDeBordSecretaire2;
    // End of variables declaration//GEN-END:variables
}
