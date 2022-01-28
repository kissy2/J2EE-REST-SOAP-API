<%-- 
    Document   : v
    Created on : Dec 20, 2018, 9:45:56 PM
    Author     : SEND NUDES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>calcul ttc</title>
         <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/skin.css">
    </head>
    <body>
                 <div  id="home">  
        <a href="http://localhost:8080/tp6_ws_client/services/services.html">
            <img src="${pageContext.request.contextPath}/css/home.png" height="60" width="60" alt="http://localhost:8080/tp6_ws_client/services/services.html"></a>
        </div>  
        <div  id="home1">  
        <a href="http://localhost:8080/tp6_ws_client/index.html">
            <img src="${pageContext.request.contextPath}/css/logout.png" height="65" width="65" alt="http://localhost:8080/tp6_ws_client/index.html"></a>
        </div>     
        <hr>
        <h1>Calcul TTC</h1>
        <hr>
        <form method="post" action="http://localhost:8080/tp6_ws_client/Servlet_Soap">
            <input type="number" required placeholder="Veuillez enter : le montant" name="montant">
            <select name="tva" size="1">
                <OPTION selected value="0.05">Catégorie 1 : TVA=5%</option>
                <OPTION value="0.08">Catégorie 2 : TVA=8%</option>
                <OPTION value="0.12">Catégorie 3 : TVA=12%</option>
                <OPTION value="0.18">Catégorie 4 : TVA=18%</option>
                <OPTION value="0.27">Catégorie 5 : TVA=27%</option>
                </select>
            <br>    
            <input type="submit" value="Calculer">
                
            <input type="reset" value="Annuler">
             </form>
        <label><% 
           Float s= (Float)request.getAttribute("resultat");
           if(s!=null) out.println(s);   %></label>
    </body>
</html>
