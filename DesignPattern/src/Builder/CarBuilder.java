package Builder;

/**
 * 定义轿车的生产具体步骤，以此类推越野车Suv也应该拥有自身的建造步骤
 * @author Administrator
 *
 */
public class CarBuilder implements IVechileBuilder {

	Car car;
	
	
	public CarBuilder(String type,int pNum) {
		car = new Car(type,pNum);
	}

	public void adjust() {
		car.setAdjust("车辆调校");
	}

	public void buildBody() {
		car.setBody("建造车身");
	}

	public Vechile buildVechile() {
		return car;
	}

	public void buildWheels() {
		car.setWheels("装配车轮");
	}

	public void decorate() {
		car.setDecorate("车内装潢");
	}

	public void installEqp() {
		car.setEqp("安装车内电子设备");
	}

	public void lacquer() {
		car.setLacquer("喷漆、烘烤");
	}

	public void test() {
		car.setTestResult("出厂验收");
	}

}
