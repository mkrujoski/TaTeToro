package interfaz;

//import java.awt.image.*;
import java.awt.*;
import javax.swing.*;
//import javax.imageio.*;
//import javax.swing.border.Border;
import codigoCliente.Juego;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaDeJuego {

	private JFrame frame;
	private Imagenes imagenesDelTablero;
	private ImageIcon X;
	private ImageIcon O;
	private boolean seleccionado1;
	private boolean seleccionado2;
	private boolean seleccionado3;
	private boolean seleccionado4;
	private boolean seleccionado5;
	private boolean seleccionado6;
	private boolean seleccionado7;
	private boolean seleccionado8;
	private boolean seleccionado9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaDeJuego window = new PantallaDeJuego();
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
	public PantallaDeJuego() {
		initialize();	
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { //frame del fondo principal
		Juego juego = new Juego();
		
		imagenesDelTablero = new Imagenes();
		
		frame = new JFrame();
		frame.setTitle("Ta-te-toro");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 31));
		seleccionado1 = false;
		frame.setBounds(680, 130, 600, 700);
		
		frame.setUndecorated(true); //borra la barra de arriba
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To set the action when Frame is closed.
		frame.getContentPane().setBackground(Color.decode("#93e9ef")); //COLOR DE FONDO
		
		
		
		X = imagenesDelTablero.x;
		O = imagenesDelTablero.o;
	
		
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNombreJugador1 = new JLabel(Juego.getJugador1());
		lblNombreJugador1.setForeground(Color.BLACK);
		lblNombreJugador1.setFont(new Font("Anthology Regular DEMO", Font.PLAIN, 19));
		lblNombreJugador1.setBounds(77, 21, 180, 43);
		frame.getContentPane().add(lblNombreJugador1);
		
		
		JLabel lblGanador = new JLabel("-------------------------");
		lblGanador.setHorizontalAlignment(SwingConstants.LEFT);
		lblGanador.setBounds(219, 575, 175, 60);
		frame.getContentPane().add(lblGanador);
		
		JLabel Tablero = new JLabel("");  
		Tablero.setBounds(121, 181, 372, 373);
		Tablero.setIcon(imagenesDelTablero.tablero);
		frame.getContentPane().add(Tablero);
		
		JLabel lblIconX = new JLabel(""); //Icon que va al lado del nombre del Jugador X
		lblIconX.setIcon(imagenesDelTablero.iconX);
		lblIconX.setBounds(21, 21, 46, 43);
		frame.getContentPane().add(lblIconX);
		
		JLabel lblNombreJugador2 = new JLabel(Juego.getJugador2());
		lblNombreJugador2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreJugador2.setFont(new Font("Anthology Regular DEMO", Font.PLAIN, 19));
		lblNombreJugador2.setBounds(359, 21, 180, 43);
		frame.getContentPane().add(lblNombreJugador2);
		
		JLabel lblIconO = new JLabel(""); //Icon que va al lado del nombre del Jugador O
		lblIconO.setIcon(imagenesDelTablero.iconO);
		lblIconO.setBounds(544, 21, 46, 43);
		frame.getContentPane().add(lblIconO);
		
		JLabel lblTurno = new JLabel(""); //ESTE ES EL LABEL DE TURNO:O / TURNO: X
		lblTurno.setIcon(new ImageIcon(PantallaDeJuego.class.getResource("/imagenesDelFondo/turno X3.png")));
		lblTurno.setFont(new Font("Anthology Regular DEMO", Font.PLAIN, 19));
		lblTurno.setBounds(234, 102, 131, 43);
		frame.getContentPane().add(lblTurno);
		
		JButton btnBotonSalir = new JButton(""); 
		btnBotonSalir.setIcon(imagenesDelTablero.botonSalir);
		btnBotonSalir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBotonSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnBotonSalir.setBounds(443, 656, 131, 33);
		frame.getContentPane().add(btnBotonSalir);
		
		JButton btnBotonAtras = new JButton("");
		btnBotonAtras.setIcon(imagenesDelTablero.botonAtras);
		btnBotonAtras.setFont(new Font("Showcard Gothic", Font.PLAIN, 23));
		btnBotonAtras.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBotonAtras.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnBotonAtras.setBounds(21, 656, 131, 33);
		frame.getContentPane().add(btnBotonAtras);
		
		JButton botonInfo = new JButton("");
		botonInfo.setIcon(new ImageIcon(PantallaDeJuego.class.getResource("/imagenesDelFondo/botonInfo.png")));
		botonInfo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		botonInfo.setBounds(234, 656, 131, 33);
		frame.getContentPane().add(botonInfo);
		botonInfo.setVisible(false);
		
		//--------------------------------------------------------
		JLabel panel1 = new JLabel("");
		panel1.setBounds(121, 195, 100, 100);
		frame.getContentPane().add(panel1);
		
		JLabel panel2 = new JLabel("");
		panel2.setBounds(242, 195, 112, 100);
		frame.getContentPane().add(panel2);
		
		JLabel panel3 = new JLabel("");
		panel3.setBounds(370, 195, 100, 100);
		frame.getContentPane().add(panel3);
		
		JLabel panel4 = new JLabel("");
		panel4.setBounds(121, 314, 112, 105);
		frame.getContentPane().add(panel4);
		
		JLabel panel5 = new JLabel("");
		panel5.setBounds(242, 314, 112, 105);
		frame.getContentPane().add(panel5);
		
		JLabel panel6 = new JLabel("");
		panel6.setBounds(370, 314, 100, 105);
		frame.getContentPane().add(panel6);
		
		JLabel panel7 = new JLabel("");
		panel7.setBounds(124, 441, 100, 100);
		frame.getContentPane().add(panel7);
		
		JLabel panel8 = new JLabel("");
		panel8.setBounds(242, 441, 112, 100);
		frame.getContentPane().add(panel8);
		
		JLabel panel9 = new JLabel("");
		panel9.setBounds(370, 441, 100, 100);
		frame.getContentPane().add(panel9);
		
		//-----------------------------------------------------------
			
		panel1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado1 == false) {
					//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
					panel1.setIcon(colocarSimbolo());
					juego.agregarJugada(1);
					panel1.setHorizontalAlignment(SwingConstants.CENTER);
					panel1.setHorizontalTextPosition(SwingConstants.CENTER);
					
					if(juego.jugadaGanadora(juego.listaGanadoras())) 
					{
						HayGanandor();
						CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), Juego.getTurno(),imagenesDelTablero);
						botonInfo.setEnabled(true);
						if(Juego.getTurno()=='X') //cambia la img del ganador
						{	
							lblGanador.setIcon(imagenesDelTablero.ganadorX);		
							botonInfo.setVisible(true);
							
						}
						else 
						{
							lblGanador.setIcon(imagenesDelTablero.ganadorO);
							botonInfo.setVisible(true);
						}
						lblTurno.setVisible(false); //desaparece el Turno:O
						}
					juego.cambiarTurno();
					if(Juego.getTurno()=='X') //cambia la img de turno
					{
						lblTurno.setIcon(imagenesDelTablero.turnoX);
					}
					else 
					{
						lblTurno.setIcon(imagenesDelTablero.turnoO);
					}	
					seleccionado1 = true;
					}
				}	
		});
		//-----------------------------------------------------------
		panel2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado2 == false) {
					panel2.setIcon(colocarSimbolo());
					juego.agregarJugada(2);
					panel2.setHorizontalAlignment(SwingConstants.CENTER);
					panel2.setHorizontalTextPosition(SwingConstants.CENTER);
					if(juego.jugadaGanadora(juego.listaGanadoras())) 
					{
						HayGanandor();
						CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), Juego.getTurno(),imagenesDelTablero);
						botonInfo.setEnabled(true);
						if(Juego.getTurno()=='X')
						{	
							lblGanador.setIcon(imagenesDelTablero.ganadorX);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano X"
							
						}
						else 
						{
							lblGanador.setIcon(imagenesDelTablero.ganadorO);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano O"
						}
						lblTurno.setVisible(false);
						}
					juego.cambiarTurno();
					if(Juego.getTurno()=='X')
					{
						lblTurno.setIcon(imagenesDelTablero.turnoX);
					}
					else 
					{
						lblTurno.setIcon(imagenesDelTablero.turnoO);
					}
					seleccionado2 = true;
				}
			}
		});
		
		//-----------------------------------------------------------
		
		
		panel3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado3 == false) {
					//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
					panel3.setIcon(colocarSimbolo());
					juego.agregarJugada(3);
					panel3.setHorizontalAlignment(SwingConstants.CENTER);
					panel3.setHorizontalTextPosition(SwingConstants.CENTER);
					if(juego.jugadaGanadora(juego.listaGanadoras())) 
					{
						HayGanandor();
						CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), Juego.getTurno(),imagenesDelTablero);
						botonInfo.setEnabled(true);
						if(Juego.getTurno()=='X')
						{	
							lblGanador.setIcon(imagenesDelTablero.ganadorX);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano X"
							
						}
						else 
						{
							lblGanador.setIcon(imagenesDelTablero.ganadorO);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano O"
						}
						lblTurno.setVisible(false);
						}
					juego.cambiarTurno();
					if(Juego.getTurno()=='X')
					{
						lblTurno.setIcon(imagenesDelTablero.turnoX);
					}
					else 
					{
						lblTurno.setIcon(imagenesDelTablero.turnoO);
					}
					seleccionado3 = true;
					}
				}
		});
		//-----------------------------------------------------------
		
		
		panel4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado4 == false) {
					//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
					panel4.setIcon(colocarSimbolo());
					juego.agregarJugada(4);
					panel4.setHorizontalAlignment(SwingConstants.CENTER);
					panel4.setHorizontalTextPosition(SwingConstants.CENTER);
					if(juego.jugadaGanadora(juego.listaGanadoras())) 
					{
						HayGanandor();
						CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), Juego.getTurno(),imagenesDelTablero);
						botonInfo.setEnabled(true);
						if(Juego.getTurno()=='X')
						{	
							lblGanador.setIcon(imagenesDelTablero.ganadorX);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano X"
							
						}
						else 
						{
							lblGanador.setIcon(imagenesDelTablero.ganadorO);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano O"
						}
						lblTurno.setVisible(false);
						}
					juego.cambiarTurno();
					if(Juego.getTurno()=='X')
					{
						
						lblTurno.setIcon(imagenesDelTablero.turnoX);
					}
					else 
					{
						lblTurno.setIcon(imagenesDelTablero.turnoO);
					}
					seleccionado4 = true;
					}
				}
		});
		//-----------------------------------------------------------
		
		
		panel5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado5 == false) {
					//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
					panel5.setIcon(colocarSimbolo());
					juego.agregarJugada(5);
					panel5.setHorizontalAlignment(SwingConstants.CENTER);
					panel5.setHorizontalTextPosition(SwingConstants.CENTER);
					if(juego.jugadaGanadora(juego.listaGanadoras())) 
					{
						HayGanandor();
						CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), Juego.getTurno(),imagenesDelTablero);
						botonInfo.setEnabled(true);
						if(Juego.getTurno()=='X')
						{	
							lblGanador.setIcon(imagenesDelTablero.ganadorX);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano X"
							
						}
						else 
						{
							lblGanador.setIcon(imagenesDelTablero.ganadorO);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano O"
						}
						lblTurno.setVisible(false);
						}
					juego.cambiarTurno();
					if(Juego.getTurno()=='X')
					{
						lblTurno.setIcon(imagenesDelTablero.turnoX);
					}
					else 
					{
						lblTurno.setIcon(imagenesDelTablero.turnoO);
					}
					seleccionado5 = true;
					}
				}
				
		});
		//-----------------------------------------------------------
		
		
		panel6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado6 == false) {
					panel6.setIcon(colocarSimbolo());
					juego.agregarJugada(6);
					panel6.setHorizontalAlignment(SwingConstants.CENTER);
					panel6.setHorizontalTextPosition(SwingConstants.CENTER);
					if(juego.jugadaGanadora(juego.listaGanadoras())) 
					{
						HayGanandor();
						CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), Juego.getTurno(),imagenesDelTablero);
						botonInfo.setEnabled(true);
						if(Juego.getTurno()=='X')
						{	
							
							lblGanador.setIcon(imagenesDelTablero.ganadorX);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano X"
							
						}
						else 
						{
							lblGanador.setIcon(imagenesDelTablero.ganadorO);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano O"
						}
						lblTurno.setVisible(false);
						}
					juego.cambiarTurno();
					if(Juego.getTurno()=='X')
					{
						lblTurno.setIcon(imagenesDelTablero.turnoX);
					}
					else 
					{
						lblTurno.setIcon(imagenesDelTablero.turnoO);
					}
					seleccionado6 = true;
				}
				
			}
		});
		//-----------------------------------------------------------
		
		
		panel7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado7 == false) {
					panel7.setIcon(colocarSimbolo());
					juego.agregarJugada(7);
					panel7.setHorizontalAlignment(SwingConstants.CENTER);
					panel7.setHorizontalTextPosition(SwingConstants.CENTER);
					if(juego.jugadaGanadora(juego.listaGanadoras())) 
					{
						HayGanandor();
						CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), Juego.getTurno(),imagenesDelTablero);
						botonInfo.setEnabled(true);
						if(Juego.getTurno()=='X')
						{	
							lblGanador.setIcon(imagenesDelTablero.ganadorX);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano X"
							
						}
						else 
						{
							lblGanador.setIcon(imagenesDelTablero.ganadorO);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano O"
						}
						lblTurno.setVisible(false);
						}
					juego.cambiarTurno();
					if(Juego.getTurno()=='X')
					{
						lblTurno.setIcon(imagenesDelTablero.turnoX);
					}
					else 
					{
						lblTurno.setIcon(imagenesDelTablero.turnoO);
					}
					seleccionado7 = true;
				}	
			}
				
		});
		//-----------------------------------------------------------
		
		
		panel8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado8 == false) {
					panel8.setIcon(colocarSimbolo());
					juego.agregarJugada(8);
					panel8.setHorizontalAlignment(SwingConstants.CENTER);
					panel8.setHorizontalTextPosition(SwingConstants.CENTER);
					if(juego.jugadaGanadora(juego.listaGanadoras())) 
					{
						HayGanandor();
						CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), Juego.getTurno(),imagenesDelTablero);
						botonInfo.setEnabled(true);
						if(Juego.getTurno()=='X')
						{	
							lblGanador.setIcon(imagenesDelTablero.ganadorX);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano X"
							
						}
						else 
						{
							lblGanador.setIcon(imagenesDelTablero.ganadorO);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano O"
						}
						lblTurno.setVisible(false);
						}
					juego.cambiarTurno();
					
					if(Juego.getTurno()=='X')
					{
						lblTurno.setIcon(imagenesDelTablero.turnoX);
					}
					else 
					{
						lblTurno.setIcon(imagenesDelTablero.turnoO);
					}
					seleccionado8 = true;
					}
				}
		});
		//-----------------------------------------------------------
		panel9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado9 == false) {
					panel9.setIcon(colocarSimbolo());
					juego.agregarJugada(9);
					panel9.setHorizontalAlignment(SwingConstants.CENTER);
					panel9.setHorizontalTextPosition(SwingConstants.CENTER);
					if(juego.jugadaGanadora(juego.listaGanadoras())) 
					{
						HayGanandor();
						CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), Juego.getTurno(),imagenesDelTablero);
						botonInfo.setEnabled(true);
						if(Juego.getTurno()=='X')
						{	
							lblGanador.setIcon(imagenesDelTablero.ganadorX);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano X"
							
						}
						else 
						{
							lblGanador.setIcon(imagenesDelTablero.ganadorO);
							botonInfo.setVisible(true);
							//lblTurno.setIcon();  Imagen de "Gano O"
						}
						lblTurno.setVisible(false);
						}
					juego.cambiarTurno();
					if(Juego.getTurno()=='X')
					{
						lblTurno.setIcon(imagenesDelTablero.turnoX);
					}
					else 
					{
						lblTurno.setIcon(imagenesDelTablero.turnoO);
					}
					seleccionado9 = true;
					}
				}
	    	});
		
		//------------------Acciones Botones-----------------------------------------
		
		
		btnBotonSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); //DE MOMENTO, CIERRA LA VENTANA POR COMPLETO
				frame.dispose();
			}
		});
		
		btnBotonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Usuarios vent = new Usuarios();
				vent.getFrame().setVisible(true);
			}
		});
		
		botonInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				Victoria victoria = new Victoria();
				victoria.getFrame().setVisible(true);
			}
		});
		
		
		JLabel lblDecoracionFondo = new JLabel("");
		lblDecoracionFondo.setIcon(imagenesDelTablero.fondoTablero);
		lblDecoracionFondo.setBounds(0, 0, 600, 700);
		frame.getContentPane().add(lblDecoracionFondo);
				
		
	}
	
	
	private void HayGanandor() 
	{
		seleccionado1=true;
		seleccionado2=true;
		seleccionado3=true;
		seleccionado4=true;
		seleccionado5=true;
		seleccionado6=true;
		seleccionado7=true;
		seleccionado8=true;
		seleccionado9=true;
		
		
	}

	private void CambiarImagen(JLabel p1, JLabel p2, JLabel p3, JLabel p4, JLabel p5, JLabel p6, JLabel p7, JLabel p8, JLabel p9, int num, char letra ,Imagenes imagen) 
	{ 
		
		if(num==1 && letra=='X') 
		{
			
			p1.setIcon(imagen.x_ganadora);
			p2.setIcon(imagen.x_ganadora);
			p3.setIcon(imagen.x_ganadora);
		}
		if (num==1 && letra=='O')
		{
			p1.setIcon(imagen.o_ganadora);
			p2.setIcon(imagen.o_ganadora);
			p3.setIcon(imagen.o_ganadora);
		}
		
		if(num==2 && letra=='X') 
		{
			p4.setIcon(imagen.x_ganadora);
			p5.setIcon(imagen.x_ganadora);
			p6.setIcon(imagen.x_ganadora);
		}
		if (num==2 && letra=='O') 
		{
			p4.setIcon(imagen.o_ganadora);
			p5.setIcon(imagen.o_ganadora);
			p6.setIcon(imagen.o_ganadora);
		}
		
		if(num==3 && letra=='X') 
		{
			p7.setIcon(imagen.x_ganadora);
			p8.setIcon(imagen.x_ganadora);
			p9.setIcon(imagen.x_ganadora);
		}
		if (num==3 && letra=='O') 
		{
			p7.setIcon(imagen.o_ganadora);
			p8.setIcon(imagen.o_ganadora);
			p9.setIcon(imagen.o_ganadora);
		}
		
		if(num==4 && letra=='X') 
		{
			p1.setIcon(imagen.x_ganadora);
			p5.setIcon(imagen.x_ganadora);
			p9.setIcon(imagen.x_ganadora);
		}
		if (num==4 && letra=='O') 
		{
			p1.setIcon(imagen.o_ganadora);
			p5.setIcon(imagen.o_ganadora);
			p9.setIcon(imagen.o_ganadora);
		}
		
		if(num==5 && letra=='X') 
		{
			p3.setIcon(imagen.x_ganadora);
			p5.setIcon(imagen.x_ganadora);
			p7.setIcon(imagen.x_ganadora);
		}
		if (num==5 && letra=='O') 
		{
			p3.setIcon(imagen.o_ganadora);
			p5.setIcon(imagen.o_ganadora);
			p7.setIcon(imagen.o_ganadora);
		}
		
		if(num==6 && letra=='X') 
		{
			p1.setIcon(imagen.x_ganadora);
			p4.setIcon(imagen.x_ganadora);
			p7.setIcon(imagen.x_ganadora);
		}
		if (num==6 && letra=='O') 
		{
			p1.setIcon(imagen.o_ganadora);
			p4.setIcon(imagen.o_ganadora);
			p7.setIcon(imagen.o_ganadora);
		}
		
		if(num==7 && letra=='X') 
		{
			p2.setIcon(imagen.x_ganadora);
			p5.setIcon(imagen.x_ganadora);
			p8.setIcon(imagen.x_ganadora);
		}
		if (num==7 && letra=='O') 
		{
			p2.setIcon(imagen.o_ganadora);
			p5.setIcon(imagen.o_ganadora);
			p8.setIcon(imagen.o_ganadora);
		}
		if(num==8 && letra=='X') 
		{
			p3.setIcon(imagen.x_ganadora);
			p6.setIcon(imagen.x_ganadora);
			p9.setIcon(imagen.x_ganadora);
		}
		if (num==8 && letra=='O') 
		{
			p3.setIcon(imagen.o_ganadora);
			p6.setIcon(imagen.o_ganadora);
			p9.setIcon(imagen.o_ganadora);
		}
		if(num==9 && letra=='X') 
		{
			p2.setIcon(imagen.x_ganadora);
			p6.setIcon(imagen.x_ganadora);
			p7.setIcon(imagen.x_ganadora);
		}
		if (num==9 && letra=='O') 
		{
			p2.setIcon(imagen.o_ganadora);
			p6.setIcon(imagen.o_ganadora);
			p7.setIcon(imagen.o_ganadora);
		}
		if(num==10 && letra=='X') 
		{
			p2.setIcon(imagen.x_ganadora);
			p4.setIcon(imagen.x_ganadora);
			p9.setIcon(imagen.x_ganadora);
		}
		if (num==10 && letra=='O') 
		{
			p2.setIcon(imagen.o_ganadora);
			p4.setIcon(imagen.o_ganadora);
			p9.setIcon(imagen.o_ganadora);
		}
		if(num==11 && letra=='X') 
		{
			p3.setIcon(imagen.x_ganadora);
			p4.setIcon(imagen.x_ganadora);
			p8.setIcon(imagen.x_ganadora);
		}
		if (num==11 && letra=='O') 
		{
			p3.setIcon(imagen.o_ganadora);
			p4.setIcon(imagen.o_ganadora);
			p8.setIcon(imagen.o_ganadora);
		}
		
		if(num==12 && letra=='X') 
		{
			p1.setIcon(imagen.x_ganadora);
			p6.setIcon(imagen.x_ganadora);
			p8.setIcon(imagen.x_ganadora);
		}
		if (num==12 && letra=='O') 
		{
			p1.setIcon(imagen.o_ganadora);
			p6.setIcon(imagen.o_ganadora);
			p8.setIcon(imagen.o_ganadora);
		}
	}
	
	private ImageIcon colocarSimbolo() { //hacer juego.getTurno y no Juego.getTurno (hay que sacar el static)
		if(Juego.getTurno() == 'X') 
			return X;
		return O;	
	}
		public JFrame getFrame() {
		return frame;
	}
}