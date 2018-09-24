package personajes;
import mapa.*;

public abstract class Personaje extends GameObject{
	private int FuerzaImpacto;
	private Arma miArma;
	private String nombre ;
	
	/** La clase abstracta aunque no pueda ser instanciada puede tener constructor 
	 *  Este constructor sobrecarga al constructor sin parametros 
	 *  y ya no se puede usar ese
	 * 
	 */
	public Personaje(String nombre) {
		
	}
	
	public int getFuerzaImpacto() {
		return FuerzaImpacto;
	}

	public void disparar() {}
	
	public void mover(int dir) {};
	
}
