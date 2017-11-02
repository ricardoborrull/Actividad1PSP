package ejercicio1;
import java.lang.Math;


	public class EjemploThread extends Thread{	 //
		int numero;		
		public void run() {
			try {
				while (true){
					System.out.println(this.getName());
					sleep((long)(10000*Math.random()));//
				}
			} catch (InterruptedException ex) {
				return;
		}				
	}
	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			EjemploThread hilos = new EjemploThread();//
			hilos.start();}//
		}
	}
