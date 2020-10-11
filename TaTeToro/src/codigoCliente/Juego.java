package codigoCliente;

public class Juego {
	private static char turno;
	private char[][] tablero;
	private static boolean habilitado;
	private static String Jugador1;
	private static String Jugador2;
	private Integer scoreJugador1; 
	private Integer scoreJugador2;
	
	public Juego() {
	
		turno = 'X';
		habilitado = true;
		scoreJugador1 = 0; scoreJugador2 = 0;
		tablero = new char[3][3];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j]= ' '; 			
			}		
		}	
		
		tablero[0][0]='1';
		tablero[0][1]='2';
		tablero[0][2]='3';
		tablero[1][0]='4';
		tablero[1][1]='5';
		tablero[1][2]='6';
		tablero[2][0]='7';
		tablero[2][1]='8';
		tablero[2][2]='9';
		}
	
	
	public Integer getScoreJugador1() {
		return scoreJugador1;
	}


	public void setScoreJugador1(Integer scoreJugador1) {
		this.scoreJugador1 = scoreJugador1;
	}


	public Integer getScoreJugador2() {
		return scoreJugador2;
	}


	public void setScoreJugador2(Integer scoreJugador2) {
		this.scoreJugador2 = scoreJugador2;
	}


	//-----------------------------------------------------------
	public void cambiarTurno() {
		if(turno == 'X') {
			turno = 'O';
			
		}
		else {
			turno = 'X';
		   
		}
	
	}
	
	//-----------------------------------------------------------
	public void agregarJugada(int num) {
		if(num==1 && habilitado==true) {
			if(turno == 'X') {
				tablero[0][0] = 'X';	
			}
			else {
				tablero[0][0] = 'O';
			}
		}
		if(num==2 && habilitado==true) {
			if(turno == 'X') {
				tablero[0][1] = 'X';
			}
			else {
				tablero[0][1] = 'O';
			}
		}
		if(num==3 && habilitado==true) {
			if(turno == 'X') {
				tablero[0][2] = 'X';
			}
			else {
				tablero[0][2] = 'O';
			}
		}
		if(num==4 && habilitado==true) {
			if(turno == 'X') {
				tablero[1][0] = 'X';
			}
			else {
				tablero[1][0] = 'O';
			}
		}
		if(num==5 && habilitado==true) {
			if(turno == 'X') {
				tablero[1][1] = 'X';
			}
			else {
				tablero[1][1] = 'O';
			}
		}
		if(num==6 && habilitado==true) {
			if(turno == 'X') {
				tablero[1][2] = 'X';
			}
			else {
				tablero[1][2] = 'O';
			}
		}
		if(num==7 && habilitado==true) {
			if(turno == 'X') {
				tablero[2][0] = 'X';
			}
			else {
				tablero[2][0] = 'O';
			}
		}
		if(num==8 && habilitado==true) {
			if(turno == 'X') {
				tablero[2][1] = 'X';
			}
			else {
				tablero[2][1] = 'O';
			}
		}
		if(num==9 && habilitado==true) {
			if(turno == 'X') {
				tablero[2][2] = 'X';
			}
			else {
				tablero[2][2] = 'O';
			}
		}
	}
	//-----------------------------------------------------------
	public boolean jugadaGanadora(int num) {
        if (num==1 || num==2 || num==3 || num==4 || num==5 || num==6 ||
        	num==7 || num==8 || num==9 || num==10 || num==11 || num==12	) 
        {
            return true;
        }
        else 
        {
            return false;
        }

    }

	//-----------------------------------------------------------
		public int listaGanadoras() 
	    {
	        if (tablero[0][0]==tablero[0][1]&& tablero[0][1]==tablero[0][2]) 
	        {
	        	return 1;
	        }
	        if (tablero[1][0]==tablero[1][1]&& tablero[1][1]==tablero[1][2])
	        {
	        	return 2;
	        }
	        if (tablero[2][0]==tablero[2][1]&& tablero[2][1]==tablero[2][2]) 
	        {
	        	return 3;
	        }
	        if (tablero[0][0]==tablero[1][1]&& tablero[1][1]==tablero[2][2]) 
	        {
	        	return 4;
	        }
	        if (tablero[0][2]==tablero[1][1]&& tablero[1][1]==tablero[2][0]) 
	        {
	        	return 5;
	        }
	        if (tablero[0][0]==tablero[1][0]&& tablero[1][0]==tablero[2][0]) 
	        {
	        	return 6;
	        }
	        if (tablero[0][1]==tablero[1][1]&& tablero[1][1]==tablero[2][1]) 
	        {
	        	return 7;
	        }
	        if (tablero[0][2]==tablero[1][2]&& tablero[1][2]==tablero[2][2]) 
	        {
	        	return 8;
	        }
	        if (tablero[0][1]==tablero[1][2]&& tablero[1][2]==tablero[2][0]) 
	        {
	        	return 9;
	        }
	        if (tablero[0][1]==tablero[1][0]&& tablero[1][0]==tablero[2][2]) 
	        {
	        	return 10;
	        }
	        if (tablero[2][1]==tablero[1][0]&& tablero[1][0]==tablero[0][2]) 
	        {
	        	return 11;
	        }
	        if (tablero[2][1]==tablero[1][2]&& tablero[1][2]==tablero[0][0])
	        {
	        	return 12;
	        } 
	        
	        return 0;
	        
	    }
	//-----------------------------------------------------------
	public void vaciarJugadas() {
		tablero[0][0] = '1';
		tablero[0][1] = '2';
		tablero[0][2] = '3';
		tablero[1][0] = '4';
		tablero[1][1] = '5';
		tablero[1][2] = '6';
		tablero[2][0] = '7';
		tablero[2][1] = '8';
		tablero[2][2] = '9';
		habilitado=true;
	}
	
	public static char getTurno() {
		return turno;
	}
	
	public static boolean isHabilitado() {
		return habilitado;
	}	

	public static String getJugador1() {
		return Jugador1;
	}


	public static void setJugador1(String jugador1) {
		Jugador1 = jugador1;
	}


	public static String getJugador2() {
		return Jugador2;
	}


	public static void setJugador2(String jugador2) {
		Jugador2 = jugador2;
	}
}
