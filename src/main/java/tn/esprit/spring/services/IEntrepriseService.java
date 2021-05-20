package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Entreprise;

public interface IEntrepriseService {

	
	Entreprise ajouterEntreprise(Entreprise e);
	List<Entreprise> retrieveAllEntreprises();
	String deleteEntreprise(int id);
	int updateEntreprise(Entreprise e);
	Entreprise retrieveEntreprise(int id);
	
}
