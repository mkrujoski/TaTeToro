package interfaz;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class Menu {

	private JFrame frame;
	private Imagenes imagenes;
	private PantallaDeJuego pantallaTablero;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		imagenes = new Imagenes();
		
		pantallaTablero = new PantallaDeJuego();
		
		frame.setBounds(680, 130, 600, 700);
		
		frame.setUndecorated(true); //borra la barra arriba
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JButton btnJugar = new JButton("");
		btnJugar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJugar.setIcon(imagenes.botonJugar);
		//btnJugar.setIcon(Imagenes.botonJugar);
		btnJugar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnJugar.setBounds(234, 333, 131, 33);
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pantallaTablero.getFrame().setVisible(true);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnJugar);
		
		JButton btnSalir = new JButton("");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //DE MOMENTO, CIERRA LA VENTANA POR COMPLETO
													//ACA AGREGAR EL INTERNAL FRAME 
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); 
			}
		});

		
		btnSalir.setIcon(imagenes.botonSalir);
		//btnSalir.setIcon(Imagenes.botonSalir);
		btnSalir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnSalir.setBounds(234, 455, 131, 33);
		frame.getContentPane().add(btnSalir);
		
		JButton btnReglas = new JButton("");
		btnReglas.setIcon(imagenes.botonReglas);
		//btnReglas.setIcon(Imagenes.botonReglas);
		btnReglas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnReglas.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		btnReglas.setBounds(234, 393, 131, 33);
		frame.getContentPane().add(btnReglas);
		
		JLabel lblRecuadroBackground = new JLabel(""); //RECUADRO FONDO
		lblRecuadroBackground.setIcon(imagenes.recuadroBackgroundMenu);
		//lblRecuadroBackground.setIcon(Imagenes.recuadroBackgroundMenu);
		lblRecuadroBackground.setBounds(185, 276, 228, 263);
		frame.getContentPane().add(lblRecuadroBackground);
		
		JLabel lblBackground = new JLabel(""); //FONDO
		lblBackground.setBounds(0, 0, 600, 700);
		//NO BORRAR ESTA LINEA HASTA EL FINAL DEL TP
		//lblBackground.setIcon(new ImageIcon(Menu.class.getResource("/imagenesDelFondo/gifBackground.gif")));
		lblBackground.setIcon(imagenes.backgroundMenu);
		//lblBackground.setIcon(Imagenes.backgroundMenu);
		frame.getContentPane().add(lblBackground);
		
		
	
		
		
		
	}
}
