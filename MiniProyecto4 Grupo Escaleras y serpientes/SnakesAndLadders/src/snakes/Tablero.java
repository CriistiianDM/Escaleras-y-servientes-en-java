package snakes;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tablero extends JLabel implements Runnable {

	
/*terminos y condiciones
 * 
 * #1 QUIEN VIOLE LA SYNTAXIS EXPUESTA EN ESTE CODGIGO SERA EXPULSADO
 * #2 RESPETAR LOS NOMBRES DE LAS FUNCIONES
 * #3 QUIEN HAGA INSTANCIAS EN LOS ATRIBUTOS QUEDA EXPULSADO INMEDIATAMENTE DEL PROYECTO!!!!!!!
 * #4 PASARLA BIEN
 */
	
	
 /* guia basica de la syntaxis
  * 
  *  declaracion de metodos sera asi:  exmaple_exmaple() {}
  *  declaracion de variables sera asi: name_name !!!!
  *  PRIMERO SE INSTANCIAN LOS ATRIBUTOS DE LA CLASE EN ESTE ORDEN: OBJECTOS DE LA CLASE, PANEL , JBUTTON , JLABEL , BOLEANOS , ENTEROS , STRING , FUNCIONES (VAN A VER CAMBIOS)
  *  ODERN DE LLAMADO DE LAS IMPORTACIONES UTIL , SWING , PROYECTOS ,OTRAS
  * */	
	
	
//ZONA #1
	
//En esta zona estara los atributos de la clase
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
	
	
	//ATRIBUTOS
	private ImageIcon fondo , aux;
	private int col = 0;
	private int row = 9;
	private int xJ1=0, yJ1=9 , xJ2=0, yJ2=9, xJ3=0, yJ3=9;
	private int contadorPosiciones=0;
	private int dado,  dadoAux = 1;
	private boolean band = true ,  bandAux = true ,  bandJ1= true, bandJ2 = true, bandJ3 = true;
	private Tablero[][] tablero1 , tablero2 , tablero3, tablero4;
	private boolean activarboton = true;
	private int ronda = 0 , tiempoDados = 0;
	private boolean timeDado = true;
	private JButton botonDado;
	private String[] rutas_personajes = {"src/img/m.png","src/img/l.png","src/img/p.png"};
	private int personaje_2 , personaje_3;
    private String[] rutas_personajes_rondas = {"src/img/marioKart.png" , "src/img/luigui.png", "src/img/princesa.png"};
    private JLabel turnoJugador;
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/		

	
	                                                       /* FIN ZONA #1*/
	
//ZONA #2
	
//En esta zona estaran los costructores de la clase


	/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
    public Tablero() {
    	setBackground(new Color(0,0,0,0));
    	setSize(80,70);
    }
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	

                                                           /* FIN ZONA #2*/

//Zona #3
	
//En esta zona estara la parte de la configuracion de la interfaz
	

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
	
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	

	
                                                           /* FIN ZONA #3*/	
//Zona #4
	
//En esta zona estaran los getters and setters de la clase
	

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
	
    public boolean isActivarboton() {
		return activarboton;
	}

	public void setActivarboton(boolean activarboton) {
		this.activarboton = activarboton;
	}
	public void setBand(boolean band) {
		this.band = band;
	}

	public void setBandAux(boolean bandAux) {
		this.bandAux = bandAux;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	public int getXmario() {
		return xJ1;
	}
	public int getYmario() {
		return yJ1;
	}
	public boolean isBandMario() {
		return bandJ1;
	}
	public String[] getRutas_personajes() {
		return rutas_personajes;
	}

	public String[] getRutas_personajes_rondas() {
		return rutas_personajes_rondas;
	}


	public void setxJ1(int xJ1) {
		this.xJ1 = xJ1;
	}

	public void setyJ1(int yJ1) {
		this.yJ1 = yJ1;
	}

	public void setxJ2(int xJ2) {
		this.xJ2 = xJ2;
	}

	public void setyJ2(int yJ2) {
		this.yJ2 = yJ2;
	}

	public void setxJ3(int xJ3) {
		this.xJ3 = xJ3;
	}

	public void setyJ3(int yJ3) {
		this.yJ3 = yJ3;
	}



/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


	                                                      /* FIN ZONA #4*/	

//Zona #5
	
//En esta zona estaran los metodos de la clase
		

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
	
	
	
	public void movimiento_players(Tablero[][] tablero , int numDado , int col1 , int row1 , String ruta ,  JButton botonaux , int personaje2 , int personaje3 , boolean bandera , Tablero[][] tablero22 , Tablero[][] tablero33,Tablero[][] tablero44 , JLabel jugadorRonda1) {
	 fondo = new ImageIcon(ruta);	
	 tablero1 = tablero;
	 dado = numDado;
	 col = col1;
	 row = row1;
	 botonDado = botonaux;
	 personaje_2 = personaje2;
	 personaje_3 = personaje3;
	 bandAux= bandera;
     tablero2 = tablero22;
     tablero3 = tablero33;
     tablero4 = tablero44;
     turnoJugador = jugadorRonda1;
	}
	
	public void sube_y_baja(int col1,int row1) {
		
	  // condiciones casillas que suben
		//flechas azul marino
		if(col1 == 1 && row1 == 9) {
			tablero1[row][col-1].setIcon(null);
			bandAux = false;
			col= 9;
			row= 8;
			tablero1[row][col].setIcon(fondo);
			//col++;
		}
		//flecha morada
		if(col1 == 3 && row1 == 6) {
			tablero1[row][col+1].setIcon(null);
			bandAux = true;
			col= 7;
			row= 3;
			tablero1[row][col].setIcon(fondo);
			//col++;
		}
		//flecha verde sin relleno
		if(col1 == 0 && row1 == 2) {
			tablero1[row][col+1].setIcon(null);
			bandAux = false;
			col= 9;
			row= 0;
			tablero1[row][col].setIcon(fondo);
			//col++;
		}
	 // condiciones casillas que bajan
		//flecha rosada sin relleno
		if(col1 == 1 && row1 == 0) {
			tablero1[row][col+1].setIcon(null);
			bandAux = true;
			col= 6;
			row= 5;
			tablero1[row][col].setIcon(fondo);
			//col++;
		}
		//flecha vino tinto
		if(col1 == 2 && row1 == 7) {
			tablero1[row][col-1].setIcon(null);
			bandAux=true;
			col= 4;
			row= 9;
			tablero1[row][col].setIcon(fondo);
			//col++;
		}
		// flecha azul oscuro
		if(col1 == 0 && row1 == 5) {
			tablero1[row][col-1].setIcon(null);
			bandAux= false;
			col= 7;
			row= 8;
			tablero1[row][col].setIcon(fondo);
			//col++;
		}
		
	}
	
	
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


		                                                   /* FIN ZONA #5*/
//Zona #6
	
//En esta zona estaran los hilos de la clase
			



	/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
	@Override
	public void run() {
		
		while (band) {
			
			try {
				
			 if( dadoAux <= dado) {
				 
				Thread.sleep(700);
				
				if (col == -1 && row == 0) {
					band = false;
				} else {
				
				if (col  > 9 && bandAux) {
					tablero1[row][col-1].setIcon(null);
					 row--;
					 col--;
					 bandAux = false;
				}
				
				if(col== -1 && !bandAux) {
					col=0;
					tablero1[row][col].setIcon(null);
					row--;
					bandAux = true;
					
				}
				
				
				if(bandAux) {
					
					if (col == 0) {
						tablero1[row][col].setIcon(fondo);
					}
					
					else {
											
						tablero1[row][col-1].setIcon(null);
	                    tablero1[row][col].setIcon(fondo);	  
					}				
				}
				
				else {
					
					if (col == 9) {
						tablero1[row][col].setIcon(fondo);
					}
					
					else {
				
						tablero1[row][col+1].setIcon(null);
						tablero1[row][col].setIcon(fondo);

					}
				}
				
				//System.out.println(" ensayo antes!!!" + col);
				if (bandAux && col<10) {
				col++;
				}else {
				col--;
				}
				
				//System.out.println(" ensayo despues!!!" + col);
				dadoAux++;
				}
				
			 }else {
				 
				 
				 if(contadorPosiciones == 0 ) {
					 
					 if(bandAux) {
						 sube_y_baja(col-1,row);
					 }
					 else {
						 sube_y_baja(col+1,row);
					 }
					 xJ1 = col;
					 yJ1 = row;
					 bandJ1 = bandAux;
					 
				 }
				 else if(contadorPosiciones == 1) {
					 
					 if(bandAux) {
						 sube_y_baja(col-1,row);
					 }
					 else {
						 sube_y_baja(col+1,row);
					 }
					 xJ2 = col;
					 yJ2 = row;
					 bandJ2 = bandAux;
		
				 }
				 else if(contadorPosiciones == 2) {
					 
					 if(bandAux) {
						 sube_y_baja(col-1,row);
					 }
					 else {
						 sube_y_baja(col+1,row);
					 }
					 xJ3= col;
					 yJ3=row;
					 bandJ3 = bandAux;
				 }
				 
				 
				 if (ronda < 2) {
					 
				 //mostrar animacion del dado
				 if (timeDado) {
					 timeDado = false;
					 fondo= new ImageIcon("src/img/dadoGit.gif");
					 botonDado.setIcon(fondo);
				 }
				 
				 //detener la animacion dado
				 if ( tiempoDados == 3) {
					
					 //se genera nuevo numero random
					 int wordRandom = 0;
					 Random getWord = new Random();
					 wordRandom =  getWord.nextInt(6)+1;
					 
					 //pasar imagen
					 fondo = new ImageIcon("src/img/"+wordRandom+".png");
					 botonDado.setIcon(fondo);
					 
					 if (ronda == 0) {
				     tablero4[0][0].movimiento_players(tablero2, wordRandom, xJ2,yJ2,rutas_personajes[personaje_2], botonDado , personaje_2 , personaje_3, bandJ2, tablero2 , tablero3 , tablero4 , turnoJugador);
				     aux = new ImageIcon(rutas_personajes_rondas[personaje_2]);
				     turnoJugador.setIcon(aux);
					 }
					 else {
					 tablero4[0][0].movimiento_players(tablero3, wordRandom, xJ3, yJ3, rutas_personajes[personaje_3], botonDado , personaje_2 , personaje_3,bandJ3, tablero2 , tablero3, tablero4 , turnoJugador); 
					 aux = new ImageIcon(String.valueOf( rutas_personajes_rondas[personaje_3] ));
					 turnoJugador.setIcon(aux);
					 }
					 
					 tiempoDados = 0;
				     dadoAux = 1;
				     timeDado = true;
				     ronda++;
				     contadorPosiciones++;
					 
				 }
				 
				 
				 tiempoDados++; 
			
				 Thread.sleep(1000);
				 }else {
					 band = false;
					 //bandAux = true;
					 tablero4[0][0].setActivarboton(true);
					 dadoAux =1;
					 tiempoDados = 0;
					 ronda = 0;
					 contadorPosiciones = 0;
					 timeDado = true;
				 }
		
			 }
			 
			 
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}
   
	}




			
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


			                                               /* FIN ZONA #6*/	

//Zona #7
	
//En esta zona estaran los escuchas de las clases
		

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
		
		
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


		                                                      /* FIN ZONA #7*/	

}
