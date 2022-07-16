package com.example.demo7;

import com.example.demo7.e2.CategorieDAO;
import com.example.demo7.e2.CategorieEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/categorie")
public class CategorieResource {
    @GET
    @Produces("text/plain")
    public String getCategorieLibelle(){
        CategorieEntity categorie = CategorieDAO.findById(1);
        return categorie.getLibelle();
    }

}


