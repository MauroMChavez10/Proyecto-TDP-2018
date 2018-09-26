package personajes;

import mapa.Celda;
import graficos.*;
public abstract class GameObject {

	private int vida;
	private ObjetoGrafico grafico;
	private Celda miCelda;
	
	public void setPosicion(Celda c) { //PONER LUEGO SET..ATRIBUTO 
		miCelda=c;
	}
	
	public ObjetoGrafico getObjetoGrafico() {
		return grafico;
	}
	
	public abstract int getVida();
	
	public abstract void mover() ;
	
	public abstract void mover (int direccion);
	
	public abstract void destruir();
	
	public Celda getCelda() {
		return miCelda;
	}
	
	}

