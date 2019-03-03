package aa224fn_assign1.Ferry;

public class Car extends Vehicle {

	static int VehicleSize = 5;
	static int VehicleCost = 100;
	static int PassengerCost = 15;
	static int MaxPassangersV = 4;

	public Car() {
		super(VehicleSize, VehicleCost, PassengerCost, MaxPassangersV);
	}
}
