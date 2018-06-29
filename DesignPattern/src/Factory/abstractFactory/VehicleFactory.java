package Factory.abstractFactory;

public class VehicleFactory implements IVehicleFactory {

	public ICar createCar() {
		return new Car();
	}

	public ISuv createSuv() {
		return new Suv();
	}

}
