package tn.esprit.spring.service;

import java.text.ParseException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

public class EntrepriseServiceImplTest {

	
	@Autowired
	IEntrepriseService es; 
	
	
/*	@Test
	public void testAjouterEntreprise() throws ParseException {
		
			Entreprise e = new Entreprise("Entreprise1","Entreprise1 SAS");
			Entreprise entrepriseAdded = es.ajouterEntreprise(e);
			Assert.assertEquals(e.getName(), entrepriseAdded.getName());
		
	}*/

/*	@Test
	public void testRetrieveAllEntreprises() {
		List<Entreprise> listEntreprises = es.retrieveAllEntreprises(); 
		Assert.assertEquals(2, listEntreprises.size());
	}*/

/*	@Test
	public void testDeleteEntreprise() {
		es.deleteEntreprise(2);
		Assert.assertNull(es.deleteEntreprise(2));
	}*/

/*	@Test
	public void testUpdateEntreprise() throws ParseException {
		
		Entreprise e = new Entreprise("Entreprise2","Entreprise2 SAS");
		int entrepriseUpdated = es.updateEntreprise(e);
		Assert.assertEquals(e.getId(), entrepriseUpdated);
}*/

/*	@Test
	public void testRetrieveEntreprise() {
		Entreprise entrepriseRetrieved = es.retrieveEntreprise(1); 
		Assert.assertEquals(1L, entrepriseRetrieved.getId());
	}*/

}
