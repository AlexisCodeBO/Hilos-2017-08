
public class Hilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajo trabajo0=new Trabajo(0);
		Trabajo trabajo1=new Trabajo(1);
		Trabajo trabajo2=new Trabajo(2);
		
		Thread hilo0=new Thread(trabajo0);
		Thread hilo1=new Thread(trabajo1);
		Thread hilo2=new Thread(trabajo2);
		
		hilo0.start();
		hilo1.start();
		hilo2.start();

	}//main

}//Hilos
