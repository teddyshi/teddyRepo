package Builder;

/**
 * �γ��Ķ��壺���ڳ��ᡢ��5�ˡ�
 * @author Administrator
 *
 */
public class Car extends Vechile {
	
	private String type="���ᳵ";//��������,���ᳵ,���ᳵ
	
	private int pnum =5;//��Ա��

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
