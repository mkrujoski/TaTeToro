package interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import codigoCliente.Juego;

public class Victoria {

	private JFrame frame;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Victoria(Juego juego,Imagenes imagenes) {
		initialize(juego,imagenes);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Juego juego,Imagenes imagenes) {
		frame = new JFrame();
		frame.setBounds(680, 130, 600, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel imagen = new JLabel("");
		imagen.setBorder(new LineBorder(Color.WHITE, 2));
		imagen.setBounds(47, 62, 238, 197);
		frame.getContentPane().add(imagen);
		
	
		JLabel Ganador = new JLabel("");
		Ganador.setBounds(336, 62, 238, 55);
		frame.getContentPane().add(Ganador);
		
		if(imagenes.ImagenJ1 != null && juego.getTurno()=='X') {
			Ganador.setText(Juego.getJugador1());
			Icon icono = new ImageIcon(imagenes.ImagenJ1.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
			imagen.setIcon(icono);
			
		}
		
		if(imagenes.ImagenJ2 != null && juego.getTurno()=='O') {
			Ganador.setText(Juego.getJugador2());
			Icon icono = new ImageIcon(imagenes.ImagenJ2.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
			imagen.setIcon(icono);
			
		}
		
		JLabel Turnos = new JLabel("");
		Turnos.setBounds(346, 216, 228, 55);
		frame.getContentPane().add(Turnos);
		
		
		
		Turnos.setText("Turnos Jugados = " + juego.getNdeTurnos());
		
		JButton boton_salir = new JButton("Salir");
		
		boton_salir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		boton_salir.setBounds(414, 457, 160, 70);
		frame.getContentPane().add(boton_salir);
		
		JButton boton_VolverJugar = new JButton("Volver a Jugar");
		
		boton_VolverJugar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		boton_VolverJugar.setBounds(65, 457, 160, 70);
		frame.getContentPane().add(boton_VolverJugar);
		
		
	
		
		boton_salir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		
		boton_VolverJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PantallaDeJuego tablero = new PantallaDeJuego(juego,imagenes);
				tablero.getFrame().setVisible(true);
				juego.vaciarJugadas();
				
				frame.dispose();
			}
		});		
		
			
	
	
	}
	
	

	public JFrame getFrame() {
		return frame;
	}
}