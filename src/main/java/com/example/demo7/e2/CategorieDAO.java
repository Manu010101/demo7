package com.example.demo7.e2;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CategorieDAO {

    public static final String PERSISTENCE_UNIT_NAME = "persistenceUnit";

    public static CategorieEntity findById(int id){
        EntityManager em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
        CategorieEntity c = em.find(CategorieEntity.class, id);
        em.close();
        return c;
    }

}
