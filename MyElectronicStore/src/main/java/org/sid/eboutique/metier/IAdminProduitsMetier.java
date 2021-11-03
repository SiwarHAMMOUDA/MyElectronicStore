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

public interface IAdminProduitsMetier  extends InternauteMetier{
	public Long ajouterProduit(Produit p, Long idCat);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p);
}
