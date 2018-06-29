package Flyweight;

/**
 * 利用hashtable实现的享元模式(享元模式通常与工厂模式并用，这里的Container.get方法相当于工厂方法）
 * 
 * 优点：可以支持多个细粒度对象的存取，并节约内存开销
 * 如何节约？利用键的唯一性，可以避免重复建立新的对象（假设键值可以唯一确定对象）
 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		
		Container c = new Container();
		ElementObject eo1;
		ElementObject eo2;
		ElementObject eo3;
		eo1 = c.get("v1");
		eo2 = c.get("v1");
		eo3 = c.get("v3");
		System.out.println(eo1.getValue());
		System.out.println(eo2.getValue());
		System.out.println(c.getSize());
		System.out.println(eo1==eo2);
		
	}
}
