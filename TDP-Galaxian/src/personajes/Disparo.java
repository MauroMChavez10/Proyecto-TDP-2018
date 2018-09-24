package personajes;

public abstract class Disparo {
	
	private int fuerzaDisparo;
	/** 
	 * Metodo que se usará para el visitor
	 * ESTE METODO DIJO JUAN
	 * SE PUEDE TENER UN COLISIONADOR POR CADA CLASE DISTINTA PARA VER QUE CADA 
	 * MANERA DE CHOCAR ES DISTINTA, PERO MEJOR AUN.. SE PODRIA 
	 * GENERALIZ LA FORMA DE CHOCAR. 
	 * COLISIONADOR POWERUP, NO NECESITO TENER UN COLISIONADOR POR CADA POWERU DISTINTO
	 * 
	 */
	
	public Disparo(int fuerza) {
		fuerzaDisparo = fuerza;
	}

	/**
		public void serChocado(Collider c )
			c.chocarJugador(this);
		}
	*/
	
	public abstract void disparoJugador() ;
	
	public abstract void disparoEnemigo();

}

