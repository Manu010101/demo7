package com.example.demo7.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "BoutiqueWS")
public class BoutiqueService {

    @WebMethod(operationName = "getProduit")
    public String getProduit(){
        return "bonjour";
    }

}
