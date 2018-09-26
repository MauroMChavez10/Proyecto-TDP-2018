package personajes;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import graficos.*;
import juego.*;
import mapa.Celda;

public class Jugador extends Personaje{
	//Atributos de clase
	private static final char TECLA_ARRIBA = KeyEvent.VK_UP;
	private static final char TECLA_ABAJO = KeyEvent.VK_DOWN;
	private int vidaDelJugador; 
	private String nombre=""; 
	private int velocidadJugador;

	public Jugador(Juego juego,String nom) {
		super();
		Celda celdaJugador = new Celda(juego.getMapa(),juego.getPosJugadorX(),(juego.getPosJugadorYMAX())/2);
		this.setPosicion(celdaJugador);
		//System.out.println(celdaJugador.getX());
		nombre = nom;
		vidaDelJugador= 100;
		imagen[0] = new ImageIcon(this.getClass().getResource("/imagenes/gokuPosInicial.gif"));
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
	


