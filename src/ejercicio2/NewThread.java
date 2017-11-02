package ejercicio2;

public class NewThread implements Runnable {
	String name; // 
	Thread t;
	  
	NewThread(String threadname) {
	    name = threadname;
	    t = new Thread(this, name);
	    System.out.println("Nuevo hilo: " + t);
	    t.start(); // 
	}
	// 
	  
	public void run() { 
	    try {
	      for(int i = 5; i > 0; i--) {
	        System.out.println(name + ": " + i); //
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
		    new NewThread("Uno"); // 
		    new NewThread("Dos");
		    new NewThread("Tres");
		    try {
	      		// 
		      Thread.sleep(10000);
		    } catch (InterruptedException e) { //
		      System.out.println("InterrupciÃ³n del hilo principal");
	    	}
	    	System.out.println("Sale del hilo principal.");
	  }
}
