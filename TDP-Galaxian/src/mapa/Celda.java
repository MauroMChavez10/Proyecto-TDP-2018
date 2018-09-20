package mapa;
import java.util.Collection;
import java.util.LinkedList;

import personajes.*;
public class Celda {
	
	private int x;
	private int y;
	private Mapa miMapa;
	private Collection<GameObject> misGameObject;

	public Celda(int x, int y) {
		this.x=x;
		this.y=y;
		misGameObject = new LinkedList<GameObject>();
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
	
	/**
	 * Este método retornara las celdas vecinas, SOLAMENTE LA DE ARRIBA Y LA DE ABAJO
	 * @return Un arreglo de 2 componentes 
	 */
	public Celda[] getVecinas(int posX,int posY) {
		Celda arregloCeldas[] = new Celda[3]; // COMO MUCHO PUEDE HABER 4 CELDAS VECINAS.GUARDA SI SE LLENA 
		Celda celdaDeArriba;
		Celda celdaDeAbajo;
		try {
				if(posX==0 && posY>=0 && y<miMapa.getFila()) { // TODA ESTA CONDICION PARA QUE NO SE PASE 
					celdaDeArriba = miMapa.getCelda(posX,posY+1);
					celdaDeAbajo = miMapa.getCelda(posX,posY-1);
					arregloCeldas[0]= celdaDeArriba;
					arregloCeldas[1]= celdaDeAbajo;
				}
		}catch(Exception w) {
			w.printStackTrace();
		}
		return arregloCeldas;
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
	
	
	
	
}
