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
	
	/**
	 * Habría que ver esta bien pasarle como parametros filas o columnas.. o que lo maneje el mapa
	 * @param filas altura del mapa 
	 * @param columnas ancho del mapa
	 */
	public Juego(int filas,int columnas) {
		mapaCombate = new Mapa(filas,columnas);
		cantidadEnemigos = 10;
		puntaje = 1000;									
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
					jugador= new Jugador("Goku");
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
