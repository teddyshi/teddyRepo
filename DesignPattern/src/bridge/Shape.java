package bridge;

/**
 * 目标对象（抽象类）
 * @author Administrator
 *
 */
public abstract class Shape {
	
	protected Draw myDraw;
	
	public Shape(Draw myDraw) {
		this.myDraw = myDraw;
	}

	public abstract void draw();
	
}
