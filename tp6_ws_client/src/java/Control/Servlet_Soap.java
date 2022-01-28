/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws_soap.Vol;
import ws_soap.WsSoap1_Service;



@WebServlet(name = "Servlet_Soap", urlPatterns = {"/Servlet_Soap"})
public class Servlet_Soap extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/tp6_ws_serveur/ws_soap1.wsdl")
    private WsSoap1_Service service_1;



  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
List<Vol> resultat= afficherVol();

        request.setAttribute("resultat",resultat);
        RequestDispatcher dp=request.getRequestDispatcher("/services/afficherVols.jsp");
        dp.forward(request, response);
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
        
        if(request.getParameter("montant")!=null)
        {
        
        float montant=Float.parseFloat(request.getParameter("montant"));
        float tva=Float.parseFloat(request.getParameter("tva"));
        float resultat=calMntTtc(montant,tva);
        request.setAttribute("resultat", resultat);
        RequestDispatcher dp=request.getRequestDispatcher("/services/calcul_mntTTC.jsp");
        dp.forward(request, response);
        
        
        
        
        }
        
        
        else{
        String text =request.getParameter("text");
        String langue =request.getParameter("langue");
        String resultat=traduction(text,langue);
        request.setAttribute("resultat", resultat);
        RequestDispatcher dp=request.getRequestDispatcher("/services/traduction.jsp");
        dp.forward(request, response);
        }
        
    }

    private String traduction(java.lang.String s, java.lang.String t) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws_soap.WsSoap1 port = service_1.getWsSoap1Port();
        return port.traduction(s, t);
    }

    private java.util.List<ws_soap.Vol> afficherVol() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws_soap.WsSoap1 port = service_1.getWsSoap1Port();
        return port.afficherVol();
    }

    private float calMntTtc(float montant, float tva) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws_soap.WsSoap1 port = service_1.getWsSoap1Port();
        return port.calMntTtc(montant, tva);
    }

  

 
    }

 
 


