package model;

public class ReservationRestaurant extends Reservation{
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int num_service, int num_table) {
		this.setJour(jour);
		this.setMois(mois);
		this.numService = num_service;
		this.numTable = num_table;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois+"\n");
		chaine.append("Table "+numTable);
		if (numService == 1) {
			chaine.append(" pour le premier service.");
		}
		else {
			chaine.append(" pour le deuxième service.");
		}
		
		return chaine.toString();
	}
}
