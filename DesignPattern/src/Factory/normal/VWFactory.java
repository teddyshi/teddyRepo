package Factory.normal;

/**
 * 大众汽车
 * @author Administrator
 *
 */
public class VWFactory implements VehicleFactory {

	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return new Vehicle("五座版轿车","LYT843394","大众辉腾");
	}

}
