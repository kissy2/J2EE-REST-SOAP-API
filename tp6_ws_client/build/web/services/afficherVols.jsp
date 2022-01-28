<%-- 
    Document   : afficherVols
    Created on : Dec 20, 2018, 9:46:43 PM
    Author     : SEND NUDES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List;" %>
<%@page import="ws_soap.Vol;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>afficher vols</title>
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
        <button class="button" style="vertical-align:middle" onclick="location.href='http://localhost:8080/tp6_ws_client/Servlet_Soap';"><span>Afficher Les Vols</span></button>
        <hr>
        
        <table id="tab"><tr><th>Code</th><th>Heure_Dep</th><th>Heure_Arr</th></tr>
        <%List<Vol> liste=(List<Vol>)request.getAttribute("resultat");
        int i=0;
        if(liste!=null){
            out.println("<style>#tab{visibility: visible;}</style>");
        while(i<liste.size()){%>
            <tr>
                <td>    
             <%out.println(liste.get(i).getCode());%>
        </td>
        <td>    
             <%out.println(liste.get(i).getHeureDep());%>
        </td>
        <td>    
             <%out.println(liste.get(i).getHeureArr());i++;%>
        </td>
        </tr>
        <%}}%>
            </table>
    </body>
</html>
