package Factory.normal;

public class Vehicle {
	
	private String type;//��������
	
	private String carNo;//���ܺ�
	
	private String brand;//Ʒ��

	
	
	public Vehicle(String type, String carNo, String brand) {
		super();
		this.type = type;
		this.carNo = carNo;
		this.brand = brand;
	}


	public void description(){//��������
		System.out.println("������Ϣ("+carNo+")===����������"+brand+","+type);
	}
	
}
