package bridge;

/**
 * 目标对象具体实现类，把目标对象具象化为矩形
 * @author Administrator
 *
 */
public class Rectangle extends Shape {

	public Rectangle(Draw myDraw) {
		super(myDraw);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		myDraw.drawLine();
	}
}
