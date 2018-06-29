package singleton;

/**
 * 单例模式：定义一个类，将其构造函数定义为私有，使外部不能new关键字实例化之。
 * 定义一个getInstance方法返回一个单例
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
