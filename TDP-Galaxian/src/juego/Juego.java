package juego;
import javax.swing.JPanel;
import personajes.Jugador;
import mapa.Celda;
import GUI.*;
import mapa.Mapa;
/**
 * 
 * EL JUEGO SABE QUE ESTA MOVIENDO GAMEOBJECT
 *	MOVER, LUEGO COLISIONAR .
 *	
 */
public class Juego {

	
	private JPanel panelMapa;
	private GUI gui;
	private Mapa mapaCombate;
	private int cantidadEnemigos;
	private static final  int height=40;
	private static final int weight=80;
	private Jugador jugador;
	private int puntaje;
	
	public Juego() {
		mapaCombate= new Mapa(height,weight,this);
										
	}
	
	
	public void insertarJugador() {
		Celda c=new Celda (0,0);
		jugador= new Jugador();
		jugador.setPosicion(c);
		
		
		
		
	}
}
