package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverB implements Observer {

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("B������"+arg1.toString());
		System.out.println("B˵��ObsObject���������Ҳ�յ�֪���Ⲣ�����Ǻܺã�����Ҫ������");
	}

}
