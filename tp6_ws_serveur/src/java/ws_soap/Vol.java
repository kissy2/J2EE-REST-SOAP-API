/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_soap;

/**
 *
 * @author SEND NUDES
 */
public class Vol {
    String code;
    float heure_dep,heure_arr;
    
    
    
    public Vol(String code,float dep,float arr){this.code=code;this.heure_arr=arr;this.heure_dep=dep;}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getHeure_dep() {
        return heure_dep;
    }

    public void setHeure_dep(float heure_dep) {
        this.heure_dep = heure_dep;
    }

    public float getHeure_arr() {
        return heure_arr;
    }

    public void setHeure_arr(float heure_arr) {
        this.heure_arr = heure_arr;
    }
    
}
