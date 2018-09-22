package mapa;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.LinkedList;

import personajes.*;
public class Celda {
	
	
	private static final int LEFT = KeyEvent.VK_LEFT;
	private static final int RIGHT = KeyEvent.VK_RIGHT;
	private static final int UP = KeyEvent.VK_UP;
	private static final int DOWN = KeyEvent.VK_DOWN;
	private int x;
	private int y;
	private Collection<GameObject> misGameObject;
	private Mapa mapa ;

	public Celda(Mapa m,int x, int y) {
		this.x=x;
		this.y=y;
		misGameObject = new LinkedList<GameObject>();
		mapa = m;
	}

	/**
	 * Este método inserta un GameObject en la colleción.
	 * Es responsabilidad del juego sumar un elemento nuevo en el mapa.
	 * @param g GameObject solo puede ser un personaje o un objeto
	 */
	public void agregarGameObject(GameObject g) {
		misGameObject.add(g);
	}
	
	/**
	 * Este método elimina un GameObject en la colleción. 
	 * Es responsabilidad del juego decrementar la cantidad de gameobject.
	 * @param g GameObject solo puede ser un personaje o un objeto
	 */
	public void eliminarGameObject(GameObject g) {
		try {
			if(misGameObject.size()>0) {
				misGameObject.remove(g);
			}
		}catch(Exception w) {
			w.printStackTrace();
		}
	}
	

	public Celda getVecina(int dir){
		switch (dir){
			case UP :
				return this.mapa.getCelda(x, y - 1);
			case DOWN :
				return this.mapa.getCelda(x, y + 1);
			case LEFT :
				return this.mapa.getCelda(x - 1, y);
			case RIGHT :
				return this.mapa.getCelda(x + 1, y);
		}
		return null;
	}
	
	
	public void setX(int posx) {
		x=posx;
		
	}
	
	public void setY(int posy) {
		y=posy;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean esNula() {
		boolean salida=false;
	try {	
		if (this==null) {
				System.out.println("La celda es nula");
				salida=true;
			}else {
				System.out.println("La celda no es nula");
			}
		}catch(Exception w) {
			w.printStackTrace();
		}
	return salida;
	}
	
	public Mapa getMapa() {
		return mapa;
	}
	
	public Collection<GameObject> getMisGameObject(){
		return misGameObject;
	}
	
	
	
}
