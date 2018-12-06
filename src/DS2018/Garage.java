package DS2018;

public class Garage extends Meubles{
	
	/* les attributs */
private double superficie;

 /* constructeur */
	public Garage(int nbpiece, int numéro, int adresse, double superficie) {
		super(nbpiece, numéro, adresse);
		this.superficie = superficie;
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

@Override
public String toString() {
	return "Garage ["+super.toString()+"superficie=" + superficie + "]";
}




}
