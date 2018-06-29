package Proxy.dynamic_jdk;

/**
 * 动态代理（基于接口，JDK）
 * 这个是代理模式普通实现方式的一个变种。
 * 动态代理模式避免了目标类中有当多个方法需要以代理方式调用时的重复代码。
 * 在调用时动态生成代理类的实例，绑定被代理目标类，则其方法一旦被调用，也一并被代理。
 * 程序员不必应业务不同而编写大量的代理类和代理方法，而只需适当变动代理类的invoke方法即可。
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		AnimalProxy ap = new AnimalProxy();
		Animal a = (Animal)ap.bind(new AnimalImpl());
		a.eat();
		a.sleep();
	}
}
