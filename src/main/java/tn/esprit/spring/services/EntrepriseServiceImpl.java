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
	private static final Logger l = LogManager.getLogger(EntrepriseServiceImpl.class);
	
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
	public String deleteEntreprise(int id) {
		l.info("in updateEntreprise id = " + id);
		entrepriseRepository.deleteById(id);
		l.info("entreprise deleted id : " + id);
		return null;
		
	}

	@Override
	public int updateEntreprise(Entreprise e) {
		l.info("in updateEntreprise id = " + e.getId());
		entrepriseRepository.save(e);
		l.info("entreprise updated : " + e);
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
