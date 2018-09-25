package personajes;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import mapa.*;

public class Jugador extends Personaje{
	//Atributos de clase
	private static final int TECLA_ARRIBA = KeyEvent.VK_UP;
	private static final int TECLA_ABAJO = KeyEvent.VK_DOWN;
	private int vidaDelJugador; 
	private String nombre=""; 


	
	public Jugador(Mapa mapa,int x,int y,String nom) {
		super(mapa,x,y);
		nombre = nom;
		vidaDelJugador= 100;
		imagen[0] = new ImageIcon(this.getClass().getResource("/imagenes/gokuPosInicial.gif"));
	}
	
	/**
	 * Modela movimiento del jugador, solo podra moverse en la columna 0
	 * Responsabilidad de la clase cliente, verificar que el jugador no este muerto.
	 */
	public void mover(int direccion) {
		try {
			Celda celdaJugador = this.getCelda();
			Mapa mapa = celdaJugador.getMapa();
			LinkedList<Celda> vecinas = mapa.getVecinas(celdaJugador);
			//System.out.println("SIZE VECINAS "+vecinas.size());
			//System.out.println(celdaJugador.getMisGameObject().size());
			
			if(1 == direccion) { //EL 1 ES PARA TESTEAR CAMBIENLO POR KeyEvent.VK_UP 
				Celda celdaSuperior =vecinas.getFirst();
				celdaSuperior.agregarGameObject(this);
				celdaJugador.eliminarGameObject(this);
				//System.out.println("Luego de mover al jugador hacia arriba la celda anterior tiene "+celdaJugador.getMisGameObject().size()+" gameobjects");
				celdaJugador = celdaSuperior;
				System.out.println(nombre+" se movío a la celda : ("+celdaJugador.getX()+","+celdaJugador.getY()+")");
				System.out.println("El jugador "+nombre+" se movió hacia arriba");
			}

			if(TECLA_ABAJO == direccion) {
				Celda celdaInferior =vecinas.getLast();
				celdaInferior.agregarGameObject(this);
				celdaJugador.eliminarGameObject(this);
				celdaJugador = celdaInferior;
				System.out.println("El jugador "+nombre+" se movió hacia abajo");
			}
			
		}catch(Exception w) {
			w.printStackTrace();
		}
		
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
	


