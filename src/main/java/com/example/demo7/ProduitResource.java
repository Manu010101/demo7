package com.example.demo7;

import com.example.demo7.e2.ProduitDAO;
import com.example.demo7.e2.ProduitEntity;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/produits")
public class ProduitResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ProduitEntity getCategorie(@QueryParam("id") int id){
        return ProduitDAO.findById(id);
    }

    @Path("/methode2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response createProduit(){
        return Response.status(203)
                .encoding("UTF-8")
                .entity(ProduitDAO.findById(2))
                .build();
    }


}
