package com.example.demo7.e2;

import javax.persistence.*;

@Entity
@Table(name = "produit", schema = "mi5", catalog = "")
public class ProduitEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "categorie_id")
    private Integer categorieId;
    @Basic
    @Column(name = "libelle")
    private String libelle;
    @Basic
    @Column(name = "texte")
    private String texte;
    @Basic
    @Column(name = "prix")
    private Integer prix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Integer categorieId) {
        this.categorieId = categorieId;
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

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }
}
