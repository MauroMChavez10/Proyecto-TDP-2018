package personajes;

import mapa.Celda;
import javax.swing.JLabel;

import graficos.*;

public abstract class GameObject {

	private int vida;
	private static final int width = 40; // ANTES ESTABA EN 42 POR QUE ? NICO
	private static final int height = 80;
	private Celda miCelda;
	// esta variable se estaba chocando protected Icon image[];
	private GameObjectGrafico grafico;
	private GameObjectGrafico graficoEnemigo;
	
	protected GameObject() { // LE PUSE UN GAMEOBJECT GRAFICO SINO EN EL GETGRAFICO DE MAS ABAJO MANDO MENSAJE A UN NULO
		//grafico = new JugadorGrafico(10,2,2); // esto para mi esta mal no lo tendria que hacer cada clase concreta ?
		//graficoEnemigo= new EnemigoGrafico(10,10,10); // esta mal porque no se si lo tiene que crear gameobject, sino cada clase concreta..
	}
	
	public void setPosicion(Celda c) { //PONER LUEGO SET..ATRIBUTO 
		miCelda=c;
	}
	
	
	public abstract int getVida();
	
	public abstract void mover() ;
	
	public abstract void mover (int direccion);
	
	public abstract void destruir();
	
	public Celda getCelda() {
		return miCelda;
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
	public void getGrafico() {
		System.out.println( grafico.getGrafico());
	}
	
}

