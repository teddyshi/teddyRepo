package Builder;

/**
 * 建造者模式的优点：
 * 其一，具体实现步骤由
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) {
		//由车间指挥人员发布命令，建造一辆轿车
		VechileDirector vd = new VechileDirector();
		Vechile vechile =  vd.constructVechile(new CarBuilder("三厢车",5));
		Car car = (Car)vechile;
		
		//此处一辆轿车已经建造完毕，以下仅为输出其属性
		System.out.println(car.getBody());
		System.out.println(car.getWheels());
		System.out.println(car.getDecorate());
		System.out.println(car.getEqp());
		System.out.println(car.getLacquer());
		System.out.println(car.getAdjust());
		System.out.println(car.getTestResult());
		System.out.println(car.getType());
		System.out.println("乘员数："+car.getPnum());
	}
	
}
