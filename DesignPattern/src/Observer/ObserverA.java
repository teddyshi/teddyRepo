package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("A听到："+arg1.toString());
		if(arg0 instanceof ObsObject){
			ObsObject oo = (ObsObject)arg0;
			System.out.println("A说：ObsObject的情况我们已经了解，他把私有变量val改变为"+oo.getVal()+"，我们会酌情考虑的");
		}
	}

}
