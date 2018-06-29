package Observer;

import java.util.Observable;

/**
 * 被观察者对象，比如声动亚洲舞台上的歌手
 * @author Administrator
 *
 */
public class ObsObject extends Observable {
	
	private int val = 0;
	
	public void doSomethings(){//表演
		super.setChanged();
		val = 1;
		notifyObservers("评委们，我的表演已经完成了");//通知所有观察者，被观察对象已经发生了什么
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	
}
