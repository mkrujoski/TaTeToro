package interfaz;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;

// despues decidir si hacer esta clase static o public

	public class Imagenes {
	
	public ImageIcon backgroundMenu;
	public ImageIcon recuadroBackgroundMenu;
	public ImageIcon botonJugar;
	public ImageIcon botonReglas;
	public ImageIcon botonSalir;
	public ImageIcon botonAtras;
	public ImageIcon botonElegir;
	public ImageIcon botonSi;
	public ImageIcon botonNo;
	public ImageIcon botonGuardar;
	public ImageIcon botonInfo;
	public ImageIcon botonVolverAJugar;
	public ImageIcon tablero;
	public ImageIcon fondoTablero;
	public ImageIcon fondoUsuarios;
	public ImageIcon fondoSalida;
	public ImageIcon instrucciones;
	public ImageIcon x;
	public ImageIcon o;
	public ImageIcon x_ganadora;
	public ImageIcon o_ganadora;
	public ImageIcon turnoO;
	public ImageIcon turnoX;
	public ImageIcon iconX;
	public ImageIcon iconO;
	public ImageIcon ImagenJ1;
	public ImageIcon ImagenJ2;
	public ImageIcon ganadorX;
	public ImageIcon ganadorO;
	public Font font;
	
	Imagenes() {
		//backgroundMenu = new ImageIcon ("/imagenesDelFondo/gifBackground.gif");
		backgroundMenu = new ImageIcon(Imagenes.class.getResource("/gifBackground.gif"));
		recuadroBackgroundMenu = new ImageIcon(Imagenes.class.getResource("/recuadroBackground.png"));
		botonJugar = new ImageIcon(Imagenes.class.getResource("/botonJugar4.png"));
		botonReglas = new ImageIcon(Imagenes.class.getResource("/botonReglas.png"));
		botonSalir = new ImageIcon(Imagenes.class.getResource("/botonSalir.png"));
		botonAtras = new ImageIcon(Imagenes.class.getResource("/botonAtras.png"));
		botonElegir = new ImageIcon(Imagenes.class.getResource("/botonElegir1.png"));
		botonGuardar = new ImageIcon(Imagenes.class.getResource("/botonGuardar.png"));
		botonSi = new ImageIcon(Imagenes.class.getResource("/botonSi.png"));
		botonNo = new ImageIcon(Imagenes.class.getResource("/botonNo.png"));
		botonInfo = new ImageIcon(Imagenes.class.getResource("/botonInfo.png"));
		botonVolverAJugar = new ImageIcon(Imagenes.class.getResource("/botonVolverAJugar.png"));
		
//-------------------------------------
		tablero = new ImageIcon(Imagenes.class.getResource("/tablero.png"));
		fondoTablero = new ImageIcon(Imagenes.class.getResource("/fondoTablero.gif"));
		x = new ImageIcon(Imagenes.class.getResource("/Xr.png"));
		o = new ImageIcon(Imagenes.class.getResource("/oa2.png"));		
		turnoO = new ImageIcon(Imagenes.class.getResource("/turno O3.png"));
		turnoX = new ImageIcon(Imagenes.class.getResource("/turno X3.png"));
		iconX = new ImageIcon(Imagenes.class.getResource("/scoreX.png"));
		iconO = new ImageIcon(Imagenes.class.getResource("/scoreO.png"));
		x_ganadora = new ImageIcon(Imagenes.class.getResource("/XGanadora.png"));
		o_ganadora = new ImageIcon(Imagenes.class.getResource("/OGanadora.png"));
		ganadorX = new ImageIcon(Imagenes.class.getResource("/ganadorX.png"));
		ganadorO = new ImageIcon(Imagenes.class.getResource("/ganadorO.png"));
		ImagenJ1 = new ImageIcon(Imagenes.class.getResource("/incognita.png"));
		ImagenJ2 = new ImageIcon(Imagenes.class.getResource("/incognita.png"));
		fondoUsuarios = new ImageIcon(Imagenes.class.getResource("/fondoUsuarios.gif"));
		fondoSalida = new ImageIcon(Imagenes.class.getResource("/backgroundInternalFrame1.png"));
		instrucciones = new ImageIcon(Imagenes.class.getResource("/instrucciones1.png"));
		
//		File font_file = new File("Anthology-SansDEMO.ttf");
//		Font font = Font.createFont(0, font_file);
	}
	
	
	public void setImagenJugador1(String path) {
		
        ImagenJ1 = new ImageIcon(path);
    }
    public void setImagenJugador2(String path) {
        ImagenJ2 = new ImageIcon(path);
    }
}