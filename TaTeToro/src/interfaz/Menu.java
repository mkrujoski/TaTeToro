package interfaz;

import java.awt.EventQueue;
//import java.awt.Window;
//import com.jgoodies.common.bean.Bean;
import javax.swing.JFrame;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.event.WindowEvent;
import javax.swing.JLabel;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;

import codigoCliente.Juego;
//import javax.swing.JTextPane;
//import java.awt.Canvas;
//import javax.swing.border.CompoundBorder;
//import javax.swing.border.EmptyBorder;

public class Menu {

	private JFrame frame;
	private Imagenes imagenes;

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
		
		Juego juego = new Juego();
		
		imagenes = new Imagenes();
		
		frame.setBounds(680, 130, 600, 700);
		
		frame.setUndecorated(true); //borra la barra arriba
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JButton btnJugar = new JButton("");
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Usuarios vent = new Usuarios(juego,imagenes);
				vent.getFrame().setVisible(true);
			}
		});
		btnJugar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJugar.setIcon(imagenes.botonJugar);
		//btnJugar.setIcon(Imagenes.botonJugar);
		btnJugar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		btnJugar.setBounds(234, 333, 131, 33);

		JButton btnSalir = new JButton("");
		JLabel lblRecuadroBackground = new JLabel(""); //RECUADRO FONDO
		JLabel lblBackground = new JLabel(""); //FONDO
		JButton btnAtras = new JButton("");
		btnAtras.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		btnAtras.setIcon(new ImageIcon(Menu.class.getResource("/imagenesDelFondo/botonAtras.png")));
		btnAtras.setVisible(false);
		
		btnAtras.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		btnAtras.setBounds(248, 607, 131, 33);
		frame.getContentPane().add(btnAtras);
		
		
		JLabel Reglas = new JLabel("");
		Reglas.setIcon(new ImageIcon(Menu.class.getResource("/imagenesDelFondo/instrucciones1.png")));
		Reglas.setBounds(58, 237, 500, 327);
		frame.getContentPane().add(Reglas);
		Reglas.setVisible(false);
		frame.getContentPane().setLayout(null);
		
		JButton btnReglas = new JButton("");
		btnReglas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblRecuadroBackground.setVisible(false);
				btnSalir.setVisible(false);
				btnJugar.setVisible(false);
				btnReglas.setVisible(false);
				Reglas.setVisible(true);
				btnAtras.setVisible(true);
				
				btnAtras.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						lblRecuadroBackground.setVisible(true);
						btnSalir.setVisible(true);
						btnJugar.setVisible(true);
						btnReglas.setVisible(true);
						Reglas.setVisible(false);
						btnAtras.setVisible(false);
					}
				});
			}
		});
		
		
		
		

		btnSalir.setIcon(imagenes.botonSalir);   // PERSONALIZACION BOTON SALIR
		//btnSalir.setIcon(Imagenes.botonSalir);
		btnSalir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnSalir.setBounds(234, 455, 131, 33);
		frame.getContentPane().add(btnSalir);
		
		
		btnSalir.addMouseListener(new MouseAdapter() { //ACCION BOTON SALIR 
			@Override
			public void mouseClicked(MouseEvent e) { 

				btnJugar.setVisible(false);  
				btnSalir.setVisible(false);
				btnReglas.setVisible(false);
				lblBackground.setVisible(false);
				lblRecuadroBackground.setVisible(false);
				frame.getContentPane().setBackground(Color.decode("#93e9ef")); 
								
				JInternalFrame warning = new JInternalFrame("WARNING");   //FRAME INTERNO DE SALIR
				//warning.setBackground(Color.decode("#93e9ef"));
				warning.setBounds(172, 217, 259, 228); 
				
				frame.getContentPane().add(warning);
				warning.getContentPane().setLayout(null);
			
				JLabel texto = new JLabel("\u00BFSeguro desea salir?");
				texto.setFont(new Font("Anthology Regular DEMO", Font.PLAIN, 10));
				texto.setBounds(48, 41, 164, 56);
				warning.getContentPane().add(texto);
				
				
				JButton btnSi = new JButton("Si");
				btnSi.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
					}
				});
				btnSi.setVerticalAlignment(SwingConstants.TOP);
				btnSi.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
				btnSi.setBounds(77, 107, 85, 21);
				warning.getContentPane().add(btnSi);
				
				JButton btnNo = new JButton("No!");
				btnNo.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						btnJugar.setVisible(true);
						btnSalir.setVisible(true);
						btnReglas.setVisible(true);
						lblBackground.setVisible(true);
						lblRecuadroBackground.setVisible(true);
						warning.dispose();
					}
				});
				btnNo.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
				btnNo.setVerticalAlignment(SwingConstants.TOP);
				btnNo.setBounds(77, 138, 85, 21);
				warning.getContentPane().add(btnNo);
				warning.setVisible(true);
			}
		});
		
		
		frame.getContentPane().add(btnJugar);
		
		
		btnReglas.setIcon(imagenes.botonReglas);
		//btnReglas.setIcon(Imagenes.botonReglas);
		btnReglas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnReglas.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		btnReglas.setBounds(234, 393, 131, 33);
		frame.getContentPane().add(btnReglas);
		
		
		lblRecuadroBackground.setIcon(imagenes.recuadroBackgroundMenu);
		//lblRecuadroBackground.setIcon(Imagenes.recuadroBackgroundMenu);
		lblRecuadroBackground.setBounds(185, 276, 228, 263);
		frame.getContentPane().add(lblRecuadroBackground);
		
//		JLabel ReglasDelJuego = new JLabel("Esta es una nueva versi\u00F3n del juego Tateti!"
//				+ " Se trata de un tablero de forma toroidal, la cual agrega cuatro nuevas formas de ganar. Presiona Start para crear tu usuario.");
//		ReglasDelJuego.setVerticalAlignment(SwingConstants.TOP);
//		ReglasDelJuego.setHorizontalAlignment(SwingConstants.CENTER);
//		ReglasDelJuego.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 16));
//		ReglasDelJuego.setBounds(155, 81, 268, 185);
//		frame.getContentPane().add(ReglasDelJuego);
		
		lblBackground.setBounds(0, 0, 600, 700);
		//NO BORRAR ESTA LINEA HASTA EL FINAL DEL TP
		//lblBackground.setIcon(new ImageIcon(Menu.class.getResource("/imagenesDelFondo/gifBackground.gif")));
		lblBackground.setIcon(imagenes.backgroundMenu);
		//lblBackground.setIcon(Imagenes.backgroundMenu);
		frame.getContentPane().add(lblBackground);
		

			
	}
	
	public JFrame getFrame() {
		return frame;
	}
}
