package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("A������"+arg1.toString());
		if(arg0 instanceof ObsObject){
			ObsObject oo = (ObsObject)arg0;
			System.out.println("A˵��ObsObject����������Ѿ��˽⣬����˽�б���val�ı�Ϊ"+oo.getVal()+"�����ǻ����鿼�ǵ�");
		}
	}

}
