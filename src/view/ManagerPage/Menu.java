/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.ManagerPage;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author kakon
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        dashbord.setOpaque(true);
        gsFormation.setOpaque(false);
        gsPersonnel.setOpaque(false);
        gsProjet.setOpaque(false);
        
        
        
        dashbord.addMouseListener(new java.awt.event.MouseAdapter() {
      
           public void mouseClicked(java.awt.event.MouseEvent evt) {
      
            
   
           }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e); 
                
               
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
             setBackground(Color.CYAN);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
            
           
 
       });
        
    }
    
    
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dashbord = new javax.swing.JLabel();
        gsProjet = new javax.swing.JLabel();
        gsFormation = new javax.swing.JLabel();
        gsPersonnel = new javax.swing.JLabel();
        btndeconnexion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnQuitter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        crCompte = new javax.swing.JLabel();
        myProfil = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        allComptes = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 153, 204));
        setForeground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        dashbord.setBackground(new java.awt.Color(51, 51, 255));
        dashbord.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashbord.setForeground(new java.awt.Color(255, 255, 255));
        dashbord.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashbord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/compteur-de-vitesse.png"))); // NOI18N
        dashbord.setText("Tableau de bord");
        dashbord.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        dashbord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashbord.setIconTextGap(20);
        dashbord.setOpaque(true);

        gsProjet.setBackground(new java.awt.Color(51, 51, 255));
        gsProjet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gsProjet.setForeground(new java.awt.Color(237, 234, 234));
        gsProjet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gsProjet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lancement-du-projet.png"))); // NOI18N
        gsProjet.setText("Projets");
        gsProjet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        gsProjet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gsProjet.setIconTextGap(20);

        gsFormation.setBackground(new java.awt.Color(51, 51, 255));
        gsFormation.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gsFormation.setForeground(new java.awt.Color(237, 234, 234));
        gsFormation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gsFormation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/education.png"))); // NOI18N
        gsFormation.setText("Formations");
        gsFormation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        gsFormation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gsFormation.setIconTextGap(20);

        gsPersonnel.setBackground(new java.awt.Color(51, 51, 255));
        gsPersonnel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gsPersonnel.setForeground(new java.awt.Color(237, 234, 234));
        gsPersonnel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gsPersonnel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reglage.png"))); // NOI18N
        gsPersonnel.setText("Personnel");
        gsPersonnel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        gsPersonnel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gsPersonnel.setIconTextGap(20);

        btndeconnexion.setBackground(new java.awt.Color(0, 51, 255));
        btndeconnexion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndeconnexion.setForeground(new java.awt.Color(255, 255, 255));
        btndeconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout(1).png"))); // NOI18N
        btndeconnexion.setText("Deconnexion");
        btndeconnexion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeconnexionActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/profil.png"))); // NOI18N

        btnQuitter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuitter.setForeground(new java.awt.Color(51, 102, 255));
        btnQuitter.setText("Quitter");
        btnQuitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manager");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Compte");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));

        crCompte.setBackground(new java.awt.Color(51, 51, 255));
        crCompte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        crCompte.setForeground(new java.awt.Color(237, 234, 234));
        crCompte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/contact.png"))); // NOI18N
        crCompte.setText("Creer des Comptes");
        crCompte.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        crCompte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crCompte.setIconTextGap(20);

        myProfil.setBackground(new java.awt.Color(51, 51, 255));
        myProfil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myProfil.setForeground(new java.awt.Color(237, 234, 234));
        myProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user.png"))); // NOI18N
        myProfil.setText("Mon Profil");
        myProfil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        myProfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myProfil.setIconTextGap(20);

        allComptes.setBackground(new java.awt.Color(51, 51, 255));
        allComptes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        allComptes.setForeground(new java.awt.Color(237, 234, 234));
        allComptes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/contact-list.png"))); // NOI18N
        allComptes.setText("Tous les comptes");
        allComptes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        allComptes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        allComptes.setIconTextGap(20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(dashbord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gsProjet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gsFormation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
            .addComponent(gsPersonnel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndeconnexion))
                .addGap(48, 48, 48))
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90))
            .addComponent(myProfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(crCompte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(allComptes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(dashbord, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(gsProjet, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(gsFormation, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(gsPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(myProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(crCompte, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(allComptes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 90, Short.MAX_VALUE)
                .addComponent(btndeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeconnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeconnexionActionPerformed

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitterActionPerformed

    public JLabel getMyProfil() {
        return myProfil;
    }

    public void setMyProfil(JLabel myProfil) {
        this.myProfil = myProfil;
    }

    
    public JLabel getAllComptes() {
        return allComptes;
    }

    public void setAllComptes(JLabel allComptes) {
        this.allComptes = allComptes;
    }

    public JButton getBtnQuitter() {
        return btnQuitter;
    }

    public void setBtnQuitter(JButton btnQuitter) {
        this.btnQuitter = btnQuitter;
    }

    public JLabel getCrCompte() {
        return crCompte;
    }

    public void setCrCompte(JLabel crCompte) {
        this.crCompte = crCompte;
    }

    public JButton getBtndeconnexion() {
        return btndeconnexion;
    }

    public JLabel getGsProjet() {
        return gsProjet;
    }

    public void setGsProjet(JLabel gsProjet) {
        this.gsProjet = gsProjet;
    }

    public void setBtndeconnexion(JButton btndeconnexion) {
        this.btndeconnexion = btndeconnexion;
    }

    public JLabel getDashbord() {
        return dashbord;
    }

    public void setDashbord(JLabel dashbord) {
        this.dashbord = dashbord;
    }

    public JLabel getGsFormation() {
        return gsFormation;
    }

    public void setGsFormation(JLabel gsFormation) {
        this.gsFormation = gsFormation;
    }

    public JLabel getGsPersonnel() {
        return gsPersonnel;
    }

    public void setGsPersonnel(JLabel gsPersonnel) {
        this.gsPersonnel = gsPersonnel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allComptes;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btndeconnexion;
    private javax.swing.JLabel crCompte;
    private javax.swing.JLabel dashbord;
    private javax.swing.JLabel gsFormation;
    private javax.swing.JLabel gsPersonnel;
    private javax.swing.JLabel gsProjet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel myProfil;
    // End of variables declaration//GEN-END:variables
}
