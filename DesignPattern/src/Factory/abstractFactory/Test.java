package Factory.abstractFactory;

/**
 * ���󹤳�ģʽ������ͨ����ģʽ�Ĳ�����Կ�Factory.normal.Test�������
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
