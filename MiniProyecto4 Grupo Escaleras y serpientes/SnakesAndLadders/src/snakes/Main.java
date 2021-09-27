package snakes;

//liberias util
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//liberias swing


import javax.swing.JOptionPane;
import javax.swing.UIManager;
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
 * The Class Main.iniciar el hilo generador de eventos
 */
public class Main implements Runnable {


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	//Metodo main
	public static void main(String[] args) {
	
	//para que se visualice igual en todos los demas sistemas operativos	
	try {
			
	String javaVentanaMultiPlataforma  = UIManager.getCrossPlatformLookAndFeelClassName();
	UIManager.setLookAndFeel(javaVentanaMultiPlataforma);
			
	} catch (Exception exception) {
	JOptionPane.showMessageDialog(null, "Huvo un daño en la maquina Virtual al intentar abrir el programa");
	}

	//instanciar hilo de esta clase
	Thread hilo_entrada =  new Thread( new Main() );
	
	//iniciar Hilo
	ExecutorService ejecutar_hilos = Executors.newFixedThreadPool(1);
	
	//ejucutar hilo
	 ejecutar_hilos.execute(hilo_entrada);
	 ejecutar_hilos.shutdown();
	 
	
	}
	
	/**
	 * Instantiates a new main.
	 */
	//construtor del hilo
	public Main() {
		
	}
	
	
	/**
	 * Run. iniciar la interfaz de entrada
	 */
	//hilo
	@Override
	public void run() {
		
	InterfazDeEntrada   myvista = new InterfazDeEntrada();
		
	}

}
