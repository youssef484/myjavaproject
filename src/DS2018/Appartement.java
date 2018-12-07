package DS2018;

public class Appartement extends Meubles implements Location {
 /* les attributs */
private Standing standing;

/* le constructeur */
public Appartement(double superficie,int nbpiece, int numéro, int adresse, Standing standing) {
	super(superficie,nbpiece, numéro, adresse);
	this.standing = standing;
}
 
         /*getters & setters */

public Standing getStanding() {
	return standing;
}

public void setStanding(Standing standing) {
	this.standing = standing;
}

  
 /* les methodes */
public double prixDeBaseDeVente(double prixMC) {	
double p=0;
switch (standing) {
case HAUT: p+= superficie*prixMC;
break;
case BAS:
break;
}
return(p);	
}

public double prixLocation(double prixMC) {
return(prixDeBaseDeVente( prixMC)/250);
}

//tostring
public String toString() {
	return "Appartement ["+super.toString()+"standing=" + standing + "]";
}





}
