package bridge;

/**
 * 目标对象具体实现类，把目标对象具象化为奥运五环
 * @author Administrator
 *
 */
public class OlympicRings extends Shape {

	public OlympicRings(Draw myDraw) {
		super(myDraw);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		myDraw.drawCycle();
	}


}
