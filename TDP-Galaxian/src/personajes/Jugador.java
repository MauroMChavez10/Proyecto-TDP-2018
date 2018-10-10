package personajes;


import java.awt.event.KeyEvent;
import graficos.*;
import juego.*;
import mapa.Celda;
//import graficos.*;

public class Jugador extends Personaje{
	//Atributos de clase
	private static final char TECLA_ARRIBA = KeyEvent.VK_UP;
	private static final char TECLA_ABAJO = KeyEvent.VK_DOWN;
	private int vidaDelJugador; 
	private String nombre=""; 
	private int velocidadJugador;

	public Jugador(Juego juego,String nom,Celda celda) { //agrego celda
		super(juego,celda);
		this.setPosicion(celda);
		nombre = nom;
	
	}
	

	public boolean estaMuerto() {
		return (this.getVida() <= 0); // PREGUNTAR ESTO
	}
	
	/**
	 * Ver luego como afectan los ataques y eso al jugador. 
	 */
	public int getVida() {
		return vidaDelJugador;
	}
	
	public void destruir() {
		if(vidaDelJugador==0) {
			this.getCelda().eliminarGameObject(this);
		}
	}
	
	public String getNombre() {
		return "Hola! Soy "+nombre;
	}
	
	public void mover() {};	

	
	public void serChocado() {};
	
	
	
}
	


