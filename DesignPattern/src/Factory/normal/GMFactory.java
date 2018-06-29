package Factory.normal;

/**
 * 通用汽车
 * @author Administrator
 *
 */
public class GMFactory implements VehicleFactory {

	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return new Vehicle("越野车","LSW12333","通用凯迪拉克");
	}

}
