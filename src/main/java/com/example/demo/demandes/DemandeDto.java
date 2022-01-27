package com.example.demo.demandes;

import java.time.LocalDate;

import com.example.demo.entities.Collaborateur;
import com.example.demo.entities.Statut;

public class DemandeDto {

	private Long id;
	private String dateDebut;
	private String dateFin;
	private String statut;
	private CollaborateurDto collaborateur;
	
	public DemandeDto() {
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
	 * @return the dateDebut
	 */
	public String getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter
	 * @return the dateFin
	 */
	public String getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter
	 * @return the statut
	 */
	public String getStatut() {
		return statut;
	}

	/** Setter
	 * @param statut the statut to set
	 */
	public void setStatut(String statut) {
		this.statut = statut;
	}

	/** Getter
	 * @return the collaborateur
	 */
	public CollaborateurDto getCollaborateur() {
		return collaborateur;
	}

	/** Setter
	 * @param collaborateur the collaborateur to set
	 */
	public void setCollaborateur(CollaborateurDto collaborateur) {
		this.collaborateur = collaborateur;
	}

}
