package snakes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


import MisComponentes.BorderK;

/*
 * 202022752
Juan felipe osorio zapata. 
juan.felipe.osorio@correounivalle.edu.co

201940062
Cristian Duvan Manchado. 
cristian.machado@correounivalle.edu.co


201942104
Juan Sebastian camino. 
juan.camino@correounivalle.edu.co

 * */

// TODO: Auto-generated Javadoc
/**
 * The Class InterfazJuego.se encarga de pintar y llamar los hilos de la interfaz
 */
public class InterfazJuego extends JFrame {
	
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
	
	
	/** The dado. */
//ATRIBUTOS
	private Dado dado;
	
	/** The fondo. */
	private ImageIcon fondo;
	
	/** The central panel 2. */
	private ImagenFondo fondoPantalla , centralPanel , centralPanel1 , centralPanel2;
	
	/** The ronda personaje. */
	private JLabel rondaPersonaje;
	
	/** The ventana juego. */
	private JFrame ventanaPrincipal, ventanaJuego;
	
	/** The escucha. */
	private Escucha escucha;
	
	/** The prueba. */
	private JButton  volver, prueba;
	
	/** The tablero 2. */
	private Tablero tablero[][] , tablero1[][], tablero2[][];
	
	/** The id personaje. */
	private int id_personaje;
	
	/** The personaje 3. */
	private int personaje_principal , personaje_2 , personaje_3;
	
	/** The ruta. */
	private String ruta = "src/img/tablero.png";
	//private InterfazDeEntrada objEntrada; 
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/		

	
	                                                       /* FIN ZONA #1*/
	
//ZONA #2
	
//En esta zona estaran los costructores de la clase
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	



	/**
	 * Instantiates a new interfaz juego.
	 *
	 * @param ventanaPrincipal the ventana principal
	 * @param id_personaje the id personaje
	 */
	//construtor
	public  InterfazJuego(JFrame ventanaPrincipal , int id_personaje) {
		 
		 //
		 this.id_personaje = id_personaje;
		
		 //configurancion de la interfaz
		 init_Gui();
		
		 //iniciar variables
		 this.ventanaPrincipal = ventanaPrincipal; 
		

		 //default configurations
	     this.setUndecorated(true);
	     this.setSize(950,700);
	     this.setContentPane(fondoPantalla);
	     this.setResizable(false);
	     this.setLocationRelativeTo(null);
	     this.setVisible(false);
  	
	}
	
	
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	

                                                           /* FIN ZONA #2*/

//Zona #3
	
//En esta zona estara la parte de la configuracion de la interfaz
	

/**
 * Inits the gui.configuracion de ka interfaz
 */
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
	private void init_Gui() {
	
	//ventanaPrincipal. 
	//ventanaPrincipal = new JFrame(); 
		
	//INSTANCIAS DE CLASES	
	ventanaJuego = this;
	escucha = new Escucha();
	dado = new Dado();
	tablero = new Tablero[10][10];
	tablero1 = new Tablero[10][10];	
	tablero2 = new Tablero[10][10];
	
	 
	fondoPantalla = new ImagenFondo(ruta);
	fondoPantalla.setLayout(null);
	
	
	 paintTable(tablero, centralPanel , ""); //pinta el tablero encima de la imagen. 
	 paintTable(tablero1, centralPanel1 , "");
	 paintTable(tablero2, centralPanel2 , "");
	 
	 //paintTable(); 
	 eliguir_personsajes();
	//iniciar_hilos();
	//INTANCIAS JLABEL
	//INSTANCIAS BOOLEANAS
    //INSTANCIAS ENTERAS ... ETC	
	
	
	//INSTANCIAS CLASES...
	//objEntrada = new InterfazDeEntrada(); 
	init_botones(); 
	init_jlabel();
	}
	
	/**
	 * Inits the botones.configuracion ersonalisada de la clase
	 */
	private void init_botones() {
		
		//INSTANCIAS BOTONES. 
		fondo = new ImageIcon("src/img/back.png");
		volver = new JButton(fondo);
		volver.setBackground(Color.black);
		volver.setOpaque(true); 
		volver.setBounds(840, 590, 55, 36);
		volver.addActionListener(escucha); 
		fondoPantalla.add(volver);
		
		fondo = new ImageIcon("src/img/1.png"); 
		prueba = new JButton(fondo); 
		prueba.setBackground(Color.black); 
		prueba.setBounds(820, 350, 100, 150); 
		prueba.addActionListener(escucha); 
		fondoPantalla.add(prueba); 
		
	}
	
	/**
	 * Inits the jlabel.configuracion personalizada de la clase
	 */
	private void init_jlabel() {
		
		fondo = new ImageIcon( String.valueOf(tablero[0][0].getRutas_personajes_rondas()[personaje_principal] ));
		rondaPersonaje =  new JLabel(fondo);
		rondaPersonaje.setBounds(800,170,150,150);
		fondoPantalla.add(rondaPersonaje);
		
	}
	
	/**
	 * Iniciar hilos.iniciar los hilos
	 */
	private void iniciar_hilos() {
		//instanciar hilo de esta clase
		Thread hilo_dado =  new Thread( dado );
		
		//iniciar Hilo
		ExecutorService ejecutar_hilos = Executors.newFixedThreadPool(1);
		
		//ejucutar hilo
		 ejecutar_hilos.execute(hilo_dado);
		 ejecutar_hilos.shutdown();
	}
	
	
	/**
	 * The Class ImagenFondo.pintar imagen en panel
	 */
	//FONDO DE PANTALLA CON JPANEL Y GRAPHICS 
	public class ImagenFondo extends JPanel {	
		
		/** The ruta. */
		/* (non-Javadoc)
		 * @see javax.swing.JComponent#paint(java.awt.Graphics)
		*/
		private String ruta;
		
		/**
		 * Instantiates a new imagen fondo.
		 *
		 * @param ruta the ruta
		 */
		public ImagenFondo(String ruta) {
		this.ruta = ruta;	
		}
		
		/**
		 * Paint.
		 *
		 * @param grafico the grafico
		 */
		public void paint(Graphics grafico) {
			
	    	fondo = new ImageIcon(ruta);
	    	grafico.drawImage(fondo.getImage(),0,0,800,700,ventanaJuego);
	    	this.setOpaque(false);
	    	super.paint(grafico);
	        grafico.dispose();
		    	
		 }
	 
	 }
	
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	

	
                                                           /* FIN ZONA #3*/	
//Zona #4
	
//En esta zona estaran los getters and setters de la clase
	

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
	

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


	                                                      /* FIN ZONA #4*/	

//Zona #5
	
//En esta zona estaran los metodos de la clase
		

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
		
	/**
 * Paint table.pintar el tablero vacio para cada personaje
 *
 * @param tablero the tablero
 * @param centralPanel the central panel
 * @param ruta the ruta
 */
private void paintTable(Tablero[][] tablero , ImagenFondo centralPanel , String ruta) {
		ruta = "";
		
		centralPanel = new ImagenFondo(ruta);
		centralPanel.setLayout(new GridLayout(10,10));
		
		for (int row = 0 ; row < 10 ; row++) {
			
			for (int col = 0 ; col < 10 ; col++) {
				tablero[row][col] = new Tablero();
				centralPanel.add(tablero[row][col]);				
			}
			
		}
		
		
		centralPanel.setBounds(0, 0, 800, 700);
		//centralPanel.setBackground(new Color(0,0,0,0));
		fondoPantalla.add(centralPanel);
	}
		
	/**
	 * Eliguir personsajes.elegir el orden de los personajes
	 */
	private void eliguir_personsajes() {
		
		//iniciar los id personajes
		Vector imagenesPersonajes =  new Vector(3);
		imagenesPersonajes.add(0);
		imagenesPersonajes.add(1);
		imagenesPersonajes.add(2);
		
		 //eligir personaje aletorio bot
		 int wordRandom = 0;
		 Random getWord = new Random();
		 wordRandom =  getWord.nextInt(2);
		 
		 //
		 imagenesPersonajes.removeElement(id_personaje);
		 
		 
		 //darles los id a los personajes
		 personaje_principal = id_personaje;
		 personaje_2 =  (int)imagenesPersonajes.elementAt( wordRandom ) ;
		 imagenesPersonajes.removeElementAt(wordRandom);
		 personaje_3 =  (int)imagenesPersonajes.elementAt(0);
		 
	}
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


		                                                   /* FIN ZONA #5*/
//Zona #6
	
//En esta zona estaran los hilos de la clase
			

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
			
			
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


			                                               /* FIN ZONA #6*/	

//Zona #7
	
//En esta zona estaran los escuchas de las clases
		

/**
 * The Class Escucha.
 */
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
	private class Escucha extends MouseAdapter  implements ActionListener {
		 
		 /**
 		 * Action performed.
 		 *
 		 * @param eventoBoton the evento boton
 		 */
 		//ESCUCHAS BOTONES
		  public void actionPerformed(ActionEvent eventoBoton) {
			  
			  if(eventoBoton.getSource() == volver) {
				  
				  setVisible(false); //esconder la visibilidad de esta GUIQueSirve(); 
				  //ventanaPrincipal.setEnabled(true); //traer de nuevo mi ventana principal.
				  ventanaPrincipal.setVisible(true);
				  tablero[0][0].setActivarboton(true);
				  tablero[0][0].setxJ1(0);
				  tablero[0][0].setyJ1(9);
				  tablero[0][0].setxJ2(0);
				  tablero[0][0].setyJ2(9);
				  tablero[0][0].setxJ3(0);
				  tablero[0][0].setyJ3(9);
				  //System.out.println("----"); 
			  }
			  
			  if (eventoBoton.getSource() == prueba) {
				   //fondo = new ImageIcon("src/img/dadoGit.gif");
				   //prueba.setIcon(fondo);
				  
				   if(tablero[0][0].isActivarboton()) {
					tablero[0][0].setActivarboton(false);
					//aqui
					dado.setDetener(true);
					dado.setPrimeraRonda(true);
					dado.setTiempo(0);
					
					tablero[0][0].setBand(true);
					//tablero[0][0].setBandAux(true);
					//tablero[0][0].setBandParada(true);
					
					fondo = new ImageIcon( String.valueOf(tablero[0][0].getRutas_personajes_rondas()[personaje_principal] ));
					rondaPersonaje.setIcon(fondo);
					
					int wordRandom = 0;
					Random getWord = new Random();
					wordRandom =  getWord.nextInt(6)+1;
				    tablero[0][0].movimiento_players(tablero, wordRandom,tablero[0][0].getXmario(),tablero[0][0].getYmario(),tablero[0][0].getRutas_personajes()[ personaje_principal ],prueba,  personaje_2,  personaje_3,tablero[0][0].isBandMario() , tablero1 , tablero2, tablero , rondaPersonaje);
				    dado.valorDado(prueba, tablero , wordRandom);
				    iniciar_hilos();
				   	//System.out.println("entre");
				   }
			  }
			  
		  }
	}
	

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


		                                                      /* FIN ZONA #7*/	


}
