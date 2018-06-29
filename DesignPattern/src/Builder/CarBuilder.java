package Builder;

/**
 * ����γ����������岽�裬�Դ�����ԽҰ��SuvҲӦ��ӵ������Ľ��첽��
 * @author Administrator
 *
 */
public class CarBuilder implements IVechileBuilder {

	Car car;
	
	
	public CarBuilder(String type,int pNum) {
		car = new Car(type,pNum);
	}

	public void adjust() {
		car.setAdjust("������У");
	}

	public void buildBody() {
		car.setBody("���쳵��");
	}

	public Vechile buildVechile() {
		return car;
	}

	public void buildWheels() {
		car.setWheels("װ�䳵��");
	}

	public void decorate() {
		car.setDecorate("����װ��");
	}

	public void installEqp() {
		car.setEqp("��װ���ڵ����豸");
	}

	public void lacquer() {
		car.setLacquer("���ᡢ�濾");
	}

	public void test() {
		car.setTestResult("��������");
	}

}
