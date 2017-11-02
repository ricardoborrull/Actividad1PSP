package ejercicio1;
import java.lang.Math;


	public class EjemploThread extends Thread{	 // TODO: Se crea la clase EjemploThread y extendemos thread
		int numero;		
		public void run() {
			try {
				while (true){
					System.out.println(this.getName());
					sleep((long)(10000*Math.random())); // TODO: Con sleep mantenemos el bucle en espera
				}
			} catch (InterruptedException ex) {
				return;
		}				
	}
	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			EjemploThread hilos = new EjemploThread(); // TODO: Llamamos al objeto EjemploThread
			hilos.start();} // TODO: Llamamos a "hilos" y lo iniciamos
		}
	}
