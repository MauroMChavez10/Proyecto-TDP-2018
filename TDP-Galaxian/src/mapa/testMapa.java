package mapa;
import juego.*;
import personajes.*;
import java.util.*;
public class testMapa {
	public static void main(String []args) {
		int filas= 11;
		int columnas= 5;
		try {
			if(filas>=0 && columnas >= 0) {
				Juego juego = new Juego(filas,columnas);
				Mapa mapa = juego.getMapa();
				juego.insertarJugador();
				
				//EL JUGADOR YA ESTA CREADO 
				Jugador jugadorCreadoPorElJuego = juego.getJugador();
				Celda posicionJugador = jugadorCreadoPorElJuego.getCelda();
				
				/** Testeo de metodom mover 
				 *
				 */
				jugadorCreadoPorElJuego.mover(1);
				Celda posicionDespuesDeMoverse = jugadorCreadoPorElJuego.getCelda();
				//System.out.println("La posición del jugador es : ("+posicionDespuesDeMoverse.getX()+","+posicionDespuesDeMoverse.getY()+")");
				
			}else {
				System.out.println("La cantidad de filas y/o columnas es menor a 0. Ingrese valores positivos mayores o iguales a 0 ");
			}
			
			}
		catch(Exception w) {
			w.printStackTrace();
		}
	}
		
	
	
	
}
