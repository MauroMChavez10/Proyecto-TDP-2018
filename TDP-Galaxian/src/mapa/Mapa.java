package mapa;
import java.util.LinkedList;

import juego.*;
public class Mapa {

	private Celda[][] matrizCelda;
	private int filas, columnas;
	
	
	public Mapa(int f, int c,Juego juego) { // ES NECESARIO PARAMETRO JUEGO ?
			this.filas=f;
			this.columnas=c;
			matrizCelda = new Celda[filas][columnas];
					for(int i = 0; i<filas;i++) {
						for(int j = 0; j<columnas; j++) {
							matrizCelda[i][j] = new Celda(this,i,j);
						}
					}	
	}

	public int getFilas() {
		return filas;
	}
	
	public int getColumnas(){
		return columnas;
	}
	
	
	public Celda getCelda(int x, int y) {
		Celda salida=null ;
		try {
			
			if(matrizCelda[x][y]!= null) {
				salida = matrizCelda[x][y];
			}
		
		}catch(Exception w) {
			w.printStackTrace();
		}
		return salida;
	}

 /**	
	public LinkedList<Celda> getVecinas(Celda c) {
		LinkedList<Celda> vecinas =  new LinkedList<Celda>();
		Celda celdaSuperior = null;
		Celda celdaInferior = null;
		int x = c.getX();
		int y = c.getY();
		try {
			if(c!= null) {
				if(x >= 0 && x< filas && y == 0) {
					celdaSuperior = getCelda(x-1,y);
					celdaInferior = getCelda(x+1,y);
					vecinas.add(celdaSuperior);
					vecinas.add(celdaInferior);
				}else {
					if(x == 0) { // SOLO PUEDO PEDIR CELDA DE ABAJO PORQUE ME PASO
						celdaInferior = getCelda(x+1,y);
						vecinas.add(celdaInferior);
					}else {
						if(x == filas) { //SOLO PUEDO PEDIR CELDA DE ARRIBA PORQUE ME PASO
							celdaSuperior = getCelda(x-1,y);
							vecinas.add(celdaSuperior);
						}
					}
				}
			}

		}catch(Exception w) {
			w.printStackTrace();
		}
		return vecinas;
	}

	*/
	
}
