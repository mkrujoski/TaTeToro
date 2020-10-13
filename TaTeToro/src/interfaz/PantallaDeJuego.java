package interfaz;

import java.awt.*;
import javax.swing.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;

import logica.Juego;

public class PantallaDeJuego {

	private JFrame frame;
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

	
	public PantallaDeJuego(Juego juego,HerramientasGraficas imagenes) {
		initialize(juego,imagenes);	
	}
	
	
	private void initialize(Juego juego,HerramientasGraficas imagenes) { //frame del fondo principal
		
		frame = new JFrame();
		X = imagenes.x;
		O = imagenes.o;
		
		seleccionado1 = false;
		seleccionado2 = false;
		seleccionado3 = false;
		seleccionado4 = false;
		seleccionado5 = false;
		seleccionado6 = false;
		seleccionado7 = false;
		seleccionado8 = false;
		seleccionado9 = false;
		
		frame.setBounds(680, 130, 600, 700);
		
		frame.setUndecorated(true); //borra la barra de arriba
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To set the action when Frame is closed.
		frame.getContentPane().setBackground(Color.decode("#93e9ef")); //COLOR DE FONDO
		frame.getContentPane().setLayout(null);
		
		
		//---------------Inicializacion de label y botones-----------------------------
		
		JLabel lblNombreJugador1 = new JLabel(Juego.getJugador1());
		JLabel lblGanador = new JLabel("");
		JLabel Tablero = new JLabel("");  
		JLabel lblIconX = new JLabel(""); //Icon que va al lado del nombre del Jugador X
		JLabel lblIconO = new JLabel(""); //Icon que va al lado del nombre del Jugador O
		JLabel lblTurno = new JLabel(""); //ESTE ES EL LABEL DE TURNO:O / TURNO: X
		JButton btnBotonSalir = new JButton("");
		JButton btnBotonAtras = new JButton("");
		JButton botonInfo = new JButton("");
		JLabel panel1 = new JLabel("");
		JLabel panel2 = new JLabel("");
		JLabel panel3 = new JLabel("");
		JLabel panel4 = new JLabel("");
		JLabel panel5 = new JLabel("");
		JLabel panel6 = new JLabel("");
		JLabel panel7 = new JLabel("");
		JLabel panel8 = new JLabel("");
		JLabel panel9 = new JLabel("");
		JLabel lblDecoracionFondo = new JLabel("");
		JLabel lblNombreJugador2 = new JLabel(Juego.getJugador2());
		
		//-------------------------------------------------------------------------------
		
		lblNombreJugador1.setForeground(Color.BLACK);
		lblNombreJugador1.setFont(imagenes.getFont());
		lblNombreJugador1.setBounds(77, 21, 180, 43);
		frame.getContentPane().add(lblNombreJugador1);
		
		//--------------Creacion de label y botones--------------------------------------
		lblNombreJugador2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreJugador2.setFont(imagenes.getFont());
		lblNombreJugador2.setSize(lblNombreJugador2.getPreferredSize());
		lblNombreJugador2.setBounds(359, 21, 171, 43);
		frame.getContentPane().add(lblNombreJugador2);
		//-------------------------------------------------------------------------------
		
		lblGanador.setHorizontalAlignment(SwingConstants.LEFT);
		lblGanador.setBounds(219, 575, 175, 60);
		frame.getContentPane().add(lblGanador);
		
		//-------------------------------------------------------------------------------
		
		Tablero.setBounds(121, 181, 372, 373);
		Tablero.setIcon(imagenes.tablero);
		frame.getContentPane().add(Tablero);
		
		//-------------------------------------------------------------------------------
		
		lblIconX.setIcon(imagenes.iconX);
		lblIconX.setBounds(21, 21, 46, 43);
		frame.getContentPane().add(lblIconX);
		
		//-------------------------------------------------------------------------------
		
		lblIconO.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIconO.setIcon(imagenes.iconO);
		lblIconO.setBounds(540, 21, 46, 43);
		frame.getContentPane().add(lblIconO);
		
		//-------------------------------------------------------------------------------
		
		lblTurno.setFont(new Font("Anthology Regular DEMO", Font.PLAIN, 19));
		lblTurno.setBounds(234, 102, 131, 43);
		frame.getContentPane().add(lblTurno);
		TurnoImagen(lblTurno, juego, imagenes);
		
		//-------------------------------------------------------------------------------
		
		btnBotonSalir.setIcon(imagenes.botonSalir);
		btnBotonSalir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBotonSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnBotonSalir.setBounds(443, 656, 131, 33);
		frame.getContentPane().add(btnBotonSalir);
		
		//-------------------------------------------------------------------------------
		
		btnBotonAtras.setIcon(imagenes.botonAtras);
		btnBotonAtras.setFont(new Font("Showcard Gothic", Font.PLAIN, 23));
		btnBotonAtras.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBotonAtras.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		btnBotonAtras.setBounds(21, 656, 131, 33);
		frame.getContentPane().add(btnBotonAtras);
		
		//-------------------------------------------------------------------------------
		
		botonInfo.setIcon(imagenes.botonInfo);
		botonInfo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		botonInfo.setBounds(234, 656, 131, 33);
		frame.getContentPane().add(botonInfo);
		botonInfo.setVisible(false);
		
		//-------------------------------------------------------------------------------
		
		panel1.setBounds(121, 195, 100, 100);
		frame.getContentPane().add(panel1);
		
		//-------------------------------------------------------------------------------
		
		panel2.setBounds(242, 195, 112, 100);
		frame.getContentPane().add(panel2);
		
		//-------------------------------------------------------------------------------
		
		panel3.setBounds(370, 195, 100, 100);
		frame.getContentPane().add(panel3);
		
		//-------------------------------------------------------------------------------
		
		panel4.setBounds(121, 314, 112, 105);
		frame.getContentPane().add(panel4);
		
		//-------------------------------------------------------------------------------
		
		panel5.setBounds(242, 314, 112, 105);
		frame.getContentPane().add(panel5);
		
		//-------------------------------------------------------------------------------
		
		panel6.setBounds(370, 314, 100, 105);
		frame.getContentPane().add(panel6);
		
		//-------------------------------------------------------------------------------
		
		panel7.setBounds(124, 441, 100, 100);
		frame.getContentPane().add(panel7);
		
		//-------------------------------------------------------------------------------
		
		panel8.setBounds(242, 441, 112, 100);
		frame.getContentPane().add(panel8);
		
		//-------------------------------------------------------------------------------
		
		panel9.setBounds(370, 441, 100, 100);
		frame.getContentPane().add(panel9);
		
		//-------------------------------------------------------------------------------
		
		lblDecoracionFondo.setIcon(imagenes.fondoTablero);
		lblDecoracionFondo.setBounds(0, 0, 600, 700);
		frame.getContentPane().add(lblDecoracionFondo);
		
		//------------------Acciones Botones---------------------------------------------
		
			panel1.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						
						if (Juego.isHabilitado() && seleccionado1 == false) {
							ubicarPieza(panel1, juego,1);
							
							if(juego.jugadaGanadora(juego.listaGanadoras())) 
							{
								GanadorEncontrado(juego, botonInfo);
								CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), juego.getTurno(),imagenes);
								
								if(juego.getTurno()=='X') //cambia la img del ganador
								{	
									GanadorX(imagenes, juego, lblGanador, botonInfo,lblTurno);	
								}
								else 
								{
									GanadorO(imagenes, juego, lblGanador, botonInfo,lblTurno);
								}
								
								}
							else 
							{
								Turnos(juego, imagenes, lblTurno);
							}
							seleccionado1 = true;
							}
						}	
				});
			//-----------------------------------------------------------
			
			panel2.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if (Juego.isHabilitado() && seleccionado2 == false) {
							ubicarPieza(panel2, juego,2);
							if(juego.jugadaGanadora(juego.listaGanadoras())) 
							{
								GanadorEncontrado(juego, botonInfo);
								CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), juego.getTurno(),imagenes);
								
								if(juego.getTurno()=='X')
								{	
									GanadorX(imagenes, juego, lblGanador, botonInfo,lblTurno);
									
								}
								else 
								{
									GanadorO(imagenes, juego, lblGanador, botonInfo,lblTurno);
								}
								
								}
							else 
							{
								Turnos(juego, imagenes, lblTurno);
							}
							seleccionado2 = true;
						}
					}
				});
				
			//-----------------------------------------------------------
					
			panel3.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if (Juego.isHabilitado() && seleccionado3 == false) {
							ubicarPieza(panel3, juego,3);
							if(juego.jugadaGanadora(juego.listaGanadoras())) 
							{
								GanadorEncontrado(juego, botonInfo);
								CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), juego.getTurno(),imagenes);
								
								if(juego.getTurno()=='X')
								{	
									GanadorX(imagenes, juego, lblGanador, botonInfo,lblTurno);
									
								}
								else 
								{
									GanadorO(imagenes, juego, lblGanador, botonInfo,lblTurno);
								}
								
								}
							else 
							{
								Turnos(juego, imagenes, lblTurno);
							}
							seleccionado3 = true;
							
							}
						}
				});
			//-----------------------------------------------------------
				
				
			panel4.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if (Juego.isHabilitado() && seleccionado4 == false) {
							ubicarPieza(panel4, juego,4);
							if(juego.jugadaGanadora(juego.listaGanadoras())) 
							{
								GanadorEncontrado(juego, botonInfo);
								CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), juego.getTurno(),imagenes);
								
								if(juego.getTurno()=='X')
								{	
									GanadorX(imagenes, juego, lblGanador, botonInfo,lblTurno);
									
								}
								else 
								{
									GanadorO(imagenes, juego, lblGanador, botonInfo,lblTurno);
								}
								
								}
							else 
							{
								Turnos(juego, imagenes, lblTurno);
							}
							seleccionado4 = true;
							}
						}
				});
			//-----------------------------------------------------------
				
				
			panel5.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if (Juego.isHabilitado() && seleccionado5 == false) {
							ubicarPieza(panel5, juego,5);
							if(juego.jugadaGanadora(juego.listaGanadoras())) 
							{
								GanadorEncontrado(juego, botonInfo);
								CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), juego.getTurno(),imagenes);
								
								if(juego.getTurno()=='X')
								{	
									GanadorX(imagenes, juego, lblGanador, botonInfo,lblTurno);
									
								}
								else 
								{
									GanadorO(imagenes, juego, lblGanador, botonInfo,lblTurno);
								}
								
								}
							else 
							{
								Turnos(juego, imagenes, lblTurno);
							}
							seleccionado5 = true;
							}
						}
						
				});
			//-----------------------------------------------------------
				
				
			panel6.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if (Juego.isHabilitado() && seleccionado6 == false) {
							ubicarPieza(panel6, juego,6);
							if(juego.jugadaGanadora(juego.listaGanadoras())) 
							{
								GanadorEncontrado(juego, botonInfo);
								CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), juego.getTurno(),imagenes);
								
								if(juego.getTurno()=='X')
								{	
									
									GanadorX(imagenes, juego, lblGanador, botonInfo,lblTurno);
									
								}
								else 
								{
									GanadorO(imagenes, juego, lblGanador, botonInfo,lblTurno);
								}
								
								}
							else 
							{
								Turnos(juego, imagenes, lblTurno);
							}
							seleccionado6 = true;
						}
						
					}
				});
			//-----------------------------------------------------------
				
				
			panel7.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if (Juego.isHabilitado() && seleccionado7 == false) {
							ubicarPieza(panel7, juego,7);
							if(juego.jugadaGanadora(juego.listaGanadoras())) 
							{
								GanadorEncontrado(juego, botonInfo);
								CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), juego.getTurno(),imagenes);
								
								if(juego.getTurno()=='X')
								{	
									GanadorX(imagenes, juego, lblGanador, botonInfo,lblTurno);
									
								}
								else 
								{
									GanadorO(imagenes, juego, lblGanador, botonInfo,lblTurno);
								}
								
								}
							else 
							{
								Turnos(juego, imagenes, lblTurno);
							}
							seleccionado7 = true;
						}	
					}
						
				});
			//-----------------------------------------------------------
				
				
			panel8.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if (Juego.isHabilitado() && seleccionado8 == false) {
							ubicarPieza(panel8, juego,8);
							if(juego.jugadaGanadora(juego.listaGanadoras())) 
							{
								GanadorEncontrado(juego, botonInfo);
								CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), juego.getTurno(),imagenes);
								
								if(juego.getTurno()=='X')
								{	
									GanadorX(imagenes, juego, lblGanador, botonInfo,lblTurno);
									
								}
								else 
								{
									GanadorO(imagenes, juego, lblGanador, botonInfo,lblTurno);
								}
								
								}
							else 
							{
								Turnos(juego, imagenes, lblTurno);
							}
							seleccionado8 = true;
							}
						}
				});
			//-----------------------------------------------------------
			panel9.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if (Juego.isHabilitado() && seleccionado9 == false) {
							ubicarPieza(panel9, juego,9);
							if(juego.jugadaGanadora(juego.listaGanadoras())) 
							{
								GanadorEncontrado(juego, botonInfo);
								CambiarImagen(panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, juego.listaGanadoras(), juego.getTurno(),imagenes);
								
								if(juego.getTurno()=='X')
								{	
									GanadorX(imagenes, juego, lblGanador, botonInfo,lblTurno);
									
									
								}
								else 
								{
									GanadorO(imagenes, juego, lblGanador, botonInfo,lblTurno);
								}
								
								}
							else 
							{
								Turnos(juego, imagenes, lblTurno);
							
							}
							seleccionado9 = true;
							}
						}
			    	});
		//-------------------------------------------------------------------------------
		btnBotonSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		
		btnBotonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				HerramientasGraficas imagen = new HerramientasGraficas();
				Usuarios vent = new Usuarios(juego,imagen);
				vent.getFrame().setVisible(true);
				
				juego.vaciarJugadas();
			}
		});
		
		botonInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Victoria victoria = new Victoria(juego, imagenes);
				victoria.getFrame().setVisible(true);
			}
		});		
		
	}
	
	//------------------Metodos Auxiliares----------------------------------
	
	private void ubicarPieza(JLabel panel,Juego juego,int num) 
	{
			panel.setIcon(colocarSimbolo(juego));
			juego.agregarJugada(num);
			panel.setHorizontalAlignment(SwingConstants.CENTER);
			panel.setHorizontalTextPosition(SwingConstants.CENTER);
	}
	
	private void GanadorEncontrado(Juego juego,JButton boton) 
	{
			HayGanandor();
			boton.setEnabled(true);
	}
	
	private void GanadorX(HerramientasGraficas imagenes,Juego juego ,JLabel lbl,JButton boton,JLabel lblTurno) 
	{
		lbl.setIcon(imagenes.ganadorX);		
		boton.setVisible(true);
		juego.setTurnoInicial('O');
		lblTurno.setVisible(false);
	}
	
	private void GanadorO(HerramientasGraficas imagenes,Juego juego ,JLabel lbl,JButton boton,JLabel lblTurno) 
	{
		lbl.setIcon(imagenes.ganadorO);		
		boton.setVisible(true);
		juego.setTurnoInicial('X');
		lblTurno.setVisible(false);
	}
	
	private void Turnos(Juego juego,HerramientasGraficas imagenes,JLabel lbl) 
	{
		juego.cambiarTurno();
		if(juego.getTurno()=='X')
		{
			lbl.setIcon(imagenes.turnoX);
		}
		else 
		{
			lbl.setIcon(imagenes.turnoO);
		}
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

	private void CambiarImagen(JLabel p1, JLabel p2, JLabel p3, JLabel p4, JLabel p5, JLabel p6, JLabel p7, JLabel p8, JLabel p9, int num, char letra ,HerramientasGraficas imagen) 
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

	
	private void TurnoImagen(JLabel label,Juego juego,HerramientasGraficas imagenes) 
	{
		if(juego.getTurnoInicial()=='X') 
		{
			label.setIcon(imagenes.turnoX);
			
		}
		else 
		{
			label.setIcon(imagenes.turnoO);
		}
	}
	
	private ImageIcon colocarSimbolo(Juego juego) { 
		if(juego.getTurno() == 'X') 
			return X;
		return O;	
	}
	
	public JFrame getFrame() {
		return frame;
	}
}