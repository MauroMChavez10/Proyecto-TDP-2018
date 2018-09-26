package graficos;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class GameObjectGrafico {

	protected JLabel grafico;
	protected Icon image [];
	protected int width = 105;
	protected int height = 105; // el valor del tamaño de mi celda? 
	protected int velocidad;
	protected Point pos ;
	
	protected GameObjectGrafico(int velocidad,int x, int y) {
		pos = new Point(x*this.width,y*this.height);
		this.velocidad = velocidad;
		
		image = new Icon[4];		
	}
}
