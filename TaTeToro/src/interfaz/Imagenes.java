package interfaz;

import javax.swing.ImageIcon;

// despues decidir si hacer esta clase static o public

//DE MOMENTO ESTÁ STATIC

	public class Imagenes {
	
	static ImageIcon backgroundMenu;
	static ImageIcon recuadroBackgroundMenu;
	static ImageIcon botonJugar;
	static ImageIcon botonReglas;
	static ImageIcon botonSalir;
	static ImageIcon botonAtras;
	static ImageIcon tablero;
	static ImageIcon fondoTablero;
	static ImageIcon x;
	static ImageIcon o;
	static ImageIcon x_ganadora;
	static ImageIcon o_ganadora;
	static ImageIcon turnoO;
	static ImageIcon turnoX;
	static ImageIcon iconX;
	static ImageIcon iconO;
	
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
		fondoTablero = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/fondoTablero.gif"));
		x = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/Xr.png"));
		o = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/oa2.png"));		
		turnoO = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/turno O3.png"));
		turnoX = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/turno X3.png"));
		iconX = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/scoreX.png"));
		iconO = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/scoreO.png"));
		x_ganadora = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/XGanadora.png"));
		o_ganadora = new ImageIcon(Imagenes.class.getResource("/imagenesDelFondo/OGanadora.png"));
		
		
	}
	

}
