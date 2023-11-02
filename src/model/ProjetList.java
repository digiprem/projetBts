/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kakon
 */
public class ProjetList {
    
    private String titre ;
    private String competence;
    private int nombreDagent;
    private int ageMin;
    private int ageMax;
    private final  String QUERY;
    private DBConnexion db=new DBConnexion();

    public ProjetList(String titre, String competence, int nombreDagent, int ageMin, int ageMax) {
        this.titre = titre;
        this.competence = competence;
        this.nombreDagent = nombreDagent;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.QUERY = "INSERT INTO projet( titre, competence,nombre_agent,ageMin,ageMax) VALUES ('"+ titre + "','"+competence+ "'," +nombreDagent+ "," +ageMin+","+ageMax+")";
               
                
                
                
                
              
    
        
        nouveauProjet();
        
       
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public int getNombreDagent() {
        return nombreDagent;
    }

    public void setNombreDagent(int nombreDagent) {
        this.nombreDagent = nombreDagent;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(int ageMax) {
        this.ageMax = ageMax;
    }
    
    private void nouveauProjet(){
        
          
        db.insertToDB(QUERY);
        
    }
    
    
    
    
    
    
    
    
}
