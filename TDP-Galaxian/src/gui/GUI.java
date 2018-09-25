package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import juego.Juego;
import personajes.*;
import mapa.*;

public class GUI extends JFrame {

	public Image imagenFondo;
	public URL fondo;
	private Juego juego;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		juego = new Juego(this);
		
		this.setBounds(0, 0, 1000, 650);
		this.setLocationRelativeTo(null);
		fondo = this.getClass().getResource("/imagenes/fondoMapaCielo.png");
		imagenFondo = new ImageIcon(fondo).getImage();
		
		Container contenedor = getContentPane(); 
		contenedor.add(panel);
		
		/** INSERTO EL JUGADOR EN EL MAPA */
		juego.insertarJugador();
		
		//System.out.println(goku.getNombre());
		//Celda celdaJugador = goku.getCelda();
		//System.out.println(celdaJugador.getX());
	}
	
	public JPanel panel = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
		}
	};
	
}
