
public class HolaHilos {
	
	public static void main(String[] args){
		
		Hilo hilo0=new Hilo(0);
		Hilo hilo1=new Hilo(1);
		Hilo hilo2=new Hilo(2);
		
		System.out.printf("!Saludos del hilo principal!!!%n" );
		
		hilo0.start();
		hilo1.start();
		hilo2.start();
		
	
	
	
	}//main
	
}//HolaHilos
