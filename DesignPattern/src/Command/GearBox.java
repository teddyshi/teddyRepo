package Command;

/**
 * ����������,Ϊ�˲��Լ�������Ե�λ����������
 * @author Administrator
 *
 */
public class GearBox {
	
	private boolean isRunning;
	
	private int speed;

	public GearBox(boolean isRunning, int speed) {
		super();
		this.isRunning = isRunning;
		this.speed = speed;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/**
	 * ��һ��
	 */
	public void speedPlus(){
		System.out.print("ִ�мӵ���"+getSpeed());
		setSpeed(getSpeed()+1);
		System.out.println("-->"+getSpeed());
	}
	
	/**
	 * ��һ��
	 */
	public void speedMinus(){
		System.out.print("ִ�м�����"+getSpeed());
		setSpeed(getSpeed()-1);
		System.out.println("-->"+getSpeed());
	}
	
	public void boot(){
		setRunning(true);
		System.out.print("ִ�е��"+getSpeed());
		System.out.println("-->"+getSpeed());
	}
	
	public void off(){
		setRunning(false);
		System.out.print("ִ��Ϩ��"+getSpeed());
		System.out.println("-->"+getSpeed());
	}
	
}
