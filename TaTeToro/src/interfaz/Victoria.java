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

import Logica.Juego;

import javax.swing.SwingConstants;

public class Victoria {

	private JFrame frame;


	public Victoria(Juego juego,Imagenes imagenes) {
		initialize(juego,imagenes);
	}

	
	private void initialize(Juego juego,Imagenes imagenes) {
		frame = new JFrame();
		frame.setBounds(680, 130, 600, 700);
		frame.setUndecorated(true); //borra la barra arriba
		
		frame.getContentPane().setBackground(Color.decode("#93e9ef")); //COLOR DE FONDO
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		//---------------Inicializacion de label y botones-----------------------------
		JLabel lbLNombreGanador = new JLabel("");
		JLabel lbLSombraNombreGanador = new JLabel("");
		JLabel lblImagenGanador = new JLabel("");
		JLabel lblGanador = new JLabel("");
		JLabel lblTurnos = new JLabel("");
		JLabel lblTurnoSombra = new JLabel("Turnos Jugados: 0");
		JButton btnSalir = new JButton("");
		btnSalir.setIcon(imagenes.botonSalir);
		JButton btnVolverAJugar = new JButton("");
		JLabel lblFondo = new JLabel("");
		
		//--------------Creacion de label y botones--------------------------------------
		
		lbLNombreGanador.setFont(PantallaDeJuego.getFont());
		lbLNombreGanador.setBounds(307, 219, 194, 55);
		frame.getContentPane().add(lbLNombreGanador);
		
		//-------------------------------------------------------------------------------
		
		lbLSombraNombreGanador.setForeground(new Color(255, 255, 255));
		lbLSombraNombreGanador.setFont(PantallaDeJuego.getFont());
		lbLSombraNombreGanador.setBounds(309, 220, 194, 55);
		frame.getContentPane().add(lbLSombraNombreGanador);
		
		//-------------------------------------------------------------------------------
		
		lblImagenGanador.setBorder(new LineBorder(Color.WHITE, 2));
		lblImagenGanador.setBounds(113, 153, 150, 156);
		frame.getContentPane().add(lblImagenGanador);
		if(imagenes.ImagenJ1 != null && juego.getTurno()=='X') {
			ImagenDelGanador1(imagenes, juego, lblImagenGanador, lbLNombreGanador, lbLSombraNombreGanador,lblGanador);
		}
		
		if(imagenes.ImagenJ2 != null && juego.getTurno()=='O') {
			ImagenDelGanador2(imagenes, juego, lblImagenGanador, lbLNombreGanador, lbLSombraNombreGanador,lblGanador);	
		}
		
		//-------------------------------------------------------------------------------
		
		lblGanador.setHorizontalAlignment(SwingConstants.CENTER);
		lblGanador.setBounds(187, 57, 240, 55);
		frame.getContentPane().add(lblGanador);
		
		//-------------------------------------------------------------------------------
		
		lblTurnos.setBounds(187, 368, 228, 55);
		frame.getContentPane().add(lblTurnos);
		lblTurnos.setFont(PantallaDeJuego.getFont()); //DE MOMENTO ESTA STATIC
		lblTurnos.setText("Turnos Jugados: " + juego.getNdeTurnos());
		
		//-------------------------------------------------------------------------------
		
		lblTurnoSombra.setForeground(new Color(255, 255, 255));
		lblTurnoSombra.setBounds(189, 369, 228, 55);
		frame.getContentPane().add(lblTurnoSombra);
		lblTurnoSombra.setFont(PantallaDeJuego.getFont()); //DE MOMENTO ESTA STATIC
		lblTurnoSombra.setText("Turnos Jugados: " + juego.getNdeTurnos());
		//-------------------------------------------------------------------------------
		
		btnSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnSalir.setBounds(445, 645, 131, 33);
		frame.getContentPane().add(btnSalir);
		
		//-------------------------------------------------------------------------------
		
		btnVolverAJugar.setIcon(imagenes.botonVolverAJugar);
		btnVolverAJugar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnVolverAJugar.setBounds(217, 486, 150, 55);
		frame.getContentPane().add(btnVolverAJugar);
		
		//-------------------------------------------------------------------------------
		
		lblFondo.setIcon(imagenes.fondoTablero);
		lblFondo.setBounds(0, 0, 600, 689);
		frame.getContentPane().add(lblFondo);
		
		//------------------Acciones Botones---------------------------------------------
		
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		//-------------------------------------------------------------------------------
		
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
	
	//------------------Metodos Auxiliares----------------------------------
	
	private void ImagenDelGanador1(Imagenes imagenes,Juego juego,JLabel label,JLabel NombreGanador , JLabel SombraNombreGanador,JLabel lblGanador) {
	
		lblGanador.setIcon(imagenes.ganadorX);
		NombreGanador.setText(Juego.getJugador1());
		SombraNombreGanador.setText(Juego.getJugador1());
		Icon icono = new ImageIcon(imagenes.ImagenJ1.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icono);
	
	
	}
	
	private void ImagenDelGanador2(Imagenes imagenes,Juego juego,JLabel label,JLabel NombreGanador , JLabel SombraNombreGanador,JLabel lblGanador) {
		
		lblGanador.setIcon(imagenes.ganadorO);
		NombreGanador.setText(Juego.getJugador2());
		SombraNombreGanador.setText(Juego.getJugador2());
		Icon icono = new ImageIcon(imagenes.ImagenJ2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icono);
	
	}
	
	public JFrame getFrame() {
		return frame;
	}
}