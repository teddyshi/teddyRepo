package Command;

/**
 * 汽车变速箱,为了测试简单起见，对档位数不加限制
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
	 * 加一档
	 */
	public void speedPlus(){
		System.out.print("执行加档："+getSpeed());
		setSpeed(getSpeed()+1);
		System.out.println("-->"+getSpeed());
	}
	
	/**
	 * 减一档
	 */
	public void speedMinus(){
		System.out.print("执行减档："+getSpeed());
		setSpeed(getSpeed()-1);
		System.out.println("-->"+getSpeed());
	}
	
	public void boot(){
		setRunning(true);
		System.out.print("执行点火："+getSpeed());
		System.out.println("-->"+getSpeed());
	}
	
	public void off(){
		setRunning(false);
		System.out.print("执行熄火："+getSpeed());
		System.out.println("-->"+getSpeed());
	}
	
}
