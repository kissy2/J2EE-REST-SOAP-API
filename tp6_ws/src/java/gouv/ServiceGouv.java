/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gouv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SEND NUDES
 */
public class ServiceGouv {
    
   public static List<Gouvernorat> ajouterGouv()
    {
       List<Gouvernorat> liste = new ArrayList() ;
    Gouvernorat v=new Gouvernorat(1,3000000,"tunis");
    liste.add(v);
    v=new Gouvernorat(2,1500000,"ariana");
    liste.add(v);
    v=new Gouvernorat(3,100000,"siliana");
    liste.add(v);
    v=new Gouvernorat(4,250000,"bierte");
    liste.add(v);
   
    return liste;   
        
}
   
   public static int populationMin(){
       List<Gouvernorat>liste=ajouterGouv();
   int res=liste.get(0).getPopulation();
   for(int i=1;i<liste.size();i++)
   {if(liste.get(i).getPopulation()<res)
       res=liste.get(i).getPopulation();
   }
   return res;
   }
   public static int populationMax(){
   List<Gouvernorat>liste=ajouterGouv();
   
   int res=liste.get(0).getPopulation();
   for(int i=1;i<liste.size();i++)
   {if(liste.get(i).getPopulation()>res)
       res=liste.get(i).getPopulation();
   }
   return res;
   }
}
