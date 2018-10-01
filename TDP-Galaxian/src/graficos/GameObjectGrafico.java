package graficos;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;
import mapa.*;

public abstract class GameObjectGrafico {

	private JLabel grafico;
	private int width = 105;
	private int height = 105; // el valor del tamaño de mi celda? 
	private int velocidad;
	private Point pos ;
	protected Icon image[];
	private Celda celda;
	
	protected GameObjectGrafico(int velocidad,int x, int y) {
		System.out.println("x "+x+ "y "+y);
		pos = new Point(x*this.width,y*this.height);
		this.velocidad = velocidad;
		image = new Icon[4];	
		grafico = null;
	}


	public JLabel getGrafico() {
		//int i = 0;
		if(grafico == null) {
			System.out.println("Estoy en getGrafico() de GameObjectGrafico");
		
			//System.out.println("Entre");
			grafico = new JLabel(image[0]); // param image[0]
			
			/**
			if(i<image.length) {
				i++;
			}*/
			grafico.setBounds(pos.x,pos.y, width, height); //  USA POINT PORQUE SI PIDE DOUBLE COMO ARGUMENTO X E Y
			System.out.println("alto de etiqueta : "+grafico.getHeight()+" ancho de etiqueta : "+grafico.getWidth());
		}
			//}
		return grafico;
	}
	
	
	
}
