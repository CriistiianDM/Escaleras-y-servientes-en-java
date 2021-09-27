package snakes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import MisComponentes.BorderK;


public class InterfazPersonajes extends JFrame {
	
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
	private Dimension dimension;
	private ImageIcon fondo;
	private ImagenFondo fondoPantalla;
	private JFrame ventanaPersonajes;
	private Escucha escucha;
	private JButton selecMario,selecLuigui,selecPeach;
	private InterfazJuego interfaz_juego;
	private BorderK borde; 
	private int id_personaje;
	private JFrame ventana; 
	
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/		

	
	                                                       /* FIN ZONA #1*/
	
//ZONA #2
	
//En esta zona estaran los costructores de la clase

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
public InterfazPersonajes(JFrame ventana) {
	
	//instancia de la ventana correspondiente para poder navegar a la ventana de juego. 
	 this.ventana = ventana;
	
	//configurancion de la interfaz
	 init_Gui();
	 
	//default configurations
    this.setUndecorated(true);
    this.setSize(800,500);
    this.setContentPane(fondoPantalla);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setVisible(false);
    
}
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	

                                                           /* FIN ZONA #2*/

//Zona #3
	
//En esta zona estara la parte de la configuracion de la interfaz
	

/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	
private void init_Gui() {

	ventanaPersonajes = this;
	borde = new BorderK();
	fondoPantalla = new ImagenFondo();
	fondoPantalla.setLayout(null);
	escucha = new Escucha();
	init_Botones();
	
	
	
}

private void init_Botones() {
	
  // Boton Grafico Mario
	fondo = new ImageIcon("src/img/marioKart.png");
	selecMario = new JButton(fondo);
	selecMario.setBounds(100, 200, 150, 150);
	selecMario.setContentAreaFilled(false);
	selecMario.addActionListener(escucha);
	borde.Borde(selecMario, new Color(214,0,252), 2);
	fondoPantalla.add(selecMario);
	
  // Boton Grafico Luigui
	fondo = new ImageIcon("src/img/luigui.png");
	selecLuigui = new JButton(fondo);
	selecLuigui.setBounds(280, 200, 150, 150);
	selecLuigui.setContentAreaFilled(false);
	selecLuigui.addActionListener(escucha);
	borde.Borde(selecLuigui, new Color(214,0,252), 2);
	fondoPantalla.add(selecLuigui);
	
  // Boton Grafico Peach
	fondo = new ImageIcon("src/img/princesa.png");
	selecPeach = new JButton(fondo);
	selecPeach.setBounds(480, 200, 150, 150);
	selecPeach.setContentAreaFilled(false);
	selecPeach.addActionListener(escucha);
	borde.Borde(selecPeach, new Color(214,0,252), 2);
	fondoPantalla.add(selecPeach);
	
}

public class ImagenFondo extends JPanel {	
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	public void paint(Graphics grafico) {
    	
    	dimension = this.getSize();
    	fondo = new ImageIcon("src/img/fondoPersonajes.png");
    	grafico.drawImage(fondo.getImage(),0,0,dimension.width,dimension.height,ventanaPersonajes);
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
public int getId_personaje() {
	return id_personaje;
}
	
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
private class Escucha extends MouseAdapter  implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent eventoBoton) {
		// TODO Auto-generated method stub
		if(eventoBoton.getSource()==selecPeach) {
			id_personaje = 2;
		}
		if(eventoBoton.getSource()==selecLuigui) {
			id_personaje = 1;
		}
		if(eventoBoton.getSource()==selecMario) {
			id_personaje = 0;
		}
		
		interfaz_juego = new InterfazJuego(ventana,id_personaje);
		setVisible(false);
		interfaz_juego.setVisible(true);
		//GUIparaQueSirve.setVisible(true);
		//miMisma.setEnabled(true);
	}
	 
}		
/*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/	


		                                                      /* FIN ZONA #7*/	


}
