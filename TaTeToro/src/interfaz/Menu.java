package interfaz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import logica.Juego;


public class Menu {

	private JFrame frame;
	private HerramientasGraficas imagenes;

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
		
		imagenes = new HerramientasGraficas();
		
		frame.setBounds(680, 130, 600, 700);
		
		frame.setUndecorated(true); //borra la barra arriba
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ------------ FRAME INTERNO DE SALIR
		
				JInternalFrame warning = new JInternalFrame("WARNING");   //FRAME INTERNO DE SALIR
				warning.setBorder(null);
				//warning.setBackground(Color.decode("#93e9ef"));
				warning.setBounds(172, 217, 259, 228); 
				
				frame.getContentPane().add(warning);
				
				warning.getContentPane().setLayout(null);

				BasicInternalFrameUI ui = (BasicInternalFrameUI)warning.getUI(); //ELIMINA BARRA BARRA FRAME INTERNO
				ui.setNorthPane(null);
				
				JButton btnSi = new JButton("");
				btnSi.setIcon(imagenes.botonSi);
				btnSi.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
				btnSi.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
				btnSi.setBounds(75, 125, 102, 27);
				warning.getContentPane().add(btnSi);
				
				JButton btnNo = new JButton("");
				btnNo.setIcon(imagenes.botonNo);
				btnNo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
				btnNo.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
				btnNo.setBounds(75, 163, 102, 27);
				warning.getContentPane().add(btnNo);
				warning.setVisible(true);
				
				
				JLabel lblBackgroundFrameInterno = new JLabel("");
				lblBackgroundFrameInterno.setHorizontalAlignment(SwingConstants.CENTER);
				lblBackgroundFrameInterno.setIcon(imagenes.fondoSalida);
				lblBackgroundFrameInterno.setBounds(-12, -17, 282, 262);
				warning.getContentPane().add(lblBackgroundFrameInterno);
				
				warning.setVisible(false);
				
		//-------------------------------------------------------------------------------------
	
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
//		JButton btnAtras = new JButton();
//		btnAtras.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
//		btnAtras.setIcon(imagenes.botonAtras);
//		btnAtras.setVisible(false);
//		btnAtras.setBounds(248, 607, 131, 33);
//		frame.getContentPane().add(btnAtras);
		JButton btnAtras = generarBotonAtras(248,607,131,33);
		
		
		JLabel Reglas = new JLabel("");
		Reglas.setIcon(imagenes.instrucciones);
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

				warning.setVisible(true);
				btnJugar.setVisible(false);  
				btnSalir.setVisible(false);
				btnReglas.setVisible(false);
				lblBackground.setVisible(false);
				lblRecuadroBackground.setVisible(false);
				frame.getContentPane().setBackground(Color.decode("#93e9ef")); 
									
				
				
				btnSi.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
					}
				});
				
				
				
				
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
		lblRecuadroBackground.setBounds(185, 276, 228, 263);
		frame.getContentPane().add(lblRecuadroBackground);
		
		lblBackground.setBounds(0, 0, 600, 700);
		//NO BORRAR ESTA LINEA HASTA EL FINAL DEL TP
		//lblBackground.setIcon(new ImageIcon(Menu.class.getResource("/imagenesDelFondo/gifBackground.gif")));
		lblBackground.setIcon(imagenes.backgroundMenu);
		//lblBackground.setIcon(Imagenes.backgroundMenu);
		frame.getContentPane().add(lblBackground);
			
	}
	
	//DUDO DE IMPLEMENTARLO
	public JButton generarBotonAtras(int x, int y, int w, int h) {
		JButton btnAtras = new JButton();
		btnAtras.setBounds(x, y, w, h);
		btnAtras.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		btnAtras.setIcon(imagenes.botonAtras);
		btnAtras.setVisible(false);
		frame.getContentPane().add(btnAtras);	
		return btnAtras;
	}
	
	
	public JFrame getFrame() {
		return frame;
	}


}