/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.frorm;

import java.awt.Color;
import java.awt.event.MouseEvent;

/**
 *
 * @author kakon
 */
public class TableauDeBord extends javax.swing.JFrame {

    /**
     * Creates new form tableauDebord
     */
    public TableauDeBord() {
        initComponents();
        setChangePage();
    }

    
    private void setChangePage(){
        
       menu1.getDashbord().addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mousePressed(java.awt.event.MouseEvent evt) {
      
              setOnClikDashbord();
   
           }

 
       });

        menu1.getGsPersonnel().addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mousePressed(java.awt.event.MouseEvent evt) {
      
              setOnClikPersonnels();
   
           }
 
       });
        menu1.getGsFormation().addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mousePressed(java.awt.event.MouseEvent evt) {
      
              setOnClikFormation();
            
   
           }
 
       });
        menu1.getGsProjet().addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mousePressed(java.awt.event.MouseEvent evt) {
      
              setOnClikProjet();
   
           }
 
       });
        menu1.getMyProfil().addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mousePressed(java.awt.event.MouseEvent evt) {
      
              setOnClikProfil();
   
           }
 
       });
        menu1.getCrCompte().addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mousePressed(java.awt.event.MouseEvent evt) {
      
              setOnClikCrCompte();
   
           }
 
       });
        menu1.getAllComptes().addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mousePressed(java.awt.event.MouseEvent evt) {
      
              setOnClikAllCompte();
   
           }
 
       });
        menu1.getBtnQuitter().addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mousePressed(java.awt.event.MouseEvent evt) {
      
              
   
              setOnClikBtnQuitter();
           }
 
       });
        menu1.getBtndeconnexion().addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mousePressed(java.awt.event.MouseEvent evt) {
      
               setOnClikBtnDeconnexion();
           }
 
       });
        
        
    } 

    private void setOnClikDashbord(){

        menu1.getDashbord().setOpaque(true);
        menu1.getGsPersonnel().setOpaque(false);
        menu1.getGsFormation().setOpaque(false);
        menu1.getGsProjet().setOpaque(false);
        menu1.getMyProfil().setOpaque(false);
        menu1.getCrCompte().setOpaque(false);
        menu1.getAllComptes().setOpaque(false);
        
         menu1.getDashbord().setForeground(Color.WHITE);
         
        dashbord1.setVisible(true);
        formation1.setVisible(false);
        projet1.setVisible(false);
        personnel1.setVisible(false);
        repaint();
        
    }
    private void setOnClikProjet(){
        
        menu1.getGsProjet().setOpaque(true);
        menu1.getDashbord().setOpaque(false);
        menu1.getGsPersonnel().setOpaque(false);
        menu1.getGsFormation().setOpaque(false);
        menu1.getMyProfil().setOpaque(false);
        menu1.getCrCompte().setOpaque(false);
        menu1.getAllComptes().setOpaque(false);
        
         menu1.getGsProjet().setForeground(Color.WHITE);
        
        dashbord1.setVisible(false);
        projet1.setVisible(true);
        formation1.setVisible(false);
        personnel1.setVisible(false);
          repaint();
    }
    private void setOnClikFormation(){
        menu1.getGsFormation().setOpaque(true);
        menu1.getDashbord().setOpaque(false);
        menu1.getGsPersonnel().setOpaque(false);
        menu1.getGsProjet().setOpaque(false);
        menu1.getMyProfil().setOpaque(false);
        menu1.getCrCompte().setOpaque(false);
        menu1.getAllComptes().setOpaque(false);
        
        
        
        menu1.getGsFormation().setForeground(Color.WHITE);
        
        dashbord1.setVisible(false);
        formation1.setVisible(true);
        projet1.setVisible(false);
        personnel1.setVisible(false);
        repaint();
        
    }
    private void setOnClikPersonnels(){
             dashbord1.setVisible(false);
        formation1.setVisible(false);
        projet1.setVisible(false);
        personnel1.setVisible(true);
        
         menu1.getGsPersonnel().setForeground(Color.WHITE);
         
        menu1.getMyProfil().setOpaque(false);
        menu1.getCrCompte().setOpaque(false);
        menu1.getAllComptes().setOpaque(false);
        
        menu1.getDashbord().setOpaque(false);
        menu1.getGsPersonnel().setOpaque(true);
        menu1.getGsFormation().setOpaque(false);
        menu1.getGsProjet().setOpaque(false);
        
        
        menu1.getGsPersonnel().setForeground(Color.WHITE);
        repaint();
    }
    
    private void setOnClikProfil(){

        
        menu1.getDashbord().setOpaque(false);
        menu1.getGsPersonnel().setOpaque(false);
        menu1.getGsFormation().setOpaque(false);
        menu1.getGsProjet().setOpaque(false);
        menu1.getMyProfil().setOpaque(true);
        menu1.getCrCompte().setOpaque(false);
        menu1.getAllComptes().setOpaque(false);
        
         menu1.getMyProfil().setForeground(Color.WHITE);
        
        
        dashbord1.setVisible(true);
        formation1.setVisible(false);
        projet1.setVisible(false);
        personnel1.setVisible(false);
        repaint();
        
    }
    private void setOnClikAllCompte(){

        menu1.getDashbord().setOpaque(false);
        menu1.getGsPersonnel().setOpaque(false);
        menu1.getGsFormation().setOpaque(false);
        menu1.getGsProjet().setOpaque(false);
        menu1.getMyProfil().setOpaque(false);
        menu1.getCrCompte().setOpaque(false);
        menu1.getAllComptes().setOpaque(true);
        
        menu1.getAllComptes().setForeground(Color.WHITE);
        
        
        
        dashbord1.setVisible(true);
        formation1.setVisible(false);
        projet1.setVisible(false);
        personnel1.setVisible(false);
        repaint();
        
    }
    private void setOnClikCrCompte(){

        menu1.getDashbord().setOpaque(false);
        menu1.getGsPersonnel().setOpaque(false);
        menu1.getGsFormation().setOpaque(false);
        menu1.getGsProjet().setOpaque(false);
        menu1.getMyProfil().setOpaque(false);
        menu1.getCrCompte().setOpaque(true);
        menu1.getAllComptes().setOpaque(false);
         menu1.getCrCompte().setForeground(Color.WHITE);
       

        
        
        dashbord1.setVisible(true);
        formation1.setVisible(false);
        projet1.setVisible(false);
        personnel1.setVisible(false);
        repaint();
        
    }
    
      private void setOnClikBtnDeconnexion(){
        
       InterfaceDeConnexion intrfaceDeconnexion=new InterfaceDeConnexion() ;
          
        intrfaceDeconnexion.show();
        TableauDeBord.this.hide();
        
   

    }
      private void setOnClikBtnQuitter(){
          System.exit(0);
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new view.ManagerPage.Menu();
        jPanel1 = new javax.swing.JPanel();
        formation1 = new view.ManagerPage.Formation();
        personnel1 = new view.ManagerPage.Personnel();
        projet1 = new view.ManagerPage.Projet();
        dashbord1 = new view.ManagerPage.dashbord();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formation1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personnel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(projet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dashbord1, javax.swing.GroupLayout.PREFERRED_SIZE, 1279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dashbord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formation1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personnel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projet1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1540, 940));
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
            java.util.logging.Logger.getLogger(TableauDeBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableauDeBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableauDeBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableauDeBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableauDeBord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.ManagerPage.dashbord dashbord1;
    private view.ManagerPage.Formation formation1;
    private javax.swing.JPanel jPanel1;
    private view.ManagerPage.Menu menu1;
    private view.ManagerPage.Personnel personnel1;
    private view.ManagerPage.Projet projet1;
    // End of variables declaration//GEN-END:variables
}
