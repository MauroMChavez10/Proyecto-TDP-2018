package personajes;

import mapa.Celda;
import graficos.*;
public abstract class GameObject {

	private int vida;
	private ObjetoGrafico grafico;
	private Celda miCelda;
	
	public void setPosicion(Celda c) {
		miCelda=c;
	}
	
	public ObjetoGrafico getObjetoGrafico() {
		return grafico;
	}
	
	public int getVida() {
		return vida;
	}
	
	public abstract void mover() ;
	
	public abstract void mover (int direccion);
	
	public void destruir() {}
	
	public Celda getCelda() {
		return miCelda;
	}
	
	}

