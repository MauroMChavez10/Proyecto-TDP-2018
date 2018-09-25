package personajes;
import javax.swing.Icon;
import javax.swing.JLabel;


import mapa.*;

public abstract class Personaje extends GameObject{
	private int FuerzaImpacto;
	private Arma miArma;
	private String nombre ;
	private Celda miCelda;
	protected Icon imagen[]; //HAY PROBLEMAS SI LE PONGO PRIVATE NO ME COMPILA EN JUGADOR
	private static final int width = 42;
	private static final int height = 80;
	private JLabel grafico;
	
	/** La clase abstracta aunque no pueda ser instanciada puede tener constructor 
	 *  Este constructor sobrecarga al constructor sin parametros 
	 *  y ya no se puede usar ese
	 * 
	 */
	public Personaje(Mapa mapa,int x, int y) { // ES NECESARIO EL MAPA DE PARAMETRO ?
		super(x,y);
		miCelda = new Celda(mapa,x,y);
		imagen = new Icon[1];
		
	}
	
	//COMANDOS
	
	public JLabel getGrafico() {
		if(this.grafico == null) {
			this.grafico = new JLabel(imagen[0]);
			this.grafico.setBounds(miCelda.getX(),miCelda.getY(), width, height);
		}
		return this.grafico;
	}
	
	
	public void mover(int dir) {};
	
	//CONSULTAS 
	public int getFuerzaImpacto() {
		return FuerzaImpacto;
	}
	
	public void disparar() {}
	
}
