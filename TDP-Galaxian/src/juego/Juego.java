package juego;


import java.util.Random;

import javax.swing.JLabel;
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
	private int cantidadEnemigos;
	private static final  int height=40; // este atributo no es necesario
	private static final int width=80;// este atributo no es necesario
	private Jugador jugador;
	private Enemigo enemigo;
	private int puntaje;
	private int tamanioCelda=110; //ALTO DE GOKU = 80 Y LA CELDA DE DIFERENCIA TIENE 30
	private int posJugadorYMAX;
	private static final int posJugadorX = 0; //EL JUGADOR SOLO ESTA EN LA PRIMER COLUMNA
	private int posJugadorY;
	private int posXMAX;
	private int posYMaximo;
	private static final int posEnemigoXMAX=9;
	
	public Juego(GUI gui) {
		//MIRE LO QUE HIZO JUAN,Y TOME EN CUENTA EL TAMAÑO DE GOKU PARA VER EL MAPA Y SUS DIMENSIONES. LUEGO AFECTARA A LAS CELDAS
		mapaCombate = new Mapa(((gui.getHeight()-40)/tamanioCelda),(gui.getWidth()-110) / tamanioCelda,this); // PRIMER ARGUMENTO COLUMNAS, SEGUNDO FILAS
		// TENDRA 6 FILAS Y 9 COLUMNAS (gui.getWidth()-110) / tamanioCelda) filas /80 por los pixeles ?
		System.out.println("filas "+((gui.getHeight()-40)/tamanioCelda));
		System.out.println("columnas "+((gui.getWidth()-110)/tamanioCelda));
		cantidadEnemigos = mapaCombate.getFilas();
		//posXMAX= (gui.getWidth()- tamanioCelda);
		posJugadorYMAX = (gui.getHeight()-tamanioCelda);
		System.out.println("ancho mapa"+gui.getWidth());
		System.out.println("posJugadorYMAX : "+posJugadorYMAX);
		puntaje = 0 ;
		//posJugadorY = (mapaCombate.getFilas()/2);
		posJugadorY = ((gui.getHeight())/tamanioCelda)/2; //FALTARIA BAJARLO MAS PORQUE NO QUEDA EN LA MITAD.. 
		jugador = new Jugador(this,"Goku",new Celda(mapaCombate,posJugadorX,5)); //CREACION DE LOS JUGADORES ANTES DE PEDIRLES EL GRAFICO ACA
		//enemigo = new MajinBuu(this,10,"Majin",new Celda(mapaCombate,posEnemigoXMAX,posJugadorY));
		posYMaximo = 5;
		insertarJugador();
		gui.add( jugador.getGrafico());
		 
		int i = 0;
		while(i < mapaCombate.getFilas()) // ya que debo insertar todos los enemigos en los dos columnas completas del final 
		{	System.out.print(mapaCombate.getFilas());
			Celda celdaEnemigo = new Celda(mapaCombate,posEnemigoXMAX,i);
			enemigo = new MajinBuu(this,10,"Enemigo "+i+1,celdaEnemigo);
			insertarEnemigo();
			gui.add(enemigo.getGrafico()); 
			i++;
			
			if(i == mapaCombate.getFilas())
			{	
				for(int j= 0; j<mapaCombate.getFilas();j++)
				{	
				celdaEnemigo = new Celda(mapaCombate,posEnemigoXMAX-1,j);
				enemigo = new MajinBuu(this,10,"Enemigo "+i+1,celdaEnemigo);
				insertarEnemigo();
				gui.add(enemigo.getGrafico());
				}
			}
			
		}
		
		
		tecla = 'w';
		moverJugador();
		
		/**
		Random r  = new Random();
		Enemigo malo;
		for(int i = 0 ; i<cantidadEnemigos; i++) {
			int x = r.nextInt(this.mapaCombate.getColumnas());
			int y = r.nextInt(this.mapaCombate.getFilas());
			System.out.println("el valor de x es random es : "+x);
			System.out.println("El valor de y random es : "+y);
			//Celda c = mapaCombate.getCelda(x, y);
			if(y >= posYMaximo)
			{	
				y--;
			}else
			{
			if( x == posJugadorX)
				x = r.nextInt(this.mapaCombate.getColumnas());
			}
			
			malo = new MajinBuu(this,i+10,"Enemigo : + "+i+1,new Celda(mapaCombate,x,y));
			
			insertarEnemigo();
			
			//c.agregarGameObject(malo);
			
			gui.add(malo.getGrafico());
			
			
			
			
		}*/
		
		//moverJugador(); // tiene problemas en el mover de jugador, no se conectar parte logica y grafica
		// CUANDO TERMINO DE MOVER A TODAS LAS ENTIDADES HAY QUE LLAMAR A GUI.REPAINT() PARA QUE ACTUALICE LAS ENTIDADES
		
	}
	
	
	public void insertarJugador() {
		
		Celda celdaJugador = jugador.getCelda();
		//jugador = new Jugador(this,"Goku",celdaJugador);
		celdaJugador.agregarGameObject(jugador);
	}
	
	public void insertarEnemigo() {
		//int velocidadEnemigo = 10;
		Celda celdaMajinBuu = enemigo.getCelda();
		//Enemigo enemigo = new MajinBuu(this,velocidadEnemigo,"MajinBuu",celdaMajinBuu); 
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
	
	public Enemigo getEnemigo() {
		return enemigo;
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
	
	public int getPosXMAX() {
		return posXMAX;
	}

}
	

