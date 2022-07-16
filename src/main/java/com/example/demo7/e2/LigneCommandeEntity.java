package com.example.demo7.e2;

import javax.persistence.*;

@Entity
@Table(name = "ligne_commande", schema = "mi5", catalog = "")
public class LigneCommandeEntity {
    @Basic
    @Column(name = "id_commande_id")
    private Integer idCommandeId;
    @Basic
    @Column(name = "quantite")
    private Integer quantite;
    @Basic
    @Column(name = "prix")
    private Integer prix;
    @Basic
    @Column(name = "produit_id")
    private Integer produitId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    public Integer getIdCommandeId() {
        return idCommandeId;
    }

    public void setIdCommandeId(Integer idCommandeId) {
        this.idCommandeId = idCommandeId;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getProduitId() {
        return produitId;
    }

    public void setProduitId(Integer produitId) {
        this.produitId = produitId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
