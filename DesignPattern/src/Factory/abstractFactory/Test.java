package Factory.abstractFactory;

/**
 * 抽象工厂模式，与普通工厂模式的差异可以看Factory.normal.Test类的描述
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		IVehicleFactory vf = new VehicleFactory();
		vf.createCar().description();
		vf.createSuv().description();
	}
}
