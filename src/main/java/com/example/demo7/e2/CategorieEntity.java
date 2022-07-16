package com.example.demo7.e2;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "categorie", schema = "mi5", catalog = "")
public class CategorieEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "libelle")
    private String libelle;
    @Basic
    @Column(name = "texte")
    private String texte;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
}
