
public class Hilo extends Thread{

	
	private int miId;
	
	public Hilo (int id){
		miId=id;
		
	}// Hilo
	
@Override
public void run(){
	System.out.printf("Saludos de hilo %d!!!%n", miId);
	
}//run
}//Hilo


