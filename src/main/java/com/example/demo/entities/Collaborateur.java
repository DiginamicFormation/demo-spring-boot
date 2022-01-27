package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

/** Représente un collaborateur
 * @author RichardBONNAMY
 *
 */
public class Collaborateur {

	private Long id;
	private String email;
	private String nom;
	private String prenom;
	private Set<Demande> demandes = new HashSet<>();
	private Set<Collaborateur> subordonnes = new HashSet<>();
	
	public Collaborateur() {
		
	}
	
	public Collaborateur(Long id, String email, String nom, String prenom) {
		super();
		this.id = id;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the demandes
	 */
	public Set<Demande> getDemandes() {
		return demandes;
	}
	/**
	 * @param demandes the demandes to set
	 */
	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}
	/**
	 * @return the subordonnes
	 */
	public Set<Collaborateur> getSubordonnes() {
		return subordonnes;
	}
	/**
	 * @param subordonnes the subordonnes to set
	 */
	public void setSubordonnes(Set<Collaborateur> subordonnes) {
		this.subordonnes = subordonnes;
	}
	
}
