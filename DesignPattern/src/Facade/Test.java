package Facade;

/**
 * 外观模式
 * 在明确哪些子系统可以处理客户的请求时，外观模式可以指派不同的任务。
 * 在b/s构架中的mvc三层结构中，服务调用服务就属于外观模式。
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		ServiceA a = new ServiceAImpl();
		ServiceB b = new ServiceBImpl();
		a.action();
		b.action();
		System.out.println("=============");
		
		Facade f = new Facade();
		f.action();
	}
}
