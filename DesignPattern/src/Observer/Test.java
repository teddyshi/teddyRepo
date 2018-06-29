package Observer;

/**
 * 观察者模式：
 * 定义一个被观察者，定义若干个观察者
 * 被观察者做一件事，并通知观察者，被加入观察列表的观察者能够感知到这件事。
 * 这就是观察者模式，也是大多数事件模型的设计思路
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		//创建被观察者对象
		ObsObject obs = new ObsObject();
		
		//加入观察者对象到观察列表
		obs.addObserver(new ObserverB());
		obs.addObserver(new ObserverA());
		
		
		//被观察者开始表演
		obs.doSomethings();
	}
}
