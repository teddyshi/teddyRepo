package bridge;

/**
 * Ŀ��������ʵ���࣬��Ŀ��������Ϊ�����廷
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
