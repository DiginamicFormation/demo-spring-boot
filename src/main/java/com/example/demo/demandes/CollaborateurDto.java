package com.example.demo.demandes;

import java.util.ArrayList;
import java.util.List;

public class CollaborateurDto {
	
	private Long id;
	private String email;
	private String nom;
	private String prenom;
	private List<DemandeDto> demandes = new ArrayList<>();
	private List<CollaborateurDto> subordonnes = new ArrayList<>();

	public CollaborateurDto() {
		// TODO Auto-generated constructor stub
	}

	/** Getter
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/** Getter
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/** Setter
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter
	 * @return the demandes
	 */
	public List<DemandeDto> getDemandes() {
		return demandes;
	}

	/** Setter
	 * @param demandes the demandes to set
	 */
	public void setDemandes(List<DemandeDto> demandes) {
		this.demandes = demandes;
	}

	/** Getter
	 * @return the subordonnes
	 */
	public List<CollaborateurDto> getSubordonnes() {
		return subordonnes;
	}

	/** Setter
	 * @param subordonnes the subordonnes to set
	 */
	public void setSubordonnes(List<CollaborateurDto> subordonnes) {
		this.subordonnes = subordonnes;
	}

}
