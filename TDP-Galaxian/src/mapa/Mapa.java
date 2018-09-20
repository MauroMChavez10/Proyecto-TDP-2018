package mapa;
import juego.*;
public class Mapa {

	private Celda[][] matrizCelda;
	private int fila, columna;
	
	
	public Mapa(int fila, int columna, Juego juego) {
		this.fila=fila;
		this.columna=columna;
	}
	
	public int getFila() {
		return fila;
	}
	
	public int getColumna(){
		return columna;
	}
	
	public boolean celdaEsNula(int x,int y) {
		return (matrizCelda[x][y] == null);
	}
	
	public Celda getCelda(int x, int y) {
		Celda salida=null ;
		try {
			
			if(!celdaEsNula(x,y)) {
				salida = matrizCelda[x][y];
			}
		
		}catch(Exception w) {
			w.printStackTrace();
		}
		return salida;
	}
	
}
