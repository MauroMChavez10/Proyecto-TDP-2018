package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import juego.Juego;
import personajes.*;
import mapa.*;

public class GUI extends JFrame {
	JLabel puntaje;
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
					// controlar si los personajes estan vivos .. mientras este vivo hago el repaint
					//sino esta viva sacarlo de la lista de entidades e igual hacer el repaint 
					
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
		this.setBounds(0, 0, 1100, 700); // 1150 y 700 estaba DEBE ESTAR EN LA PRIMER LINEA EL HEIGHT AND WIDTH DE LA GUI SINO NO ANDA
		
		juego = new Juego(this);
		
		this.setLocationRelativeTo(null);
		fondo = this.getClass().getResource("/imagenes/fondoMapaMontañas.png");
		imagenFondo = new ImageIcon(fondo).getImage();
		
		Container contenedor = getContentPane(); 
		contenedor.add(panel);
		
		this.setResizable(false); // NO SE PUEDE CAMBIAR EL TAMAÑO DEL "MARCO" JFRAME
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public JPanel panel = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
		}
	};
	
}
