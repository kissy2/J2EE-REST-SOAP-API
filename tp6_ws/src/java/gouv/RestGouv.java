/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gouv;

import static gouv.ServiceGouv.ajouterGouv;
import static gouv.ServiceGouv.populationMax;
import static gouv.ServiceGouv.populationMin;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author SEND NUDES
 */
@Path("/gouv")
public class RestGouv {

    @Context
    private UriInfo context;


	@GET
	@Path("/getmax") 
        @Produces(MediaType.WILDCARD)
        public int getmaximum()
        {
        return populationMax();
        }

	@GET
	@Path("/getmin") 
        @Produces(MediaType.WILDCARD)
        public int getminimum()
        {
        return populationMin();
        }
        @GET
        @Path("/getgouv")
        @Produces(MediaType.TEXT_HTML)
        public String getgouvernorat ()
        {
            String res=ajouterGouv().get(1).getId()+"  "+ajouterGouv().get(1).getNom()+"  "+ajouterGouv().get(1).getPopulation();
        return res;            
        }
	@GET
	@Path("/getgouvxml")
        @Produces(MediaType.TEXT_XML)
public Gouvernorat getgouvernoratXML ()
{Gouvernorat gouv=new Gouvernorat();
    return gouv; }


}