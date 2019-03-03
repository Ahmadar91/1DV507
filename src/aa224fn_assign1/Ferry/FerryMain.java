package aa224fn_assign1.Ferry;

import java.util.Iterator;

public class FerryMain {

	public static void main(String[] args) {

		Car car = new Car();

		car.AddPassengers(new Passenger());
		car.AddPassengers(new Passenger());
		car.AddPassengers(new Passenger());
		car.AddPassengers(new Passenger());

		Bicycle bicycle = new Bicycle();
		bicycle.AddPassengers(new Passenger());
		Bicycle bicycle1 = new Bicycle();
		bicycle1.AddPassengers(new Passenger());
		Bicycle bicycle2 = new Bicycle();
		bicycle2.AddPassengers(new Passenger());
		Bicycle bicycle3 = new Bicycle();
		bicycle3.AddPassengers(new Passenger());
		Bicycle bicycle4 = new Bicycle();
		bicycle4.AddPassengers(new Passenger());
		Bicycle bicycle5 = new Bicycle();
		bicycle5.AddPassengers(new Passenger());

		Car car2 = new Car();
		car2.AddPassengers(new Passenger());
		car2.AddPassengers(new Passenger());

		Lorry lorry = new Lorry();
		lorry.AddPassengers(new Passenger());

		Passenger passenger = new Passenger();
		Passenger passenger2 = new Passenger();
		Passenger passenger3 = new Passenger();
		Passenger passenger4 = new Passenger();
		Passenger passenger5 = new Passenger();
		Passenger passenger6 = new Passenger();
		Passenger passenger7 = new Passenger();

		Bus bus = new Bus();
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());
		bus.AddPassengers(new Passenger());

		Lorry lorry1 = new Lorry();
		lorry1.AddPassengers(new Passenger());

		Lorry lorry2 = new Lorry();
		lorry2.AddPassengers(new Passenger());

		Bus bus1 = new Bus();
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());
		bus1.AddPassengers(new Passenger());

		Lorry lorry3 = new Lorry();
		lorry3.AddPassengers(new Passenger());

		Bus bus2 = new Bus();
		bus2.AddPassengers(new Passenger());
		bus2.AddPassengers(new Passenger());
		bus2.AddPassengers(new Passenger());
		bus2.AddPassengers(new Passenger());
		bus2.AddPassengers(new Passenger());
		bus2.AddPassengers(new Passenger());
		bus2.AddPassengers(new Passenger());
		bus2.AddPassengers(new Passenger());
		bus2.AddPassengers(new Passenger());
		bus2.AddPassengers(new Passenger());
		bus2.AddPassengers(new Passenger());

		Lorry lorry4 = new Lorry();
		lorry4.AddPassengers(new Passenger());
		lorry4.AddPassengers(new Passenger());

		Ferry ferry = new FerryMethods();

		ferry.embark(car);
		ferry.embark(bicycle);
		ferry.embark(car2);
		ferry.embark(lorry);
		ferry.embark(passenger);
		ferry.embark(passenger2);
		ferry.embark(passenger3);
		ferry.embark(passenger4);
		ferry.embark(passenger5);
		ferry.embark(passenger6);
		ferry.embark(passenger7);
		ferry.embark(bus);
		ferry.embark(lorry1);
		ferry.embark(lorry2);
		ferry.embark(bus1);
		ferry.embark(bus2);
	;

		System.out.println(ferry.toString());

		System.out.println("Is there room for more passengers? " + ferry.hasRoomFor(passenger));

		System.out.println("Is there room for more vehicles? " + ferry.hasSpaceFor(bus));
		System.out.println();
		Iterator<Vehicle> iterator = ferry.iterator();

		System.out.println("Vehicles ONBOARD:");

		int count = 1;

		while (iterator.hasNext()) {
			System.out.println("Vehicle " + count++ + ": " + iterator.next().toString());

		}

		System.out.println("");

		ferry.disembark();

		System.out.println(ferry.toString());

	}

}
