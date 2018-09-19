package personajes;

public abstract class Personaje extends GameObject{
	private int FuerzaImpacto;
	
	
	public int getFuerzaImpacto() {
		return FuerzaImpacto;
	}

	public void disparar() {}
	
	public void moverse() {}
}
