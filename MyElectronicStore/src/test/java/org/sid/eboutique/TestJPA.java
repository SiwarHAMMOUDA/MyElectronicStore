package org.sid.eboutique;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sid.eboutique.metier.*;
import org.sid.eboutique.entities.*;
import org.sid.eboutique.entities.Categorie;
public class TestJPA {
	ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
	context=
				new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	}
	/*@Test
	public void test() {
	try {
		ClassPathXmlApplicationContext app=
				new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	assertTrue(true);
	} catch (Exception e) {
	assertTrue(e.getMessage(),false);
	}
	}*/
	@Test
	public void test1() {
		try
		{
					IAdminCategoriesMetier metier=(IAdminCategoriesMetier) context.getBean("metier");
					List<Categorie> cts1=metier.listCategories();
					metier.ajouterCategorie(new Categorie("Ordinateur", null, "jjjjfhffgggf", ""));
					metier.ajouterCategorie(new Categorie("Imprimantes", null, "jdshdyyyfyyu", ""));
					List<Categorie> cts2=metier.listCategories();
					assertTrue(cts2.size()==cts1.size()+2);
		}
		catch(Exception e){
			assertTrue(e.getMessage(), false);
		}
	}
	@Test
	public void test2() {
		try
		{
					IAdminCategoriesMetier metier=(IAdminCategoriesMetier ) context.getBean("metier");
					List<Produit> prod1=metier.listproduits();
					metier.ajouterProduit(new Produit("hp524","new",52, 5, true, ""), 9L);
					metier.ajouterProduit(new Produit("dell524","old",21, 2, false, ""), 10L);
					List<Produit> prod2=metier.listproduits();
					assertTrue(prod1.size()+2==prod2.size());
		}
		catch(Exception e){
			assertTrue(e.getMessage(), false);
		}
	}

}
