package bridge;

/**
 * Ŀ����󣨳����ࣩ
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
