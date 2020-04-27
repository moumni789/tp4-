package beans;

public class NombreAleatoire {
	private Double DRand ;

	public Double getDRand() {
		return DRand;
	}

	public void setDRand(Double dRand) {
		DRand = dRand;
	} 
	public Double Frandom(Double n) {
		return Math.random()*n ;
	}


}
