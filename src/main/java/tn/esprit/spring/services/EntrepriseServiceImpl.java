package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;

@Service
public class EntrepriseServiceImpl implements IEntrepriseService{

	@Autowired
	EntrepriseRepository entrepriseRepository;
	private static final Logger l = LogManager.getLogger(IEntrepriseService.class);
	
	@Override
	public Entreprise ajouterEntreprise(Entreprise e) {
		return entrepriseRepository.save(e);
	}

	@Override
	public List<Entreprise> retrieveAllEntreprises() {
		
		List<Entreprise> entreprises = null; 
		try {
	
			l.info("In retrieveAllEntreprises() : ");
			entreprises = (List<Entreprise>) entrepriseRepository.findAll();  
			for (Entreprise entreprise : entreprises) {
				l.debug("entreprise +++ : " + entreprise);
			} 
			l.info("Out of retrieveAllEntreprises() : ");
		}catch (Exception e) {
			l.error("Error in retrieveAllEntreprises() : " + e);
		}

		return entreprises;

	}

	@Override
	public void deleteEntreprise(int id) {
		entrepriseRepository.deleteById(id);
		
	}

	@Override
	public int updateEntreprise(Entreprise e) {
		entrepriseRepository.save(e);
		return e.getId();
	}

	@Override
	public Entreprise retrieveEntreprise(int id) {
		l.info("in retrieveEntreprise id = " + id);
		Entreprise e =  entrepriseRepository.findById(id);
		l.info("entreprise returned : " + e);
		return e;
	}

}
