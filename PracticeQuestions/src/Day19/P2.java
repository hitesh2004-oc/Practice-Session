package Day19;
interface Vehicle {
    void start(); // Abstract method (no body)

    // Default method with implementation
    default void playMusic() {
        System.out.println("Playing music in the vehicle.");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

public class P2 {
	public static void main(String[] args) {
		        Car myCar = new Car();
		        myCar.start();      // Calls the overridden abstract method
		        myCar.playMusic();  // Calls the default method from the interface
			
	} 
}
