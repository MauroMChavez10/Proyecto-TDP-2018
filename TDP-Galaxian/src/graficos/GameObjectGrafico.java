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
			//System.out.println("alto de etiqueta : "+grafico.getHeight()+" ancho de etiqueta : "+grafico.getWidth());
		}
			//}
		return grafico;
	}
	
	
	
	protected void changeIcon(int dir){
		int direccion = -1;
		
		switch (dir){
			case Celda.UP : 
				direccion = 0;
				break;
			case Celda.DOWN : 
				direccion = 1;
				break;
			case Celda.LEFT : 
				direccion = 2;
				break;
			case Celda.RIGHT : 
				direccion = 3;
				break;
		}
		
		this.grafico.setIcon(this.image[direccion]);
	}
	
	
		
		public void mover(int dir){
			if(this.grafico != null){
				this.changeIcon(dir);
				
				try {
					switch (dir){
						case Celda.UP : // Arriba
							for(int i = 0; i < this.height; i += this.velocidad){
								this.grafico.setBounds(this.pos.x, this.pos.y -= this.velocidad, width, height);
								Thread.sleep(100);
							}
							break;
						case Celda.DOWN : // Abajo
							for(int i = 0; i < this.height; i += this.velocidad){
								this.grafico.setBounds(this.pos.x, this.pos.y += this.velocidad, width, height);
								Thread.sleep(100);
							}
							break;
						case Celda.RIGHT : // Derecha
							for(int i = 0; i < this.width; i += this.velocidad){
								this.grafico.setBounds(this.pos.x += this.velocidad, this.pos.y, width, height);
								Thread.sleep(100);
							}
							break;
						case Celda.LEFT : // Derecha
							for(int i = 0; i < this.width; i += this.velocidad){
								this.grafico.setBounds(this.pos.x -= this.velocidad, this.pos.y, width, height);
								Thread.sleep(100);
							}
							break;
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	

