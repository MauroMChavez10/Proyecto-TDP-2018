package personajes;
import java.awt.event.KeyEvent;

import mapa.Celda;


public class Jugador extends Personaje{
	
	public Jugador() {
	}
	
	/**
	 * Modela movimiento del jugador, solo podra moverse en la columna 0
	 * Responsabilidad de la clase cliente, verificar que el jugador no este muerto.
	 */
	public void mover(int dir) {
		//Quiero saber mi posicion actual, soy un jugador y tengo una celda.
	try {
		
			int posActualEnY = super.getCelda().getY(); //El eje de las Y crece hacia abajo
		
			if(KeyEvent.VK_DOWN==dir) {
				super.getCelda().setY(posActualEnY-1);
			}else
				if (KeyEvent.VK_UP==dir) {
					super.getCelda().setY(posActualEnY+1);
				}
				
		}
		catch(Exception w) {
			w.printStackTrace();
		}
	}
		
		
	public void mover() {};	


}
	//public boolean estoyMuerto(){}


