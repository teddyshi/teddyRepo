package bridge;

/**
 * Ŀ��������ʵ���࣬��Ŀ��������Ϊ����
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
