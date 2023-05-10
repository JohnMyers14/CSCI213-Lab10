public class Car extends Vehicle {
	private int numDoors;
	private int numPass;
	
	public Car(String make, String model, String plate, int doors, int pass) {
		super(make, model, plate);
		this.numDoors = doors;
		this.numPass = pass;
	}
	public int getDoors() {
		return this.numDoors;
	}
	public int getPasses() {
		return this.numPass;
	}
	@Override
	public String toString() {
		String result = String.format("%d-door %s%s with license %s.", super.getMake(), super.getModel(), super.getPlate());
		return result;
	}
	@Override
	public boolean equals(Object car) {
		if (!(car instanceof Car)) {
			return false;
		}
		Car other = (Car) car;
		return super.equals(other);
	}
	public Car copy() {
		Car car = new Car(super.getMake(), super.getModel(), super.getPlate(), this.numDoors, this.numPass);
		return car;
	}
}