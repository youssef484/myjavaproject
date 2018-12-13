package DS2018;
public class MainClass {
	public void main(String[] args) {
AgenceImmobiliere  A = new AgenceImmobiliere();
Bureau B1 = new Bureau(20d,5,01,74,Agencement.CLASSIC);
Bureau B2 = new Bureau(30d,6,02,79,Agencement.OPENSPACE);
Garage G1 = new Garage(30d,6,02,79,6);
Garage G2 = new Garage(40d,2,01,96,2);
Appartement A1 = new Appartement(100d,9,01,97,Standing.BAS);
Appartement A2 = new Appartement(190d,10,02,98,Standing.HAUT);
Cellier C1 = new Cellier();
Cellier C2 = new Cellier();
A.ajouterMeuble(B2);
A.ajouterMeuble(C2);
A.ajouterMeuble(A1);
A.ajouterMeuble(G2);
A.ajouterMeuble(C1);
A.ajouterMeuble(A2);
A.ajouterMeuble(B1);
A.ajouterMeuble(G1);
A.afficherT();

	}


}
