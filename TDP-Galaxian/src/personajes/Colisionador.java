package personajes;

public abstract class Colisionador {
	
	public abstract void VisitConcreteElementA(Jugador j);
	
	public abstract void VisitConcreteElementB(Enemigo e);
	
	public abstract void VisitConcreteElementC(Disparo d);
	
}
