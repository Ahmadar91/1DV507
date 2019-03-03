package aa224fn_assign1.Ferry;

import java.util.ArrayList;

public abstract class Vehicle {
	int FerrySizePassengers = 200;

	protected int VehicleSize = 0;
	protected int VehicleCost = 0;
	protected int PassengerCost = 0;
	protected int MaxPassangersV = 0;
	protected int totalVehicleSize = 0;
	ArrayList<Passenger> passengers = new ArrayList<Passenger>();

	public Vehicle(int vehicleSize, int vehicleCost, int passengerCost, int maxPassangersV) {
		this.VehicleSize = vehicleSize;
		this.VehicleCost = vehicleCost;
		this.PassengerCost = passengerCost;
		this.MaxPassangersV = maxPassangersV;
	}

	public int GetSize() {
		return this.VehicleSize;
	}

	public void AddPassengers(Passenger passenger) {
		if (passengers.size() < MaxPassangersV) {
			passengers.add(passenger);
		}
	}

	public int TotalPassengers() {
		return passengers.size();
	}

	public int TotalCost() {
		return this.VehicleCost + (this.passengers.size() * this.PassengerCost);
	}

	public int GetVehicleCost() {
		return VehicleCost;
	}

	public int GetPassngerCost() {
		return PassengerCost;
	}

	public int GetMaxPInVehicle() {
		return MaxPassangersV;

	}

	public int FerrySize() {
		return this.VehicleSize;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Passengers: " + TotalPassengers() + "     ");
		sb.append("vehicle Cost : " + GetVehicleCost() + " kr" + "     ");
		sb.append("Total passengers Cost :" + (GetPassngerCost() * TotalPassengers()) + " kr" + " ");
		return sb.toString();
	}

}
