package Observer;

import java.util.Observable;

/**
 * ���۲��߶��󣬱�������������̨�ϵĸ���
 * @author Administrator
 *
 */
public class ObsObject extends Observable {
	
	private int val = 0;
	
	public void doSomethings(){//����
		super.setChanged();
		val = 1;
		notifyObservers("��ί�ǣ��ҵı����Ѿ������");//֪ͨ���й۲��ߣ����۲�����Ѿ�������ʲô
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	
}
