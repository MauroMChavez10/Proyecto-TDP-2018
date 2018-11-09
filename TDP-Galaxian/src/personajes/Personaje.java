package personajes;
import javax.swing.Icon;
import javax.swing.JLabel;


import mapa.*;
import juego.*;
import mapa.*;
public abstract class Personaje extends GameObject{
	private int FuerzaImpacto;
	private Arma miArma;
	private String nombre ;
	//private JLabel grafico;
	
	
	/** La clase abstracta aunque no pueda ser instanciada puede tener constructor 
	 *  Este constructor sobrecarga al constructor sin parametros 
	 *  y ya no se puede usar ese
	 * 
	 */

	public Personaje(Juego juego,Celda c) {
		super(juego,c);
	};	
	//COMANDOS
	

	public void mover(int dir) {};
	
	//CONSULTAS 
	public int getFuerzaImpacto() {
		return FuerzaImpacto;
	}
	
	public void disparar() {}
	
	public String getNombre() {
		return nombre ;
	}
	
	
}
