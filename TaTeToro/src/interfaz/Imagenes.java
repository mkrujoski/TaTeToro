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
	public ImageIcon x_ganadora;
	public ImageIcon o_ganadora;
	public ImageIcon turnoO;
	public ImageIcon turnoX;
	public ImageIcon iconX;
	public ImageIcon iconO;
	public ImageIcon ImagenJ1;
	public ImageIcon ImagenJ2;
	
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
	public void setImagenJugador1(String path) {
		
        ImagenJ1 = new ImageIcon(path);
    }
    public void setImagenJugador2(String path) {
        ImagenJ2 = new ImageIcon(path);
    }
}