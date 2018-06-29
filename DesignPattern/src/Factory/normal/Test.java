package Factory.normal;

/**
 * 工厂模式：
 * 定义一个车辆对象，一个汽车工厂接口，定义一个通用汽车厂与大众汽车厂都实现汽车工厂接口
 * 实现业务逻辑：大众汽车造轿车、通用汽车造越野车
 * 
	工厂方法模式：
	一个抽象产品类，可以派生出多个具体产品类。   
	一个抽象工厂类，可以派生出多个具体工厂类。   
	每个具体工厂类只能创建一个具体产品类的实例。
	
	抽象工厂模式：
	多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。   
	一个抽象工厂类，可以派生出多个具体工厂类。   
	每个具体工厂类可以创建多个具体产品类的实例。   
	    
	区别：
	工厂方法模式只有一个抽象产品类，而抽象工厂模式有多个。   
	工厂方法模式的具体工厂类只能创建一个具体产品类的实例，而抽象工厂模式可以创建多个。
 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		VehicleFactory gm = new GMFactory();
		VehicleFactory vw = new VWFactory();
		
		gm.getVehicle().description();
		vw.getVehicle().description();
		
	}
}
