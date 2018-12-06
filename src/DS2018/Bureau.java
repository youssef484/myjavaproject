package DS2018;

public class Bureau extends Meubles implements Location {
   /*le(s) attribut(s)*/
private Agencement agencement;

	/* le constructeur */
	public Bureau(int nbpiece, int numéro, int adresse,Agencement agencement) {
		super(nbpiece, numéro, adresse);
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
	
	
	
}
