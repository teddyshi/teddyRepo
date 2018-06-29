package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverB implements Observer {

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("B听到："+arg1.toString());
		System.out.println("B说：ObsObject的情况我们也刚得知，这并做不是很好，我们要批评！");
	}

}
