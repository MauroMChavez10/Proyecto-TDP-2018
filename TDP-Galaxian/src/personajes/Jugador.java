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
	private Colisionador c; 

	public Jugador(Juego juego,String nom,Celda celda) { //agrego celda
		super(juego,celda);
		this.setPosicion(celda);
		nombre = nom;
		danio = 25;
		grafico = new JugadorGrafico(10,celda.getX(),celda.getY());
		vidaDelJugador = 100;
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
	
	public void mover(int dir) {
		this.getCelda().setJugador(null);
		switch(dir) {
		case KeyEvent.VK_UP :
			super.mover(KeyEvent.VK_UP);
			break;
			
		case KeyEvent.VK_DOWN : 
			super.mover(KeyEvent.VK_DOWN);
			break;
		}
		this.getCelda().setJugador(this);
	}	



	
	// SI EL COLISIONADOR ES EL DEL ENEMIGO, ENTONCES EL ENEMIGO CHOCO CONTRA EL JUGADOR 
	// DEPENDE DE QUE TIPO DE COLISIONADOR DE LLEGUE.
	public void Accept(Colisionador visitor) { 
		visitor.VisitConcreteElementA(this);
		
	}
	
	public void reducirVida(Enemigo e) {
		if(vidaDelJugador >= 0)
		vidaDelJugador = vidaDelJugador - e.getDanio(); 
	}
	
	
	
}
	


