package personajes;

public abstract class Personaje extends GameObject{
	private int FuerzaImpacto;
	private Arma miArma;
	
	public int getFuerzaImpacto() {
		return FuerzaImpacto;
	}

	public void disparar() {}
	
}