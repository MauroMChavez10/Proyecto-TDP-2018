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
	
	public void mover() {}
	
	public void destruir() {}
}
