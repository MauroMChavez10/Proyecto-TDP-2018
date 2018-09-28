package juego;


import javax.swing.JPanel;

import gui.*;
import personajes.*;
import mapa.Celda;
import mapa.Mapa;
/**
 * 
 * EL JUEGO SABE QUE ESTA MOVIENDO GAMEOBJECT
 *	MOVER, LUEGO COLISIONAR .
 *	
 */
public class Juego {

	
	private char tecla;
	private JPanel panelMapa;
	private Mapa mapaCombate;
	private int cantidadEnemigos = 3;
	private static final  int height=40; // este atributo no es necesario
	private static final int width=80;// este atributo no es necesario
	private Jugador jugador;
	private Enemigo enemigo;
	private int puntaje;
	private int tamanioCelda=110; //ALTO DE GOKU = 80 Y LA CELDA DE DIFERENCIA TIENE 30
	private int posJugadorYMAX;
	private static final int posJugadorX = 0; //EL JUGADOR SOLO ESTA EN LA PRIMER COLUMNA
	private int posJugadorY;
	
	public Juego(GUI gui) {
		//MIRE LO QUE HIZO JUAN,Y TOME EN CUENTA EL TAMAÑO DE GOKU PARA VER EL MAPA Y SUS DIMENSIONES. LUEGO AFECTARA A LAS CELDAS
		mapaCombate = new Mapa((gui.getWidth()-110) / tamanioCelda,(gui.getHeight()-220)/tamanioCelda,this);

		posJugadorYMAX = gui.getHeight()-tamanioCelda;
		System.out.println("posJugadorYMAX : "+posJugadorYMAX);
		puntaje = 0 ;
		
	
		insertarJugador();
		jugador.getGrafico();
		//gui.add(); // parametro jugador.getGrafico()
		
		insertarEnemigo();
		enemigo.getGrafico();
		//gui.add(enemigo.getGrafico()); 
		
		//moverJugador(); // tiene problemas en el mover de jugador, no se conectar parte logica y grafica
		//gui.add(jugador.getGrafico());
		// CUANDO TERMINO DE MOVER A TODAS LAS ENTIDADES HAY QUE LLAMAR A GUI.REPAINT() PARA QUE ACTUALICE LAS ENTIDADES
		
	}
	
	
	public void insertarJugador() {
		
		Celda celdaJugador = this.mapaCombate.getCelda(0, 0);
		jugador = new Jugador(this,"Goku",celdaJugador);
		celdaJugador.agregarGameObject(jugador);
	}
	
	public void insertarEnemigo() {
		int velocidadEnemigo = 10;
		Celda celdaMajinBuu = this.mapaCombate.getCelda(1, 1);
		Enemigo enemigo = new MajinBuu(this,velocidadEnemigo,"MajinBuu",celdaMajinBuu); 
		//Celda celdaMajinBuu = enemigo.getCelda();
		System.out.println("Celda MajinBuu : ("+celdaMajinBuu.getX()+","+celdaMajinBuu.getY()+")");
		celdaMajinBuu.agregarGameObject(enemigo);
	}
	
	
	
	public void moverJugador() {
		jugador.mover(tecla);
	}
	public Mapa getMapa() {
		return mapaCombate;
	}
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public int getPuntaje() {
		return puntaje;
		}
	
	public int getPosJugadorYMAX() {
		return posJugadorYMAX;
	}
	
	public int getPosJugadorX() {
		return posJugadorX;
	}


}
	

