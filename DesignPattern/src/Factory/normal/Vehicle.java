package Factory.normal;

public class Vehicle {
	
	private String type;//车型描述
	
	private String carNo;//车架号
	
	private String brand;//品牌

	
	
	public Vehicle(String type, String carNo, String brand) {
		super();
		this.type = type;
		this.carNo = carNo;
		this.brand = brand;
	}


	public void description(){//车辆描述
		System.out.println("车辆信息("+carNo+")===车型描述："+brand+","+type);
	}
	
}
