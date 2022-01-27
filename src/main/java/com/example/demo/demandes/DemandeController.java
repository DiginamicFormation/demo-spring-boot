package com.example.demo.demandes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Demande;
import com.example.demo.entities.DemandeFactory;
import com.example.demo.exceptions.FunctionalException;

@RestController
@RequestMapping("/demandes")
public class DemandeController {
	
	@Autowired
	private DemandeTransformer demandeTransformer;
	
	@GetMapping(path = "/simple")
	public List<DemandeDto> extraireAll() throws FunctionalException {
		
		return demandeTransformer.toDtosForFunc1(DemandeFactory.getInstance().getDemandes());

	}
	
	@GetMapping(path = "/all")
	public List<DemandeDto> extraire() throws FunctionalException {
		
		return demandeTransformer.toDtosForFunc2(DemandeFactory.getInstance().getDemandes());

	}

	@PostMapping(consumes = "application/json;charset=UTF-8")
	public List<Demande> ajouter(@RequestBody DemandeDto demandeDto) throws FunctionalException {
		
		Demande demande = demandeTransformer.toEntity(demandeDto);
		System.out.println("ok c'est transformé");
		
		return null;

	}
}
