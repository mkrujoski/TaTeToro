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


	public Menu() {
		initialize();	
	}


	private void initialize() {
		frame = new JFrame();
		
		Juego juego = new Juego();
		
		HerramientasGraficas imagenes = new HerramientasGraficas();
		
		frame.setBounds(680, 130, 600, 700);
		
		frame.setUndecorated(true); //borra la barra arriba
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ------------ FRAME INTERNO DE SALIR
		
				JInternalFrame warning = new JInternalFrame("WARNING");   //FRAME INTERNO DE SALIR
				warning.setBorder(null);
				
				warning.setBounds(172, 217, 259, 228); 
				
				frame.getContentPane().add(warning);
				
				warning.getContentPane().setLayout(null);

				BasicInternalFrameUI ui = (BasicInternalFrameUI)warning.getUI(); //ELIMINA BARRA BARRA FRAME INTERNO
				ui.setNorthPane(null);
				
				//------------------Creacion e inicializacion de botones y labels------------------------------------
				
				JButton btnSi = new JButton("");
				btnSi.setIcon(imagenes.botonSi);
				btnSi.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
				btnSi.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
				btnSi.setBounds(75, 125, 102, 27);
				warning.getContentPane().add(btnSi);
				
				//--------------------------------------------------------------------------------
				
				JButton btnNo = new JButton("");
				btnNo.setIcon(imagenes.botonNo);
				btnNo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
				btnNo.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
				btnNo.setBounds(75, 163, 102, 27);
				warning.getContentPane().add(btnNo);
				warning.setVisible(true);
				
				//--------------------------------------------------------------------------------
				
				JLabel lblBackgroundFrameInterno = new JLabel("");
				lblBackgroundFrameInterno.setHorizontalAlignment(SwingConstants.CENTER);
				lblBackgroundFrameInterno.setIcon(imagenes.fondoSalida);
				lblBackgroundFrameInterno.setBounds(-12, -17, 282, 262);
				warning.getContentPane().add(lblBackgroundFrameInterno);
				//--------------------------------------------------------------------------------
				
				warning.setVisible(false);
				
		//---------------Inicializacion de label y botones-----------------------------
	
		JButton btnJugar = new JButton("");
		JButton btnSalir = new JButton("");
		JLabel lblRecuadroBackground = new JLabel(""); //RECUADRO FONDO
		JLabel lblBackground = new JLabel(""); //FONDO
		JButton btnAtras = new JButton("");
		JLabel ImagenReglas = new JLabel("");
		JButton btnReglas = new JButton("");
		
		
		//--------------Creacion de label y botones--------------------------------------
		
		btnJugar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJugar.setIcon(imagenes.botonJugar);
		btnJugar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		btnJugar.setBounds(234, 333, 131, 33);
		frame.getContentPane().add(btnJugar);
		
		//--------------------------------------------------------------------------------
	
		btnAtras.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		btnAtras.setIcon(imagenes.botonAtras);
		btnAtras.setVisible(false);
		btnAtras.setBounds(248, 607, 131, 33);
		frame.getContentPane().add(btnAtras);
		
		//--------------------------------------------------------------------------------
		
		ImagenReglas.setIcon(imagenes.instrucciones);
		ImagenReglas.setBounds(58, 237, 500, 327);
		frame.getContentPane().add(ImagenReglas);
		ImagenReglas.setVisible(false);
		frame.getContentPane().setLayout(null);
		
		//--------------------------------------------------------------------------------
		
		btnSalir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnSalir.setBounds(234, 455, 131, 33);
		btnSalir.setIcon(imagenes.botonSalir);   
		frame.getContentPane().add(btnSalir);
		
		//--------------------------------------------------------------------------------
		
		btnReglas.setIcon(imagenes.botonReglas);
		btnReglas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnReglas.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		btnReglas.setBounds(234, 393, 131, 33);
		frame.getContentPane().add(btnReglas);
		
		//--------------------------------------------------------------------------------
		
		lblRecuadroBackground.setIcon(imagenes.recuadroBackgroundMenu);
		lblRecuadroBackground.setBounds(185, 276, 228, 263);
		frame.getContentPane().add(lblRecuadroBackground);
		
		//--------------------------------------------------------------------------------
		
		lblBackground.setBounds(0, 0, 600, 700);
		lblBackground.setIcon(imagenes.backgroundMenu);
		frame.getContentPane().add(lblBackground);
		
		
		//--------------Acciones de Botones------------------------------
		
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Usuarios vent = new Usuarios(juego,imagenes);
				vent.getFrame().setVisible(true);
			}
		});
		
		//----------------------------------------------------------------
		
		btnReglas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MostrarReglas(lblRecuadroBackground, btnSalir, btnJugar, btnReglas, ImagenReglas, btnAtras);
				
				btnAtras.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						MostrarMenu(lblRecuadroBackground, btnSalir, btnJugar, btnReglas, ImagenReglas, btnAtras);
					}
				});
			}
		});
		
		//-----------------------------------------------------------------
		
		btnSalir.addMouseListener(new MouseAdapter() { //ACCION BOTON SALIR 
			@Override
			public void mouseClicked(MouseEvent e) { 
				
				MostrarWarning(warning, btnJugar, btnSalir, btnReglas, lblBackground, lblRecuadroBackground);
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
						VolverMenu(warning, btnJugar, btnSalir, btnReglas, lblBackground, lblRecuadroBackground);
						
					}
				});
			}
		});
		
	}
	
	//------------------Metodos Auxiliares----------------------------------
	
	private void MostrarReglas(JLabel lblRecuadroBackground,JButton btnSalir,JButton btnJugar,JButton btnReglas,JLabel ImagenReglas,JButton btnAtras) 
	{
		lblRecuadroBackground.setVisible(false);
		btnSalir.setVisible(false);
		btnJugar.setVisible(false);
		btnReglas.setVisible(false);
		ImagenReglas.setVisible(true);
		btnAtras.setVisible(true);
	}
	
	private void MostrarMenu(JLabel lblRecuadroBackground,JButton btnSalir,JButton btnJugar,JButton btnReglas,JLabel ImagenReglas,JButton btnAtras) 
	{
		lblRecuadroBackground.setVisible(true);
		btnSalir.setVisible(true);
		btnJugar.setVisible(true);
		btnReglas.setVisible(true);
		ImagenReglas.setVisible(false);
		btnAtras.setVisible(false);
	}
	
	private void MostrarWarning(JInternalFrame warning,JButton btnJugar,JButton btnSalir,JButton btnReglas,JLabel lblBackground,JLabel lblRecuadroBackground) 
	{
		warning.setVisible(true);
		btnJugar.setVisible(false);  
		btnSalir.setVisible(false);
		btnReglas.setVisible(false);
		lblBackground.setVisible(false);
		lblRecuadroBackground.setVisible(false);
	}
	
	private void VolverMenu(JInternalFrame warning,JButton btnJugar,JButton btnSalir,JButton btnReglas,JLabel lblBackground,JLabel lblRecuadroBackground) 
	{
		btnJugar.setVisible(true);
		btnSalir.setVisible(true);
		btnReglas.setVisible(true);
		lblBackground.setVisible(true);
		lblRecuadroBackground.setVisible(true);
		warning.dispose();
	}
	
	public JFrame getFrame() {
		return frame;
	}



}