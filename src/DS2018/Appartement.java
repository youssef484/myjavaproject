package DS2018;

public class Appartement extends Meubles implements Location {
 /* les attributs */
private Standing standing;

/* le constructeur */
public Appartement(int nbpiece, int numéro, int adresse, Standing standing) {
	super(nbpiece, numéro, adresse);
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





}
