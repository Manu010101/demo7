package com.example.demo7.e2.DAO;

import com.example.demo7.e2.ProduitEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ProduitDAO {
    public static final String PERSISTENCE_UNIT_NAME = "persistenceUnit";

    public static ProduitEntity findById(int id){
        EntityManager em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
        ProduitEntity p = em.find(ProduitEntity.class, id);
        em.close();
        return p;
    }

}
