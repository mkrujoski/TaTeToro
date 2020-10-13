package interfaz;

import java.awt.Color;
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

import logica.Juego;

import javax.swing.SwingConstants;

public class Victoria {

	private JFrame frame;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Victoria(Juego juego,HerramientasGraficas imagenes) {
		initialize(juego,imagenes);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Juego juego,HerramientasGraficas imagenes) {
		frame = new JFrame();
		frame.setBounds(680, 130, 600, 700);
		frame.setUndecorated(true); //borra la barra arriba
		
		frame.getContentPane().setBackground(Color.decode("#93e9ef")); //COLOR DE FONDO
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		JLabel lbLNombreGanador = new JLabel("");
		lbLNombreGanador.setFont(imagenes.getFont());
		lbLNombreGanador.setBounds(307, 219, 194, 55);
		frame.getContentPane().add(lbLNombreGanador);
		
		JLabel lbLSombraNombreGanador = new JLabel("");
		lbLSombraNombreGanador.setForeground(new Color(255, 255, 255));
		lbLSombraNombreGanador.setFont(null);
		lbLSombraNombreGanador.setFont(imagenes.getFont());
		lbLSombraNombreGanador.setBounds(309, 220, 194, 55);
		frame.getContentPane().add(lbLSombraNombreGanador);
		
		JLabel lblImagenGanador = new JLabel("");
		lblImagenGanador.setBorder(new LineBorder(Color.WHITE, 2));
		lblImagenGanador.setBounds(113, 153, 150, 156);
		frame.getContentPane().add(lblImagenGanador);
		
		JLabel lblGanador = new JLabel("");
		lblGanador.setHorizontalAlignment(SwingConstants.CENTER);
		lblGanador.setBounds(187, 57, 240, 55);
		frame.getContentPane().add(lblGanador);
		
		if(imagenes.ImagenJ1 != null && juego.getTurno()=='X') {
			lblGanador.setIcon(imagenes.ganadorX);
			lbLNombreGanador.setText(Juego.getJugador1());
			lbLSombraNombreGanador.setText(Juego.getJugador1());
			Icon icono = new ImageIcon(imagenes.ImagenJ1.getImage().getScaledInstance(lblImagenGanador.getWidth(), lblImagenGanador.getHeight(), Image.SCALE_DEFAULT));
			lblImagenGanador.setIcon(icono);
			
		}
		
		if(imagenes.ImagenJ2 != null && juego.getTurno()=='O') {
			lblGanador.setIcon(imagenes.ganadorO);
			lbLNombreGanador.setText(Juego.getJugador2());
			lbLSombraNombreGanador.setText(Juego.getJugador2());
			Icon icono = new ImageIcon(imagenes.ImagenJ2.getImage().getScaledInstance(lblImagenGanador.getWidth(), lblImagenGanador.getHeight(), Image.SCALE_DEFAULT));
			lblImagenGanador.setIcon(icono);
			
		}
		
		JLabel lblTurnos = new JLabel("");
		lblTurnos.setBounds(187, 368, 228, 55);
		frame.getContentPane().add(lblTurnos);
		
		
		lblTurnos.setFont(imagenes.getFont()); //DE MOMENTO ESTA STATIC
		lblTurnos.setText("Turnos Jugados: " + juego.getNdeTurnos());
		
		JLabel lblTurnoSombra = new JLabel("Turnos Jugados: 0");
		lblTurnoSombra.setForeground(new Color(255, 255, 255));
		lblTurnoSombra.setFont(null);
		lblTurnoSombra.setBounds(189, 369, 228, 55);
		frame.getContentPane().add(lblTurnoSombra);
		
		lblTurnoSombra.setFont(imagenes.getFont()); //DE MOMENTO ESTA STATIC
		lblTurnoSombra.setText("Turnos Jugados: " + juego.getNdeTurnos());
		
		JButton btnSalir = new JButton("");
		btnSalir.setIcon(imagenes.botonSalir);
		
		btnSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnSalir.setBounds(445, 645, 131, 33);
		frame.getContentPane().add(btnSalir);
		
		JButton btnVolverAJugar = new JButton("");
		btnVolverAJugar.setIcon(imagenes.botonVolverAJugar);
		
		btnVolverAJugar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnVolverAJugar.setBounds(217, 486, 150, 55);
		frame.getContentPane().add(btnVolverAJugar);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(imagenes.fondoTablero);

		lblFondo.setBounds(0, 0, 600, 689);
		frame.getContentPane().add(lblFondo);
		
		
		
		
	
		
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		
		btnVolverAJugar.addMouseListener(new MouseAdapter() {
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