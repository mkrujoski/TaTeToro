package interfaz;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;

// despues decidir si hacer esta clase static o public

	public class HerramientasGraficas {
	
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
	
	HerramientasGraficas() {
		//backgroundMenu = new ImageIcon ("/imagenesDelFondo/gifBackground.gif");
		backgroundMenu = new ImageIcon(HerramientasGraficas.class.getResource("/gifBackground.gif"));
		recuadroBackgroundMenu = new ImageIcon(HerramientasGraficas.class.getResource("/recuadroBackground.png"));
		botonJugar = new ImageIcon(HerramientasGraficas.class.getResource("/botonJugar4.png"));
		botonReglas = new ImageIcon(HerramientasGraficas.class.getResource("/botonReglas.png"));
		botonSalir = new ImageIcon(HerramientasGraficas.class.getResource("/botonSalir.png"));
		botonAtras = new ImageIcon(HerramientasGraficas.class.getResource("/botonAtras.png"));
		botonElegir = new ImageIcon(HerramientasGraficas.class.getResource("/botonElegir1.png"));
		botonGuardar = new ImageIcon(HerramientasGraficas.class.getResource("/botonGuardar.png"));
		botonSi = new ImageIcon(HerramientasGraficas.class.getResource("/botonSi.png"));
		botonNo = new ImageIcon(HerramientasGraficas.class.getResource("/botonNo.png"));
		botonInfo = new ImageIcon(HerramientasGraficas.class.getResource("/botonInfo.png"));
		botonVolverAJugar = new ImageIcon(HerramientasGraficas.class.getResource("/botonVolverAJugar.png"));
		
//-------------------------------------
		tablero = new ImageIcon(HerramientasGraficas.class.getResource("/tablero.png"));
		fondoTablero = new ImageIcon(HerramientasGraficas.class.getResource("/fondoTablero.gif"));
		x = new ImageIcon(HerramientasGraficas.class.getResource("/Xr.png"));
		o = new ImageIcon(HerramientasGraficas.class.getResource("/oa2.png"));		
		turnoO = new ImageIcon(HerramientasGraficas.class.getResource("/turno O3.png"));
		turnoX = new ImageIcon(HerramientasGraficas.class.getResource("/turno X3.png"));
		iconX = new ImageIcon(HerramientasGraficas.class.getResource("/scoreX.png"));
		iconO = new ImageIcon(HerramientasGraficas.class.getResource("/scoreO.png"));
		x_ganadora = new ImageIcon(HerramientasGraficas.class.getResource("/XGanadora.png"));
		o_ganadora = new ImageIcon(HerramientasGraficas.class.getResource("/OGanadora.png"));
		ganadorX = new ImageIcon(HerramientasGraficas.class.getResource("/ganadorX.png"));
		ganadorO = new ImageIcon(HerramientasGraficas.class.getResource("/ganadorO.png"));
		ImagenJ1 = new ImageIcon(HerramientasGraficas.class.getResource("/incognita.png"));
		ImagenJ2 = new ImageIcon(HerramientasGraficas.class.getResource("/incognita.png"));
		fondoUsuarios = new ImageIcon(HerramientasGraficas.class.getResource("/fondoUsuarios.gif"));
		fondoSalida = new ImageIcon(HerramientasGraficas.class.getResource("/backgroundInternalFrame1.png"));
		instrucciones = new ImageIcon(HerramientasGraficas.class.getResource("/instrucciones1.png"));
		

	}
	
	public void reseteo(ImageIcon imagen) 
	{
		imagen = new ImageIcon(HerramientasGraficas.class.getResource("/incognita.png"));
	}
	
	public Font getFont() {
		Font font = null;
		try {
		font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File ("Anthology-SansDEMO.ttf"))).deriveFont(Font.PLAIN, 19);
		}	
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return font;
	}
	
	public void setImagenJugador1(String path) {
		
        ImagenJ1 = new ImageIcon(path);
    }
    public void setImagenJugador2(String path) {
        ImagenJ2 = new ImageIcon(path);
    }
}