package org.sid.eboutique.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="produits")
public class Produit implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long idProduit;
	@NotEmpty
	@Size(min=4, max=15)
private String designation;
private String description;
private double prix;
private int quantite;
private boolean selectionne;
private String photo;
@ManyToOne
@JoinColumn(name="idCategorie")
private Categorie categorie;

public boolean getSelectionne() {
	return selectionne;
}
public void setSelectionne(boolean selectionne) {
	this.selectionne = selectionne;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}

public Long getIdProduit() {
	return idProduit;
}
public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(String designation, String description, double prix, int quantite, boolean selectionne, String photo) {
	super();
	this.designation = designation;
	this.description = description;
	this.prix = prix;
	this.quantite = quantite;
	this.selectionne=selectionne;
	this.photo=photo;
}

}
