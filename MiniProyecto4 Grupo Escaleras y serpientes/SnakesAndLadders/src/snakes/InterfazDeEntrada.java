package snakes;

import java.awt.Color;

//librerias util

//librerias awt
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//librerias de swing
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//importancion de proyectos
import MisComponentes.BorderK;

// TODO: Auto-generated Javadoc
/**
 * The Class InterfazDeEntrada.
 */
public class InterfazDeEntrada extends JFrame {
	
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
	
	
	/** The dimension. */
//ATRIBUTOS
	private Dimension dimension;
	
	/** The fondo. */
	private ImageIcon fondo;
	
	/** The fondo pantalla. */
	private ImagenFondo fondoPantalla;
	
	/** The ventana entrada. */
	private JFrame ventanaEntrada;
	
	/** The escucha. */
	private Escucha escucha;
	
	/** The salir. */
	private JButton iniciar, salir;
	
	/** The borde. */
	private BorderK borde;
	
	/** The interfaz personajes. */
	private InterfazPersonajes interfaz_Personajes;

	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/		

	
	                                                       /* FIN ZONA #1*/
	
//ZONA #2
	
//En esta zona estaran los costructores de la clase
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	

	/**
 * Instantiates a new interfaz de entrada.
 */
//construtor
	public  InterfazDeEntrada() {
		 
		 //configurancion de la interfaz
		 init_Gui();
		 
		 //default configurations
	     this.setUndecorated(true);
	     this.setSize(800,500);
	     this.setContentPane(fondoPantalla);
	     this.setResizable(false);
	     this.setLocationRelativeTo(null);
	     this.setVisible(true);
  	
	}
	
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	

                                                           /* FIN ZONA #2*/

//Zona #3
	
//En esta zona estara la parte de la configuracion de la interfaz
	

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
	
	
	/**
 * Inits the gui.configuracion de la interfaz
 */
//configuracion de la interfaz
	private void init_Gui() {
		
	//INSTANCIAS DE CLASES
	ventanaEntrada =  this;
	escucha = new Escucha();
	borde = new BorderK();
	

	interfaz_Personajes = new InterfazPersonajes(ventanaEntrada);
	
	
	//instancias JPANEL
	fondoPantalla = new ImagenFondo();
	fondoPantalla.setLayout(null);
	
	//INSTANCIAS JBUTTON
	init_boton();
	
	//INTANCIAS JLABEL
	//INTANCIAS DE LOS ESCUCHAS
	//INSTANCIAS BOOLEANAS
    //INSTANCIAS ENTERAS ... ETC			
		
	}
	
	/**
	 * Inits the boton.configuracion personalizada de los botones
	 */
	//instancias botones
	private void init_boton() {
	
	//iamgen del boton
	fondo =  new ImageIcon("src/img/play.png");
	
	//ajustes del boton iniciar
	iniciar = new JButton(fondo);
	iniciar.setBounds(360,250,50,55);
	iniciar.setBackground(new Color(0,0,0,0));
	iniciar.setContentAreaFilled(false);
	iniciar.addActionListener(escucha);
	iniciar.addMouseListener(escucha);
	
	borde.Borde(iniciar, new Color(0,0,0), 0);
	
	fondoPantalla.add(iniciar);
	
	//iamgen del boton
	fondo =  new ImageIcon("src/img/x.png");
	
	//ajustes del boton salir
	salir = new JButton(fondo);
	salir.setBounds(740,0,50,55);
	salir.setBackground(new Color(0,0,0,0));
	salir.setContentAreaFilled(false);
	salir.addActionListener(escucha);
	salir.addMouseListener(escucha);
	
	borde.Borde(salir, new Color(0,0,0), 0);
	
	fondoPantalla.add(salir);
	
	}
	
	/**
	 * The Class ImagenFondo.pintar imagen en un panel con grafics
	 */
	//FONDO DE PANTALLA CON JPANEL Y GRAPHICS 
	public class ImagenFondo extends JPanel {	
		
		/**
		 * Paint.
		 *
		 * @param grafico the grafico
		 */
		/* (non-Javadoc)
		 * @see javax.swing.JComponent#paint(java.awt.Graphics)
		 */
		public void paint(Graphics grafico) {
	    	
	    	dimension = this.getSize();
	    	fondo = new ImageIcon("src/img/fondoEntrada.jpg");
	    	grafico.drawImage(fondo.getImage(),0,0,dimension.width,dimension.height,ventanaEntrada);
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
		
		
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


		                                                   /* FIN ZONA #5*/
//Zona #6
	
//En esta zona estaran los hilos de la clase
			

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
			
			
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


			                                              /* FIN ZONA #6*/	

//Zona #7
	
//En esta zona estaran los escuchas de las clases
		

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
	
	/**
 * The Class Escucha.
 */
//ESCUCHAS DE LA CLASE
	private class Escucha extends MouseAdapter  implements ActionListener {
		 
		 /**
 		 * Action performed.
 		 *
 		 * @param eventoBoton the evento boton
 		 */
 		//ESCUCHAS BOTONES
		  public void actionPerformed(ActionEvent eventoBoton) {
			 
			  if ( eventoBoton.getSource() == salir) {
				  System.exit(0);
			  }
			  
			  if (eventoBoton.getSource() == iniciar) {
				  setVisible(false);
				  //interfaz_juego.setVisible(true);
				  interfaz_Personajes.setVisible(true);
			  }
		  }
		 
		  
		 //ESCUCHAS MOUSE
		  
		 /**
 		 * Mouse entered.
 		 *
 		 * @param eventMouse the event mouse
 		 */
 		//cuando el mouse entre poner la imagen cool
		 public void mouseEntered(MouseEvent eventMouse) {
			 
			  //poner la imagen cool al boton salir
			  if (eventMouse.getSource() == salir) {
				 //iamgen del boton
				 fondo =  new ImageIcon("src/img/x-1.png");
					
				 //ajustes del boton iniciar
				 salir.setIcon(fondo);
			  }
			  
			  //poner la imagen cool al boton iniciar
			  if (eventMouse.getSource() == iniciar) {
				  //iamgen del boton
				  fondo =  new ImageIcon("src/img/play-1.png");
						
				 //ajustes del boton iniciar
				 iniciar.setIcon(fondo);  
			  }
		 }
		 
		 /**
 		 * Mouse exited.
 		 *
 		 * @param eventMouse the event mouse
 		 */
 		//cuando el mouse salaga devolverle la imagen
		 public void mouseExited(MouseEvent eventMouse) {
			 
			  //quitar la imagen cool al boton salir
			  if (eventMouse.getSource() == salir) {
				 //iamgen del boton
				 fondo =  new ImageIcon("src/img/x.png");
					
				 //ajustes del boton iniciar
				 salir.setIcon(fondo);
			  }
			  
			  //quitar la imagen cool al boton iniciar
			  if (eventMouse.getSource() == iniciar) {
				  //iamgen del boton
				  fondo =  new ImageIcon("src/img/play.png");
						
				 //ajustes del boton iniciar
				 iniciar.setIcon(fondo);  
			  }
			  
		 }
		 
	 }
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


		                                                 /* FIN ZONA #7*/	


}
