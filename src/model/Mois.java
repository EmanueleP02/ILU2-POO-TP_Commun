package model;

public class Mois {
	private String nom;
	private boolean[] jours;
	
	public void creerMois(String nom, int nbJours) {
		this.nom = nom;
		for (int i = 0; i < nbJours; i++) {
			jours[i] = false;
		}
	}
	public boolean estLibre(int jour) {
		return !jours[jour-1];
	}
	
	public void reserver(int jour) {
		if (estLibre(jour)) {
			jours[jour-1] = true;
		}
	}
}
