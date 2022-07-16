package com.example.demo7.rest;

import com.example.demo7.e2.DAO.CategorieDAO;
import com.example.demo7.e2.CategorieEntity;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/categorie")
public class CategorieResource {
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCategorie(@PathParam("id") int id){
        CategorieEntity categorie = CategorieDAO.findById(id);
        if (categorie != null){
            return Response
                    .ok(categorie)
                    .build();
        }
        return Response.status(404).build();
    }
    //TODO: faire le formulaire associé - en PHP?
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createCategorie(@FormParam("libelle") String libelle, @FormParam("texte") String texte){
        try {
            CategorieEntity categorie = CategorieDAO.create(libelle, texte);
            return Response
                    .ok(categorie)
                    .build();
        }catch (Exception exception){
            return Response.status(500).build();
        }
    }

    @GET
    @Path("/delete/{id}")
    public Response deleteCategorie(@PathParam("id") int id){
        CategorieDAO.delete(id);
        return Response.status(201).build();
    }
}


