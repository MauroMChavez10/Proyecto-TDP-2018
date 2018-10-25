package personajes;

public class ColisionadorJugador extends Colisionador {
	private Jugador jugador;
	
	public ColisionadorJugador(Jugador j) {
		jugador = j;
		
	}
	
	public void VisitConcreteElementA(Jugador j) {
		// no puedo colisionar con otro jugador.	
	}

	//hay un enemigo que choco con el jugador en este caso 
	public void VisitConcreteElementB(Enemigo e) {
		jugador.reducirVida(e);
	}

	@Override
	public void VisitConcreteElementC(Disparo d) {
		
		
	}

}
