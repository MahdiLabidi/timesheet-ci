package tn.esprit.spring.service;

import java.text.ParseException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {

	
	@Autowired
	IEntrepriseService es; 
	
	
	@Test
	public void testAjouterEntreprise() throws ParseException {
		
			Entreprise e = new Entreprise("Entreprise1","Entreprise1 SAS");
			Entreprise entrepriseAdded = es.ajouterEntreprise(e);
			Assert.assertEquals(e.getName(), entrepriseAdded.getName());
		
	}

	@Test
	public void testRetrieveAllEntreprises() {
		List<Entreprise> listEntreprises = es.retrieveAllEntreprises(); 
		// this assert may vary from one test to another, check database for number of occurences
		Assert.assertNotNull(listEntreprises);
	}

/*	@Test
	public void testDeleteEntreprise() {
		es.deleteEntreprise(1);
		Assert.assertNull(es.deleteEntreprise(1));
	}*/

	@Test
	public void testUpdateEntreprise() throws ParseException {
		
		Entreprise e = new Entreprise("Entreprise2","Entreprise2 SAS");
		int entrepriseUpdated = es.updateEntreprise(e);
		Assert.assertEquals(e.getId(), entrepriseUpdated);
}

	@Test
	public void testRetrieveEntreprise() {
		Entreprise entrepriseRetrieved = es.retrieveEntreprise(1); 
		Assert.assertEquals(1L, entrepriseRetrieved.getId());
	}

}
