package com.example.demo.demandes;

import org.springframework.stereotype.Component;

import com.example.demo.entities.Collaborateur;

@Component
public class CollaborateurTransformer {

	public CollaborateurTransformer() {
		// TODO Auto-generated constructor stub
	}

	public Collaborateur toEntity(CollaborateurDto dto) {
		
		Collaborateur entity = new Collaborateur();
		entity.setId(dto.getId());
		return entity;
	}
}
