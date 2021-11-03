package org.sid.eboutique.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity

public class Commande  implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCommande;
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	@OneToMany(mappedBy="commande")
	private Collection<LigneCommande> items;
	
	public Commande(Date dateCommande) {
		super();
		
		this.dateCommande = dateCommande;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Collection<LigneCommande> getItems() {
		return items;
	}
	public void setItems(Collection<LigneCommande> items) {
		this.items = items;
	}
}
