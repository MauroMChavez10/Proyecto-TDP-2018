package mapa;
import personajes.*;
public class Celda {
	
private int x;
private int y;

	public Celda(int posy, int posx) {
		x=posx;
		y=posy;
	}

	public void agregarGameObject(GameObject g) {
		
	}
	
	
	public void eliminarGameObject(GameObject g) {
		
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
