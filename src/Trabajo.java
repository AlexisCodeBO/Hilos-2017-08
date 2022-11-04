
public class Trabajo implements Runnable {

	private int miId;
	
	public Trabajo(int id){
		miId=id;
	}//Trabajo
	@Override
	public void run() {
		System.out.printf("Saludos al hilo %d%n", miId);
		// TODO Auto-generated method stub
		
	}

}//Trabajo
