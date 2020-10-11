package interfaz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import codigoCliente.Juego;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JFileChooser;

public class Usuarios {

	//VARIABLES
	private JFrame frame;
	private JTextField nJugador1;
	private JTextField nJugador2;
	public static JFileChooser fc = new JFileChooser();
	public File file;

	//CREA LA APLICACION
	public Usuarios() {
		initialize();
	}

	//INICIALIZA EL CONTENIDO DEL FRAME
	private void initialize() {
		
		//VENTANA DE USUARIOS
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.info);
		frame.setBounds(680, 130, 600, 700); //Mismo tamaño en todas las ventanas.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Imagenes img = new Imagenes();
		
		//TITULO DE LA VENTANA
		JLabel titulo = DefaultComponentFactory.getInstance().createTitle("Ingrese un nombre de usuario "
				+ "y una imagen o avatar para cada jugador.");
		titulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		titulo.setBounds(19, 23, 567, 41);
		frame.getContentPane().add(titulo);
		
		//BOTONES
		JButton btnJugar = new JButton("Jugar!");
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				PantallaDeJuego vent = new PantallaDeJuego();
				vent.getFrame().setVisible(true);
			}
		});
		btnJugar.setVerticalAlignment(SwingConstants.TOP);
		btnJugar.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		btnJugar.setBounds(245, 576, 96, 21);
		frame.getContentPane().add(btnJugar);
		btnJugar.setVisible(false);
		
		//IMAGENES
		//Imagen del Jugador 1.
		JLabel avatarJ1 = new JLabel("Jugador 1");
		avatarJ1.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		avatarJ1.setHorizontalAlignment(SwingConstants.CENTER);
		avatarJ1.setForeground(SystemColor.activeCaption);
		avatarJ1.setBackground(SystemColor.activeCaption);
		avatarJ1.setBounds(231, 202, 119, 108);
		frame.getContentPane().add(avatarJ1);
		
		//Imagen del Juagdor 2.
		JLabel avatarJ2 = new JLabel("Jugador 2");
		avatarJ2.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		avatarJ2.setHorizontalAlignment(SwingConstants.CENTER);
		avatarJ2.setForeground(SystemColor.activeCaption);
		avatarJ2.setBackground(SystemColor.activeCaption);
		avatarJ2.setBounds(231, 432, 119, 108);
		frame.getContentPane().add(avatarJ2);
		
		//Crea la barra editable donde el jugador 1 escribe su nombre de usuario.
		nJugador1 = new JTextField();
		nJugador1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Juego.setJugador1(nJugador1.getText());
				nJugador2.setEditable(true);
			}
		});
		nJugador1.setBounds(174, 139, 223, 31);
		frame.getContentPane().add(nJugador1);
		nJugador1.setColumns(10);
		
		//Crea la barra editable donde el jugador 2 escribe su nombre de usuario.		
		nJugador2 = new JTextField();
		nJugador2.setEditable(false);
		nJugador2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Juego.setJugador2(nJugador2.getText());
				btnJugar.setVisible(true);
			}
		});
		nJugador2.setColumns(10);
		nJugador2.setBounds(174, 361, 223, 31);
		frame.getContentPane().add(nJugador2);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Menu menu = new Menu();
				menu.getFrame().setVisible(true);
			}
		});
		btnAtras.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		btnAtras.setVerticalAlignment(SwingConstants.TOP);
		btnAtras.setBounds(245, 611, 95, 21);
		frame.getContentPane().add(btnAtras);
		
		JButton elegirJ2 = new JButton("Elegir");
		elegirJ2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int resultado;
	                resultado = fc.showOpenDialog(null);
	                
	                if(JFileChooser.APPROVE_OPTION == resultado) {
	                    file = fc.getSelectedFile();
	                    try {
	                    	img.setImagenJugador2(file.toString());
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
		elegirJ2.setVerticalAlignment(SwingConstants.TOP);
		elegirJ2.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		elegirJ2.setBounds(416, 475, 85, 21);
		frame.getContentPane().add(elegirJ2);
		
		JButton elegirJ1 = new JButton("Elegir");
		elegirJ1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int resultado;
	                resultado = fc.showOpenDialog(null);
	                if(JFileChooser.APPROVE_OPTION == resultado) {
	                    file = fc.getSelectedFile();
	                    try {
	                    	img.setImagenJugador1(file.toString());
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
		elegirJ1.setVerticalAlignment(SwingConstants.TOP);
		elegirJ1.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		elegirJ1.setBounds(416, 245, 85, 21);
		frame.getContentPane().add(elegirJ1);
		
		JLabel Jugador1 = new JLabel("Jugador 1");
		Jugador1.setHorizontalAlignment(SwingConstants.CENTER);
		Jugador1.setFont(new Font("Showcard Gothic", Font.PLAIN, 18));
		Jugador1.setBounds(222, 98, 118, 31);
		frame.getContentPane().add(Jugador1);
		
		JLabel Jugador2 = new JLabel("Jugador 2");
		Jugador2.setHorizontalAlignment(SwingConstants.CENTER);
		Jugador2.setFont(new Font("Showcard Gothic", Font.PLAIN, 18));
		Jugador2.setBounds(222, 320, 119, 31);
		frame.getContentPane().add(Jugador2);
	}

	//GETTERS Y SETTERS DEL FRAME
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
		frame.getContentPane().setBackground(SystemColor.info);
	}
}
