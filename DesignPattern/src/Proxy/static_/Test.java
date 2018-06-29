package Proxy.static_;

/**
 * 代理模式：假设AProxyImpl类和AImpl都实现了A接口
 * AProxyImpl的代理方法调用了AImpl的主方法并加入自己所定义的操作。
 * 那么AProxyImpl就是AImpl1的代理类
 * 代理模式的优点及使用场合：
 * 1.当我们不想直接调用源类时，代理类可以承担相同的职责。
 * 2.代码分层
 * 3.预处理及后续处理
 * Spring利用了代理模式实现了AOP切片，及声明式事务管理。
 * 这样将一些繁琐而又必须的工作给抽取出并固化下来，使得我们的开发人员只专注于业务逻辑。
 * 另外，我们会提到另外两种动态代理模式的实现方式：基于接口的InvocationHandler实现方式，以及cglib实现方式
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		A a  = new AProxyImpl();
		a.doAction();
	}
}
