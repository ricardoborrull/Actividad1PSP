package ejercicio2;

public class NewThread implements Runnable {
	String name; // TODO: Declaramos el String "name" y el thread "t" para usarlo en nuestro programa
	Thread t;
	  
	NewThread(String threadname) {
	    name = threadname;
	    t = new Thread(this, name);
	    System.out.println("Nuevo hilo: " + t);
	    t.start(); //TODO: Declaramos el objeto Thread, lo construimos y lo iniciamos con .start
	}
	
	// TODO: 
	  
	public void run() { 
	    try {
	      for(int i = 5; i > 0; i--) {
	        System.out.println(name + ": " + i); //Creamos un bucle y le ponemos nombre y "i" número
	        									 //a cada hilo que sale por pantalla, este bucle es una cuenta atrás
	        Thread.sleep(1000);
	      }
	    } catch (InterruptedException e) {
	      	System.out.println(name + "Interrupción del hilo hijo" +name);
	    }
	    
	    System.out.println("Sale del hilo hijo" + name);
	}
}
	
class MultiThreadDemo {
	  public static void main(String args[]) {
		    new NewThread("Uno"); // Declaramos el nombre del hilo
		    new NewThread("Dos");
		    new NewThread("Tres");
		    try {
	      		// 
		      Thread.sleep(10000);
		    } catch (InterruptedException e) { // Gestionamos los errores
		      System.out.println("InterrupciÃ³n del hilo principal");
	    	}
	    	System.out.println("Sale del hilo principal.");
	  }
}
