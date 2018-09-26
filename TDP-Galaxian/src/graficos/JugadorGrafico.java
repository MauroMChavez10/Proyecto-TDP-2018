package graficos;

import javax.swing.ImageIcon;

public class JugadorGrafico extends GameObjectGrafico{

	public JugadorGrafico(int velocidad,int x, int y) {
		super(velocidad,x,y);
		
		for(int i = 0; i<image.length; i++)
			image[i] = new ImageIcon(this.getClass().getResource("/imagenes/gokuPosInicial.gif"));
	}
}
