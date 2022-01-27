package com.example.demo.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DemandeFactory {

	private static DemandeFactory instance = new DemandeFactory();
	
	private HashMap<Long, Demande> demandes = new HashMap<>();
	
	private DemandeFactory() {
		
		Collaborateur collab1 = new Collaborateur(1L, "pdurand@gmail.com", "DURAND", "Paul");
		
		Demande demande1 = new Demande(1L, LocalDate.of(2022, 2, 8), LocalDate.of(2022, 2, 9), Statut.INITIAL, collab1);
		collab1.getDemandes().add(demande1);
		
		demandes.put(demande1.getId(), demande1);
	}
	
	public static DemandeFactory getInstance() {
		return instance;
	}
	
	public List<Demande> getDemandes(){
		return new ArrayList<>(demandes.values());
	}

}
