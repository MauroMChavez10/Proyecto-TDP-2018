package personajes;
import juego.*;
import mapa.*;
/**
 * 
 * El Enemigo deberia estar mas acoplado al juego.
 *
 */

public	abstract  class Enemigo extends Personaje {
	private Juego juego;
	private int velocidad;
	private String nombre;
	private int posEnemigoXInicial; //LOS ENEMIGOS COMIENZAN EN LA ULTIMA COLUMNA
	private int posEnemigoYInicial;
	
	protected Enemigo(Juego eljuego,int velEnemigo,String nom,Celda c) {
		super(eljuego,c);
		juego = eljuego;
		velocidad= velEnemigo;
		nombre = nom;
		posEnemigoXInicial = eljuego.getMapa().getColumnas();
		posEnemigoYInicial = eljuego.getMapa().getFilas();
		
	}
	
	public  int getPosEnemigoXInicial() {
		return posEnemigoXInicial;
	} 
	
	public  int getPosEnemigoYInicial() {
		return posEnemigoYInicial;
	}
}
