package juego;
import javax.swing.JPanel;

import gui.*;
import personajes.Jugador;
import mapa.Celda;
import mapa.Mapa;
/**
 * 
 * EL JUEGO SABE QUE ESTA MOVIENDO GAMEOBJECT
 *	MOVER, LUEGO COLISIONAR .
 *	
 */
public class Juego {

	
	private JPanel panelMapa;
	private Mapa mapaCombate;
	private int cantidadEnemigos;
	private static final  int height=40;
	private static final int width=80;
	private Jugador jugador;
	private int puntaje;
	private int posJugadorY = 7;
	private int posJugadorX = 0;
	private	int alturaGoku = 30;
	
	
	public Juego(GUI gui) {
		mapaCombate = new Mapa(height,width,this);
		jugador = new Jugador(mapaCombate,(posJugadorX*40),(posJugadorY*80)-alturaGoku,"Goku");
		gui.add(jugador.getGrafico());
	}
	
	/**
	 * El jugador será insertado en la columna 0 y en la mitad de las filas en total del mapa
	 */
	public void insertarJugador() {
		int filaAInsertar = 0;
		int columnaAInsertar= 0;
		Celda celdaJugador= null;
		try {
			int filas =mapaCombate.getFilas();
				if(filas>=0) {
					filaAInsertar = (filas/2);
					 celdaJugador = mapaCombate.getCelda(filaAInsertar, columnaAInsertar);
					// System.out.println("celdaJugador: ("+celdaJugador.getX()+","+celdaJugador.getY()+")");
				}
			
				if(filas >= 0 && columnaAInsertar == 0 && filaAInsertar>= 0) {
					//jugador= new Jugador(325,0,"Goku"); // CREACIÓN DEL JUGADOR !!!! ANTERIOR...
					jugador.setPosicion(celdaJugador);
					celdaJugador.agregarGameObject(jugador);
					System.out.println("El jugador se insertó en la Celda : ("+celdaJugador.getX()+","+celdaJugador.getY()+")");
				}else {
					System.out.println("El jugador no pudo ser insertado correctamente");
				}
			
			
		}catch(Exception w) {
			w.printStackTrace();
		}
		
	}
	
	public Mapa getMapa() {
		return mapaCombate;
	}
	
	public Jugador getJugador() {
		return jugador;
	}
	
	
}
