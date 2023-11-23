package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];
	
	private static class Mois {
		private String nom;
		private boolean[] jours;
		
		public Mois(String nom, int nbJours) {
			this.nom = nom;
			for (int i = 0; i < nbJours; i++) {
				jours[i] = false;
			}
		}
		private boolean estLibre(int jour) { 
			return !jours[jour-1];
		}
		
		private void reserver(int jour) {
			if (estLibre(jour)) {
				jours[jour-1] = true;
			}
		}
	}
	
	public CalendrierAnnuel() {
		Mois janvier = new Mois("Janvier", 31);
		Mois fevrier = new Mois("Février", 28);
		Mois mars = new Mois("Mars", 31);
		Mois avril = new Mois("Avril", 30);
		Mois mai = new Mois("Mai", 31);
		Mois juin = new Mois("Juin", 30);
		Mois juillet = new Mois("Juillet", 30);
		Mois aout = new Mois("Août", 31);
		Mois septembre = new Mois("Septembre", 30);
		Mois octobre = new Mois("Octobre", 31);
		Mois novembre = new Mois("Novembre", 30);
		Mois decembre = new Mois("Décembre", 31);
		calendrier[0] = janvier;
		calendrier[1] = fevrier;
		calendrier[2] = mars;
		calendrier[3] = avril;
		calendrier[4] = mai;
		calendrier[5] = juin;
		calendrier[6] = juillet;
		calendrier[7] = aout;
		calendrier[8] = septembre;
		calendrier[9] = octobre;
		calendrier[10] = novembre;
		calendrier[11] = decembre;
	}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	
	public boolean reserver(int jour, int mois) {
		if (estLibre(jour, mois)) {
			calendrier[mois].reserver(jour);
			return true;
		}
		else {
			return false;
		}
	}
}
