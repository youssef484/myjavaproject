package DS2018;
import java.util.ArrayList;
public class AgenceImmobiliere {
private Location T[];
private int  nbT;

public AgenceImmobiliere() {
this.nbT=0;
T = new Location[nbT];
}

public void ajouterMeuble(Location L) {
nbT++;
T[nbT]=L;
}

public void afficherT() {
for(int i=0; i<nbT; i++) {
T[i].toString();	
}

}


public int getNbT() {
	return nbT;
}

public void setNbT(int nbT) {
	this.nbT = nbT;
}








}
