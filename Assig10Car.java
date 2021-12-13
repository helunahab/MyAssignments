package Assignment;

public interface Assig10Car {
void body();
void engine();
void tyres();
void ac();

public static void main(String[] args) {
	Assig10Car ws = new Polo();
	ws.tyres();
	ws.body();
	ws.body();
	ws.ac();
    ws.engine();	
 }
}

 abstract class Wolswagen implements Assig10Car{
	public  void tyres() {
		System.out.println("These are Wolswagen tyers"+"\n");
	}
		public void ac(){
		System.out.println("Car's AC"+"\n");
}
		void nonAc(){
		System.out.println("A car with out AC"+"\n");
	}
 }
 
	class Polo extends Wolswagen {
	
		public void body() {
			System.out.println("Is the engine body of a car"+"\n");
		// TODO Auto-generated method stub
		
	}

		public void engine() {
			System.out.println("Engine  main part of the car"+"\n");
		// TODO Auto-generated method stub
		
	}
}
	 	class Wabc extends Wolswagen {
	 		public void body() {
			// TODO Auto-generated method stub
			
	}

		public void engine() {
			// TODO Auto-generated method stub
}
	
			
	}
	 
	
	
 
	
	
	
