/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_soap;

import javax.jws.WebService;
import javax.jws.WebMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.jws.WebParam;

/**
 *
 * @author SEND NUDES
 */
@WebService(serviceName = "ws_soap1")
public class ws_soap1 {


  
    
    @WebMethod(operationName = "traduction")
    
    public  String traduction(@WebParam(name="s")String s ,@WebParam(name="t") String t){
   String resultat="le mot n'existe pas dans le dictionaire";
        if("fr_to_en".equals(t))
       
        {
   HashMap fr_to_en= new HashMap();
      
      fr_to_en.put("Manger", "Eat");
      fr_to_en.put("Boire", "Drink");
      fr_to_en.put("Jouer", "Play");
      fr_to_en.put("Parler", "Speak");
      fr_to_en.put("Dormir", "Sleep");
         fr_to_en.put("manger", "eat");
      fr_to_en.put("boire", "drink");
      fr_to_en.put("jouer", "play");
      fr_to_en.put("parler", "speak");
      fr_to_en.put("dormir", "sleep");
      
      if(fr_to_en.get(s)!=null)
        resultat=fr_to_en.get(s).toString();
        }
        else{
       HashMap en_to_fr= new HashMap();
      
    en_to_fr.put("Eat", "Manger");
      en_to_fr.put("Drink", "Boire");
      en_to_fr.put("Play", "Jouer");
      en_to_fr.put("Speak", "Parler");
      en_to_fr.put("Sleep", "Dormir");
 en_to_fr.put("eat", "manger");
      en_to_fr.put("drink", "boire");
      en_to_fr.put("play", "jouer");
      en_to_fr.put("speak", "parler");
      en_to_fr.put("sleep", "dormir");
      if(en_to_fr.get(s)!=null)
      resultat=en_to_fr.get(s).toString();
      
        }
   
      
      
  return resultat;
   }

        
    
    
    
    
        @WebMethod(operationName = "cal_mnt_ttc")
    public  float cal_mnt_ttc(@WebParam(name="montant")float montant,@WebParam(name="tva")float tva)
    {
    return (montant*(1+tva));
    }
    
    
    
    
        @WebMethod(operationName = "afficher_vol")
    public  List<Vol> afficher_vol()
    {
       List<Vol> liste = new ArrayList() ;
    Vol v=new Vol("tun2018740",8.30f,9.30f);
    liste.add(v);
    v=new Vol("tun461194",11.30f,12.30f);
    liste.add(v);
    v=new Vol("tun498874",3.10f,4.45f);
    liste.add(v);
    v=new Vol("tun561525",21.00f,23.30f);
    liste.add(v);
   
    return liste;
    
    }
}
