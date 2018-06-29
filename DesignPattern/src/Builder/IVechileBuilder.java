package Builder;

/**
 * 定义车辆的通用建造步骤
 * @author Administrator
 *
 */
public interface IVechileBuilder {
	
	void buildBody();//建造车身
	
	void buildWheels();//安装车轮
	
	void lacquer();//喷漆
	
	void decorate();//车内装潢
	
	void installEqp();//安装车内电子设备
	
	void adjust();//车辆性能调校
	
	void test();//出厂检测
	
	Vechile buildVechile();//返回建造的车辆
}
