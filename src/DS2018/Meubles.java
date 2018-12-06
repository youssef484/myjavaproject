package DS2018;

public abstract class Meubles {
	 
	 /*les Attribut(s)*/
	
protected int nbpiece;
protected int numéro;
protected int adresse;
protected Cellier C;

   
     /*le(s) constructeur(s) */
 
public Meubles(int nbpiece, int numéro, int adresse) {
	this.nbpiece = nbpiece;
	this.numéro = numéro;
	this.adresse = adresse;
	C = new Cellier();
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


public Cellier getC() {
	return C;
}


public void setC(Cellier c) {
	C = c;
}

/*  les methodes */


public abstract double prixDeBaseDeVente() ;

//tostring
public String toString() {
	return "Meubles [nbpiece=" + nbpiece + ", numéro=" + numéro + ", adresse=" + adresse + ", C=" + C + "]";
}





}
