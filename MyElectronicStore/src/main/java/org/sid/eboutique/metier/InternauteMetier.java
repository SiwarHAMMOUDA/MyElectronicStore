package org.sid.eboutique.metier;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.eboutique.entities.Categorie;
import org.sid.eboutique.entities.Client;
import org.sid.eboutique.entities.Commande;
import org.sid.eboutique.entities.LigneCommande;
import org.sid.eboutique.entities.Panier;
import org.sid.eboutique.entities.Produit;
import org.sid.eboutique.entities.Role;
import org.sid.eboutique.entities.User;

public interface InternauteMetier {
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public List<Produit> listproduits();
	public List<Produit> produitsParMotCle(String mc);
	public List<Produit> produitsParCategorie(Long idCat);
	public List<Produit> produitsSelectionnes();
	public Produit getProduit(Long idP);
	public Commande enregistrerCommande(Panier p,Client c);
}
