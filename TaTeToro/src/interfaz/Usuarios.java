package interfaz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
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
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuarios {

	//VARIABLES
	private JFrame frame;
	private JTextField nJugador1;
	private JTextField nJugador2;
	public static JFileChooser fc = new JFileChooser();
	public File file;
	public Imagenes img;
	private JLabel avatarJ1;

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
		frame.setUndecorated(true); //borra la barra de arriba
		frame.getContentPane().setBackground(Color.decode("#93e9ef")); //COLOR DE FONDO
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Imagenes img = new Imagenes();
		
		//BOTONES
		JButton btnJugar = new JButton("");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnJugar.setIcon(img.botonJugar);
		btnJugar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.desktop));
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				PantallaDeJuego vent = new PantallaDeJuego();
				vent.getFrame().setVisible(true);
			}
		});
		btnJugar.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		btnJugar.setBounds(243, 627, 131, 33);
		frame.getContentPane().add(btnJugar);
		btnJugar.setVisible(false);
		
		//IMAGENES
		//Imagen del Jugador 1.
		avatarJ1 = new JLabel("?");
		avatarJ1.setVerticalAlignment(SwingConstants.BOTTOM);
		avatarJ1.setHorizontalAlignment(SwingConstants.CENTER);
		avatarJ1.setBorder(new LineBorder(new Color(102, 204, 255)));
		avatarJ1.setFont(new Font("Anthology Regular DEMO", Font.PLAIN, 60));
		avatarJ1.setForeground(new Color(51, 153, 204));
		avatarJ1.setBackground(SystemColor.activeCaption);
		avatarJ1.setBounds(243, 150, 119, 108);
		frame.getContentPane().add(avatarJ1);
		
		//Imagen del Juagdor 2.
		JLabel avatarJ2 = new JLabel("?");
		avatarJ2.setVerticalAlignment(SwingConstants.BOTTOM);
		avatarJ2.setBorder(new LineBorder(new Color(102, 204, 255)));
		avatarJ2.setFont(new Font("Anthology Regular DEMO", Font.PLAIN, 60));
		avatarJ2.setHorizontalAlignment(SwingConstants.CENTER);
		avatarJ2.setForeground(new Color(51, 153, 204));
		avatarJ2.setBackground(SystemColor.activeCaption);
		avatarJ2.setBounds(243, 446, 119, 108);
		frame.getContentPane().add(avatarJ2);
		
		//Crea la barra editable donde el jugador 1 escribe su nombre de usuario.
		nJugador1 = new JTextField();
		nJugador1.setBounds(186, 108, 223, 31);
		frame.getContentPane().add(nJugador1);
		nJugador1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Juego.setJugador1(nJugador1.getText());
				nJugador2.setEditable(true);
			}
		});
		//nJugador1.setColumns(10);
		
		//Crea la barra editable donde el jugador 2 escribe su nombre de usuario.		
		nJugador2 = new JTextField();
	//	nJugador2.setEditable(false);
		//nJugador2.setColumns(10);
		nJugador2.setBounds(186, 397, 223, 31);
		frame.getContentPane().add(nJugador2);
		nJugador2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Juego.setJugador2(nJugador2.getText());
				btnJugar.setVisible(true);
			}
		});
		
		JButton btnAtras = new JButton("");
		btnAtras.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.desktop));
		btnAtras.setIcon(img.botonAtras);
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Menu menu = new Menu();
				menu.getFrame().setVisible(true);
			}
		});
		btnAtras.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		btnAtras.setBounds(19, 656, 131, 33);
		frame.getContentPane().add(btnAtras);
		
		JButton elegirJ2 = new JButton("");
		elegirJ2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		elegirJ2.setIcon(new ImageIcon(Usuarios.class.getResource("/imagenesDelFondo/botonElegir1.png")));
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
		elegirJ2.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		elegirJ2.setBounds(253, 567, 99, 33);
		frame.getContentPane().add(elegirJ2);
		
		JButton elegirJ1 = new JButton("");
		elegirJ1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 0)));
		elegirJ1.setIcon(new ImageIcon(Usuarios.class.getResource("/imagenesDelFondo/botonElegir1.png")));
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
		elegirJ1.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		elegirJ1.setBounds(253, 269, 99, 33);
		frame.getContentPane().add(elegirJ1);
		
		JButton btnSalir = new JButton("");
		btnSalir.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		btnSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.desktop));
		btnSalir.setBounds(455, 656, 131, 33);
		btnSalir.setIcon(img.botonSalir);
		frame.getContentPane().add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Usuarios.class.getResource("/imagenesDelFondo/fondoUsuario.png")));
		lblNewLabel.setBounds(0, 0, 600, 718);
		frame.getContentPane().add(lblNewLabel);
		
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		
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
