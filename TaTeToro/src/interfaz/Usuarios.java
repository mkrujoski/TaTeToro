package interfaz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;

import java.awt.SystemColor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import logica.Juego;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuarios {

	//VARIABLES
	private JFrame frame;
	private JTextField nJugador1;
	private JTextField nJugador2;
	public static JFileChooser fc = new JFileChooser();
	public File file;
	private JLabel avatarJ1;

	//CREA LA APLICACION
	public Usuarios(Juego juego, Imagenes imagenes) {
		initialize(juego,imagenes);
	}

	//INICIALIZA EL CONTENIDO DEL FRAME
	private void initialize(Juego juego, Imagenes imagenes) {
		
		//VENTANA DE USUARIOS
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.info);
		frame.setBounds(680, 130, 600, 700); //Mismo tamaño en todas las ventanas.
		frame.setUndecorated(true); //borra la barra de arriba
		frame.getContentPane().setBackground(Color.decode("#93e9ef")); //COLOR DE FONDO
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//---------------Inicializacion de label y botones-----------------------------
		
		JButton btnJugar = new JButton("");
		avatarJ1 = new JLabel("");
		JLabel avatarJ2 = new JLabel("");
		nJugador1 = new JTextField();
		nJugador2 = new JTextField();
		JButton btnAtras = new JButton("");
		JButton elegirJ2 = new JButton("");
		JButton elegirJ1 = new JButton("");
		JButton btnSalir = new JButton("");
		JButton GuardarJ2 = new JButton("");
		JButton GuardarJ1 = new JButton("");
		JLabel lblFondoSeleccionUsuarios = new JLabel("");
		
		//--------------Creacion de label y botones--------------------------------------
		
		btnJugar.setIcon(imagenes.botonJugar);
		btnJugar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.desktop));
		btnJugar.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		btnJugar.setBounds(241, 629, 131, 33);
		frame.getContentPane().add(btnJugar);
		btnJugar.setVisible(false);
		
		//--------------------------------------------------------------------------------
		//Imagen del Jugador 1.
		
		avatarJ1.setIcon(imagenes.ImagenJ1);
		avatarJ1.setVerticalAlignment(SwingConstants.BOTTOM);
		avatarJ1.setHorizontalAlignment(SwingConstants.CENTER);
		avatarJ1.setBorder(new LineBorder(new Color(102, 204, 255)));
		avatarJ1.setBackground(SystemColor.activeCaption);
		avatarJ1.setBounds(243, 149, 119, 108);
		frame.getContentPane().add(avatarJ1);
		
		//--------------------------------------------------------------------------------
		//Imagen del Juagdor 2.
		
		avatarJ2.setIcon(imagenes.ImagenJ2);
		avatarJ2.setVerticalAlignment(SwingConstants.BOTTOM);
		avatarJ2.setBorder(new LineBorder(new Color(102, 204, 255)));
		avatarJ2.setHorizontalAlignment(SwingConstants.CENTER);
		avatarJ2.setBackground(SystemColor.activeCaption);
		avatarJ2.setBounds(243, 446, 119, 108);
		frame.getContentPane().add(avatarJ2);
		
		//--------------------------------------------------------------------------------
		//Crea la barra editable donde el jugador 1 escribe su nombre de usuario.
		
		nJugador1.setBounds(186, 108, 223, 31);
		nJugador1.setColumns(10);
		frame.getContentPane().add(nJugador1);
		
		//--------------------------------------------------------------------------------
		//Crea la barra editable donde el jugador 2 escribe su nombre de usuario.		
		
		nJugador2.setEditable(false);
		nJugador2.setColumns(10);
		nJugador2.setBounds(186, 397, 223, 31);
		frame.getContentPane().add(nJugador2);
		
		//--------------------------------------------------------------------------------
		
		btnAtras.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.desktop));
		btnAtras.setIcon(imagenes.botonAtras);
		btnAtras.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		btnAtras.setBounds(19, 656, 131, 33);
		frame.getContentPane().add(btnAtras);
		
		//--------------------------------------------------------------------------------
		
		elegirJ2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		elegirJ2.setIcon(imagenes.botonElegir);
		elegirJ2.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		elegirJ2.setBounds(253, 567, 99, 33);
		frame.getContentPane().add(elegirJ2);
		
		//--------------------------------------------------------------------------------
		
		elegirJ1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		elegirJ1.setIcon(imagenes.botonElegir);
		elegirJ1.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		elegirJ1.setBounds(253, 275, 99, 33);
		frame.getContentPane().add(elegirJ1);
		
		//--------------------------------------------------------------------------------
		
		btnSalir.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		btnSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.desktop));
		btnSalir.setBounds(455, 656, 131, 33);
		btnSalir.setIcon(imagenes.botonSalir);
		frame.getContentPane().add(btnSalir);
		
		//--------------------------------------------------------------------------------
        
		GuardarJ1.setIcon(imagenes.botonGuardar);
		GuardarJ1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
		GuardarJ1.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		GuardarJ1.setBounds(419, 108, 99, 33);
		frame.getContentPane().add(GuardarJ1);
		
       
		      
        //--------------------------------------------------------------------------------
		        
		 GuardarJ2.setIcon(imagenes.botonGuardar);
	     GuardarJ2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, Color.BLACK));
	     GuardarJ2.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
	     GuardarJ2.setBounds(419, 397, 99, 33);
	     frame.getContentPane().add(GuardarJ2);
		
		//--------------------------------------------------------------------------------
		
		lblFondoSeleccionUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondoSeleccionUsuarios.setIcon(imagenes.fondoUsuarios);
		lblFondoSeleccionUsuarios.setBounds(0, 0, 600, 718);
		frame.getContentPane().add(lblFondoSeleccionUsuarios);
		
		//--------------Acciones de Botones------------------------------
		
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				PantallaDeJuego vent = new PantallaDeJuego(juego,imagenes);
				vent.getFrame().setVisible(true);
			}
		});
		
		//----------------------------------------------------------------
		
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Menu menu = new Menu();
				menu.getFrame().setVisible(true);
			}
		});
		
		//----------------------------------------------------------------
		
		elegirJ1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int resultado;
	                resultado = fc.showOpenDialog(null);
	                if(JFileChooser.APPROVE_OPTION == resultado) {
	                    file = fc.getSelectedFile();
	                    try {
	                    	imagenes.setImagenJugador1(file.toString());
	                        ImageIcon icon = new ImageIcon(file.toString());
	                        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(avatarJ1.getWidth(), avatarJ1.getHeight(), Image.SCALE_DEFAULT));
	                        avatarJ1.setText(null);
	                        avatarJ1.setIcon(icono);
	                    }
	                    catch(Exception ex) {
	                        JOptionPane.showMessageDialog(null, "No se puede abrir el archivo");
	                    }
	                }
			}
		});
		
		
		//----------------------------------------------------------------
		
		elegirJ2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int resultado;
	                resultado = fc.showOpenDialog(null);
	                
	                if(JFileChooser.APPROVE_OPTION == resultado) {
	                    file = fc.getSelectedFile();
	                    try {
	                    	imagenes.setImagenJugador2(file.toString());
	                        ImageIcon icon = new ImageIcon(file.toString());
	                        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(avatarJ2.getWidth(), avatarJ2.getHeight(), Image.SCALE_DEFAULT));
	                        avatarJ2.setText(null);
	                        avatarJ2.setIcon(icono);
	                    }
	                    catch(Exception ex) {
	                        JOptionPane.showMessageDialog(null, "No se puede abrir el archivo");
	                    }
	                }
			}
		});
		
		
		//----------------------------------------------------------------
		
		GuardarJ1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	Juego.setJugador1(nJugador1.getText());
		    	if(!Juego.getJugador1().isEmpty()) {
		        nJugador1.setEditable(false);
		        nJugador2.setEditable(true);
		        GuardarJ1.setEnabled(false);
		    	}
		    }
		});
		
		
		//----------------------------------------------------------------
		
		GuardarJ2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	Juego.setJugador2(nJugador2.getText());
            	if(!Juego.getJugador1().isEmpty() && !Juego.getJugador2().isEmpty()) {
                nJugador2.setEditable(false);
                btnJugar.setVisible(true);
                GuardarJ2.setEnabled(false);
            	}
            }
        });
		
		//----------------------------------------------------------------
		
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		
	}

	//------------------Metodos Auxiliares----------------------------------
	

	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
		frame.getContentPane().setBackground(SystemColor.info);
	}
}