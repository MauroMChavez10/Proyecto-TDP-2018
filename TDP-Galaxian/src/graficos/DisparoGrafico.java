package graficos;

import javax.swing.ImageIcon;

public class DisparoGrafico extends GameObjectGrafico {

	public DisparoGrafico(int velocidad,int x, int y) {
		super(velocidad,x,y);
		
		image[0] = new ImageIcon(this.getClass().getResource("/imagenes/gokuPosInicial.gif")); //CAMBIAR IMAGEN
	}
}
