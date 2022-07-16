package com.example.demo7.soap;

import com.example.demo7.e2.ProduitDAO;
import com.example.demo7.e2.ProduitEntity;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "BoutiqueWS")
public class BoutiqueService {

    @WebMethod(operationName = "getProduit")
    public String getProduit(){
        return "bonjour";
    }

}
