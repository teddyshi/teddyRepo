package Builder;

/**
 * 轿车的定义：三节车厢、坐5人。
 * @author Administrator
 *
 */
public class Car extends Vechile {
	
	private String type="三厢车";//车辆类型,两厢车,三厢车
	
	private int pnum =5;//乘员数

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public Car(String type, int pnum) {
		super();
		this.type = type;
		this.pnum = pnum;
	}
	
	
	
}
