package com.example.demo7.rest;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {

    private static final String PERSISTENCE_UNIT_NAME = "persistenceUnit";
    public static EntityManagerFactory factory;

    public static void open(){
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    public static void close(){
        factory.close();
    }
}
