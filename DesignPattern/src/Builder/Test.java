package Builder;

/**
 * ������ģʽ���ŵ㣺
 * ��һ������ʵ�ֲ�����
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) {
		//�ɳ���ָ����Ա�����������һ���γ�
		VechileDirector vd = new VechileDirector();
		Vechile vechile =  vd.constructVechile(new CarBuilder("���ᳵ",5));
		Car car = (Car)vechile;
		
		//�˴�һ���γ��Ѿ�������ϣ����½�Ϊ���������
		System.out.println(car.getBody());
		System.out.println(car.getWheels());
		System.out.println(car.getDecorate());
		System.out.println(car.getEqp());
		System.out.println(car.getLacquer());
		System.out.println(car.getAdjust());
		System.out.println(car.getTestResult());
		System.out.println(car.getType());
		System.out.println("��Ա����"+car.getPnum());
	}
	
}
