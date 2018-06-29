package Proxy.dynamic_cglib;


/**
 * 基于cglib的动态代理实现，即面向切面编程，AOP的实现机制。
 * 这个是代理模式的变种，普通代理模式都是基于接口的，而此变种的实现方式是无需接口的。
 * 它的实现基本思想是，针对已有的被代理目标类，生成一个代理子类继承自目标类，强制覆盖父类方法，可添加其他操作。
 * 然后动态生成一个该子类的实例，供调用。
 * 此cglib动态代理实现机制，其强大之处在于：无需接口，避免不必要的重复冗余代码，使程序员专注于切面操作。
 * 然而其缺点在于：因采用了继承机制，故被final修饰的类，是不能被代理的。
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		AnimalProxyCglib apc = new AnimalProxyCglib();
		AnimalImpl ai = (AnimalImpl)apc.getInstance(new AnimalImpl());
		ai.eat();
	}
}
