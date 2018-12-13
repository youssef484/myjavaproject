package DS2018;

public abstract class Meubles {
	 
	 /*les Attribut(s)*/
protected double superficie;
protected int nbpiece;
protected int numéro;
protected int adresse;

   
     /*le(s) constructeur(s) */
 
public Meubles(double superficie, int nbpiece, int numéro, int adresse) {
	
	this.superficie = superficie;
	this.nbpiece = nbpiece;
	this.numéro = numéro;
	this.adresse = adresse;
}


     /*getters & setters */


public int getNbpiece() {
	return nbpiece;
}





public void setNbpiece(int nbpiece) {
	this.nbpiece = nbpiece;
}


public int getNuméro() {
	return numéro;
}


public void setNuméro(int numéro) {
	this.numéro = numéro;
}


public int getAdresse() {
	return adresse;
}


public void setAdresse(int adresse) {
	this.adresse = adresse;
}




/*  les methodes */


public abstract double prixDeBaseDeVente(double prixMC) ;

//tostring
public String toString() {
	return "nbpiece=" + nbpiece + ", numéro=" + numéro + ", adresse=" + adresse ;
}





}
