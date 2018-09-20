package personajes;
import java.awt.event.KeyEvent;

import mapa.Celda;


public class Jugador extends Personaje{
	//Atributos de clase
	private static final int TECLA_ARRIBA = KeyEvent.VK_UP;
	private static final int TECLA_ABAJO = KeyEvent.VK_UP;
	private int vidaDelJugador; 
	
	public Jugador() {
		vidaDelJugador= 100;
	}
	
	/**
	 * Modela movimiento del jugador, solo podra moverse en la columna 0
	 * Responsabilidad de la clase cliente, verificar que el jugador no este muerto.
	 */
	public void mover(int direccion) {
		//Quiero saber mi posicion actual, soy un jugador y debo cambiarme a otra celda.
		try {
			Celda celdaJugador = this.getCelda();
			Celda celdasVecinas[] = celdaJugador.getVecinas(celdaJugador.getX(),celdaJugador.getY());
			// LUEGO DE SABER DONDE ESTOY. DEBO LIBER LA CELDA EN LA QUE ESTABA POSICIONADO ANTES DE MOVERME
			celdaJugador.eliminarGameObject(this);
			
			if(TECLA_ARRIBA == direccion) {
				celdasVecinas[0].agregarGameObject(this);
			}
			
			if(TECLA_ABAJO == direccion) {
				celdasVecinas[1].agregarGameObject(this);
			}
			
		}catch(Exception w) {
			w.printStackTrace();
		}
		
	}
		
	public boolean estaMuerto() {
		return (this.getVida() == 0);
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
	
		
	public void mover() {};	

	
	public void serChocado() {};
	
}
	


