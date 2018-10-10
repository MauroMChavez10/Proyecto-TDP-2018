package graficos;

import javax.swing.ImageIcon;

public class EnemigoGrafico extends GameObjectGrafico {

	public  EnemigoGrafico(int velEnemigo,int x,int y) {
		super(velEnemigo,x,y);
		
		//Icon [] im = this.getImage();
		System.out.println("pase por enemigo Grafico");
		image[0] = new ImageIcon(this.getClass().getResource("/imagenes/vegeta.gif"));
		
	}
}
