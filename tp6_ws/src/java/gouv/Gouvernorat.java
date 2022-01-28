/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gouv;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SEND NUDES
 */


@XmlRootElement
public class Gouvernorat {
int id,population;    
String nom;  

public Gouvernorat(){this.id=1;this.population=3000000;this.nom="tunis";}

public Gouvernorat(int id,int population,String nom){this.id=id;this.population=population;this.nom=nom;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
  
}
