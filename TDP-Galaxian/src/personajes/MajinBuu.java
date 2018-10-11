package personajes;
import javax.swing.ImageIcon;

import graficos.EnemigoGrafico;
import graficos.GameObjectGrafico;
import juego.*;
import mapa.Celda;

public class MajinBuu extends EnemigoKamikaze{
	
	public MajinBuu(Juego juego, int velMajinBu,String nombre,Celda celda) {
		super(juego,velMajinBu,nombre,celda);
		//Celda celdaMajinBuu = new Celda(juego.getMapa(),this.getPosEnemigoXInicial(),this.getPosEnemigoXInicial());
		this.setPosicion(celda);
		
		
		//this.setGameObjectGrafico(new EnemigoGrafico(30,this.getCelda().getX(),this.getCelda().getY()));
		/**
		int filaAInsertar = juego.getMapa().getFilas();
		int columnaAInsertar = juego.getMapa().getColumnas();
		Celda celdaMajinBuu = new Celda(juego.getMapa(),filaAInsertar,columnaAInsertar/2);
		this.setPosicion(celdaMajinBuu);
		//imagen[1] = new ImageIcon(this.getClass().getResource("imagenes/majinBuu.gif"));
		*/
	}
}

