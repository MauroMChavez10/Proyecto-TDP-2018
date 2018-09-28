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
		super();
		//Celda celdaJugador = new Celda(juego.getMapa(),juego.getPosJugadorX(),(juego.getPosJugadorYMAX())/2);
		this.setPosicion(celda);
		//System.out.println("Celda Jugador : "+celdaJugador.getX()+" y : "+celdaJugador.getY());
		vidaDelJugador= 100;
		nombre = nom;
		//GameObjectGrafico g = this.getGameObjectGrafico();
	     this.setGameObjectGrafico(new JugadorGrafico(velocidadJugador,this.getCelda().getX(),this.getCelda().getY()));
		
		//System.out.println(celdaJugador.getX());
		//imagen[0] = new ImageIcon(this.getClass().getResource("/imagenes/gokuPosInicial.gif")); ASI LO HACIAMOS ANTES
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
	


