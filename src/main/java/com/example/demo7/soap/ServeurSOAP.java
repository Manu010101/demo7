package com.example.demo7.soap;

import javax.xml.ws.Endpoint;

public class ServeurSOAP {
    public static void main(String[] args) {
        String url = "http://localhost:9090/";
        Endpoint.publish(url, new BoutiqueService());
        System.out.println("ws starts sur: " + url);
    }

}
