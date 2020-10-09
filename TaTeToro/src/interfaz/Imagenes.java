package interfaz;

import javax.swing.ImageIcon;

// despues decidir si hacer esta clase static o public

	public class Imagenes {
	
	public ImageIcon backgroundMenu;
	public ImageIcon recuadroBackgroundMenu;
	public ImageIcon botonJugar;
	public ImageIcon botonReglas;
	public ImageIcon botonSalir;
	public ImageIcon botonAtras;
	public ImageIcon tablero;
	public ImageIcon fondoTablero;
	public ImageIcon x;
	public ImageIcon o;
	public ImageIcon turnoO;
	public ImageIcon turnoX;
	public ImageIcon iconX;
	public ImageIcon iconO;
	
	Imagenes(){
		//backgroundMenu = new ImageIcon ("/imagenesDelFondo/gifBackground.gif");
		backgroundMenu = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/gifBackground.gif"));
		recuadroBackgroundMenu = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/recuadroBackground.png"));
		botonJugar = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/botonJugar4.png"));
		botonReglas = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/botonReglas.png"));
		botonSalir = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/botonSalir.png"));
		botonAtras = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/botonAtras.png"));
//-------------------------------------
		tablero = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/tablero.png"));
		fondoTablero = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/fondoTablero.png"));
		x = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/Xr.png"));
		o = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/oa2.png"));		
		turnoO = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/turno O3.png"));
		turnoX = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/turno X3.png"));
		iconX = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/scoreX.png"));
		iconO = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/scoreO.png"));
		
		
	}
	

}
