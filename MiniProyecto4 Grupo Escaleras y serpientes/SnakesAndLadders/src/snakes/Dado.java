package snakes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Dado implements Runnable {
	//Atributos
	private ImageIcon fondo;
	private JButton imagenDado;
	private boolean detener = true, primeraRonda = true;
	private int tiempo=0;
	private Tablero[][] tablero;
	private int wordRandom;
	
	public Dado() {
	
		
	}
	
	//geters y setters
	public boolean isDetener() {
		return detener;
	}
	public boolean isPrimeraRonda() {
		return primeraRonda;
	}

	public void setPrimeraRonda(boolean primeraRonda) {
		this.primeraRonda = primeraRonda;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public void setDetener(boolean detener) {
		this.detener = detener;
	}
/***************************************************************************/

	public void valorDado(JButton dado , Tablero[][] tableroAux , int wordRandom1) {
		
		imagenDado = dado;
		tablero = tableroAux;
		wordRandom = wordRandom1;
		
	}
	
	private void iniciar_hilos() {
		//tablero[0][0].movimiento_players(tablero, 6 );
		//instanciar hilo de esta clase
		Thread hilo_entrada =  new Thread( tablero[0][0] );
		
		//iniciar Hilo
		ExecutorService ejecutar_hilos = Executors.newFixedThreadPool(1);
		
		//ejucutar hilo
		 ejecutar_hilos.execute(hilo_entrada);
		 ejecutar_hilos.shutdown();
	}
	
	@Override	
	public void run() {
		// TODO Auto-generated method stub
		while(detener) {
			
			try {
				
				if(primeraRonda) {
					
					fondo= new ImageIcon("src/img/dadoGit.gif");
					imagenDado.setIcon(fondo);
					primeraRonda = false;
				}
				
				if(tiempo == 3) {
					detener= false;
					 fondo = new ImageIcon("src/img/"+wordRandom+".png");
					 imagenDado.setIcon(fondo);
					 iniciar_hilos();
					 System.out.println("termino");
				}
				tiempo++;
			
				Thread.sleep(1000);
				System.out.println("holaaaa!!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}
	
	

}

