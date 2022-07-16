package com.example.demo7.e2.DAO;

import com.example.demo7.e2.CategorieEntity;

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

    public static CategorieEntity create(String libelle, String texte){
        EntityManager em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
        em.getTransaction().begin();
        CategorieEntity c = new CategorieEntity();
        c.setLibelle(libelle);
        c.setTexte(texte);
        em.persist(c);
        em.getTransaction().commit();
        em.close();
        return c;
    }

    public static void delete(int id){
        EntityManager em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM CategorieEntity AS c WHERE c.id = :id")
                .setParameter("id", id)
                .executeUpdate();
        em.getTransaction().commit();
        em.close();
    }

}
