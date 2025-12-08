package Day4;

interface Vehicle {
	void start();
	void stop();
}

class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Starting car engine....");
	}

	@Override
	public void stop() {
		System.out.println("Stopping car engine...");
	}
}
class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting truck engine......");
    }

    @Override
    public void stop() {
        System.out.println("Stopping truck engine.......");
    }
}
public class Driver extends Truck {
	 public void operateVehicle() {
	        System.out.println("Driver interaction:");
	    }

	    public static void main(String[] args) {
	        Driver driver = new Driver();
	        Car c1 = new Car();
	     driver.operateVehicle();
	     driver.stop();
	     driver.start();
	     driver.operateVehicle();
	     c1.stop();
	     c1.start();
	     
	     

	    }

}
