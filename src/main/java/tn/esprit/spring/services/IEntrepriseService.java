package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Entreprise;

public interface IEntrepriseService {

	
	Entreprise ajouterEntreprise(Entreprise e);
	List<Entreprise> retrieveAllEntreprises();
	void deleteEntreprise(int id);
	int updateEntreprise(Entreprise e);
	Entreprise retrieveEntreprise(int id);
	
}
