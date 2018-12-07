package DS2018;

public class Garage extends Meubles implements Location{
	
	/* les attributs */
private int nbplace;
private Cellier cellier;


 /* constructeur */
	public Garage(double superficie,int nbpiece, int numéro, int adresse, int nbplace) {
		super(superficie,nbpiece, numéro, adresse);
		this.nbplace=nbplace;
	}
 
	/* getters & setters */
	
	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

  /* les méthodes */
public double prixDeBaseDeVente() {
return(2000d);
}


//tostring

public String toString() {
	return "Garage ["+super.toString()+"superficie=" + superficie + "]";
}

public double prixLocation(double prixMC) {
return(30d);
}


}
