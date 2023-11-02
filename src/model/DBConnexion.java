/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kakon
 */
public class DBConnexion {
    
    
   
    private java.sql.Statement state;
    Connection connexion = null;
    

    public DBConnexion() {
        
            
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             System.out.println("Le pilote JDBC MySQL a été chargé");
       
        try {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/projetBts", "root","");
        System.out.println("Connexion à la BDD OK");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void insertToDB(String query){
        if(connexion!=null){
             try {
             state = connexion.createStatement();
             state.executeUpdate(query);
             System.out.println("effectuer avec succes");
             
        } catch (SQLException ex) {
            Logger.getLogger(DBConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       
       
        
    }
    
            
            
      
    

 
   
  }
       
   


