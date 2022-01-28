<%-- 
    Document   : dictionaire
    Created on : Dec 20, 2018, 8:15:47 PM
    Author     : SEND NUDES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>traduction</title>
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
        <h1>Traduction</h1>
        <hr>
        <form method="post" action="http://localhost:8080/tp6_ws_client/Servlet_Soap">
            <input type="text" required placeholder="Veuillez enter : le mot a traduire" name="text" size="28">
            <select name="langue" size="1">
                <OPTION value="fr_to_en">Francais->Anglais</option>
                <OPTION value="en_to_fr">Anglais->Francais</option>
                </select>
            <br>    
            <input type="submit" value="Traduir">
                
            <input type="reset" value="Annuler">
             </form>
        <label><% 
           String s= (String)request.getAttribute("resultat");
            if(s!=null) out.println(s);   %></label>
    </body>
</html>
