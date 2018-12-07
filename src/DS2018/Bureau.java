package DS2018;

public class Bureau extends Meubles implements Location {
   /*le(s) attribut(s)*/
private Agencement agencement;

	/* le constructeur */
	public Bureau(double superficie,int nbpiece, int numéro, int adresse,Agencement agencement) {
		super(superficie,nbpiece, numéro, adresse);
		this.agencement=agencement;
		
		
	}

	/*getters & setters */


	public Agencement getAgencement() {
		return agencement;
	}

	public void setAgencement(Agencement agencement) {
		this.agencement = agencement;
	}
	
	 /* les methodes */
	public double prixDeBaseDeVente(double prixMC) {	
		double p=0;
		if (agencement==Agencement.CLASSIC) {p=prixMC*superficie;}
		else {p=prixMC*superficie*1.05;}
		return(p);	
		}
	
	public double prixLocation(double prixMC) {
		return(prixDeBaseDeVente( prixMC)/250);
		}	
	
	
}
