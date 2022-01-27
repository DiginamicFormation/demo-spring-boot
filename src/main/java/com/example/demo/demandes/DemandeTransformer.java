package com.example.demo.demandes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Demande;
import com.example.demo.entities.Statut;

@Component
public class DemandeTransformer {
	
	@Autowired
	private CollaborateurTransformer collaborateurTransformer;
	
	public DemandeTransformer() {
		// TODO Auto-generated constructor stub
	}
	
	public Demande toEntity(DemandeDto demandeDto) {
		
		Demande demande = new Demande();
		demande.setId(demandeDto.getId());
		demande.setDateDebut(LocalDate.parse(demandeDto.getDateDebut(), DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		demande.setDateFin(LocalDate.parse(demandeDto.getDateFin(), DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		demande.setStatut(Statut.valueOf(demandeDto.getStatut()));
		demande.setCollaborateur(collaborateurTransformer.toEntity(demandeDto.getCollaborateur()));
		return demande;
	}
	
	public List<DemandeDto> toDtosForFunc1(List<Demande> entities){
		
		ArrayList<DemandeDto> liste = new ArrayList<>();
		entities.forEach(d -> liste.add(toDtoForFunc1(d)));
		return liste;
	}
	
	public List<DemandeDto> toDtosForFunc2(List<Demande> entities){
		
		ArrayList<DemandeDto> liste = new ArrayList<>();
		entities.forEach(d -> liste.add(toDtoForFunc2(d)));
		return liste;
	}

	public DemandeDto toDtoForFunc1(Demande demande) {
		DemandeDto dto = new DemandeDto();
		dto.setId(demande.getId());
		dto.setDateDebut(demande.getDateDebut().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		dto.setDateFin(demande.getDateFin().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		dto.setStatut(demande.getStatut().name());
		return dto;
	}
	
	public DemandeDto toDtoForFunc2(Demande demande) {
		DemandeDto dto = new DemandeDto();
		dto.setId(demande.getId());
		dto.setDateDebut(demande.getDateDebut().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		dto.setDateFin(demande.getDateFin().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		dto.setStatut(demande.getStatut().name());
		
		CollaborateurDto collabDto = new CollaborateurDto();
		collabDto.setEmail(demande.getCollaborateur().getEmail());
		collabDto.setId(demande.getCollaborateur().getId());
		
		dto.setCollaborateur(collabDto);

		return dto;
	}
}
