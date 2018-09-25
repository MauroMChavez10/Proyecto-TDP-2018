package personajes;

public abstract class Arma {
	private int puntosDisparo;
	private int alcance;
	
	public Arma(Personaje p) {
		puntosDisparo = 20;
	}
	
	public void colisionar (GameObject g) {}
	
	public abstract int getAlcance();

}
