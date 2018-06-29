package Builder;

/**
 * 把这个类想象成安装车辆的车间指挥，即如何装配由其决定
 * @author Administrator
 *
 */
public class VechileDirector {
	
	public Vechile constructVechile(IVechileBuilder builder){
		builder.buildBody();
		builder.buildWheels();
		builder.decorate();
		builder.installEqp();
		builder.adjust();
		builder.lacquer();
		builder.test();
		return builder.buildVechile();
	}
}
