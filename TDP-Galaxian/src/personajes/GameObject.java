package personajes;

import juego.*;
import mapa.Celda;
import javax.swing.JLabel;

import graficos.*;

public abstract class GameObject {

	private int vida;
	private static final int width = 40; 
	private static final int height = 80;
	private Celda posicion; // cambiarlo en el diagrama uml 
	private GameObjectGrafico grafico;
	//private GameObjectGrafico graficoEnemigo;
	
	protected GameObject(Juego juego, Celda celda) {// LE PUSE UN GAMEOBJECT GRAFICO SINO EN EL GETGRAFICO DE MAS ABAJO MANDO MENSAJE A UN NULO
		
		if(celda.getX() == 0) { //SOLO EL JUGADOR COMIENZA EN LA COLUMNA 0 
			grafico = new JugadorGrafico(10,celda.getX(),celda.getY());
		}else {
			grafico = new EnemigoGrafico(15,celda.getX(),celda.getY());
		}
		System.out.println("Estoy en constructor gameobject");
		
	}
	
	public void setPosicion(Celda c) { //PONER LUEGO SET..ATRIBUTO 
		posicion=c;
	}
	
	
	public abstract int getVida();
	
	public abstract void mover() ;
	
	public abstract void mover (int direccion);
	
	public abstract void destruir();
	
	public Celda getCelda() {
		return posicion;
	}
	
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setGameObjectGrafico(GameObjectGrafico g) {
		grafico = g;
	}
	
	public GameObjectGrafico getGameObjectGrafico() {
		return grafico;
	}
	public JLabel getGrafico() {
		return grafico.getGrafico();
	}
	
	//public JLabel getGraficoEnemigo() {
		//return graficoEnemigo.getGrafico();
	//}
}

