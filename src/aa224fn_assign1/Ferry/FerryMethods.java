package aa224fn_assign1.Ferry;

import java.util.ArrayList;
import java.util.Iterator;

public class FerryMethods implements Ferry {
	protected final int FerrySizePassenger = 200;
	protected final int TOTALPARKINGSPACE = 200;
	protected int PassengerCount = 0;
	protected int VehicleCount = 0;
	protected int MoneyMade = 0;
	ArrayList<Vehicle> Vehicle = new ArrayList<Vehicle>();
	ArrayList<Passenger> passengers = new ArrayList<Passenger>();

	// Number of passengers on board
	public int countPassengers() {
		return this.PassengerCount;
	}

	// Used vehicle space. One car is 1.
	public int countVehicleSpace() {
		return this.VehicleCount / 5;
	}

	// Earned money
	public int countMoney() {
		int Sum = 0;
		for (Vehicle vehicle : this.Vehicle) {
			Sum += vehicle.TotalCost();
		}
		Passenger p = new Passenger();
		Sum += (p.CtPassanger() * this.passengers.size());
		this.MoneyMade += Sum;
		return this.MoneyMade;
	}

	// Embark vehicle, warning if not enough space
	public void embark(Vehicle v) {

		if (this.Vehicle.contains(v)) {

			System.err.println("This vehicle has already embarked.");

		} else {

			this.VehicleCount += v.GetSize();

			if (this.VehicleCount >= 200) {

				throw new IndexOutOfBoundsException("No more room for new vehicles");

			}

			this.Vehicle.add(v);
			this.PassengerCount += v.TotalPassengers();
		}
	}

	// Embark passenger, warning if not enough room
	public void embark(Passenger p) {

		this.PassengerCount++;

		if (this.PassengerCount >= 200) {

			throw new IndexOutOfBoundsException("No more room for Passenger");

		} else {
			this.passengers.add(p);

		}

	}

	// Clear (empty) ferry. The money earned remains, i.e., is not reset to zero
	public void disembark() {
		Vehicle.clear();
		passengers.clear();
		VehicleCount = 0;
		PassengerCount = 0;
	}

	// true if we can embark vehicle v
	public boolean hasSpaceFor(Vehicle v) {
		this.VehicleCount += v.GetSize();
		if (this.VehicleCount <= 200) {
			this.VehicleCount -= v.GetSize();
			return true;
		}
		this.VehicleCount -= v.GetSize();
		return false;
	}

	// true if we can embark passenger p
	public boolean hasRoomFor(Passenger p) {
		if (this.passengers.size() <= 200) {
			return true;
		}
		return false;

	}

	public String toString() {
		return "ferry status:\n" + "Total passengers onboard: " + countPassengers()
				+ "\nTotal vehicle space onboard(size counted in cars): " + countVehicleSpace() + "\nRevenue: "
				+ countMoney() + " Kr \n";

	}

	// Vehicle iterator
	public Iterator<Vehicle> iterator() {
		return new VehicleIterator();
	}

	private class VehicleIterator implements Iterator<Vehicle> {
		int index = 0;

		public boolean hasNext() {

			return index < Vehicle.size() ;
		}

		public Vehicle next() {
			return Vehicle.get(index++);
		}
	}

}
