package Decorator;

/**
 * 给一个类增加一些额外职责，并不会影响原来类的执行逻辑
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		//装饰前
		Drive component = new DriveComponent();
		component.action();
		//装饰后
		Drive decorator = new DriveComponentDecorator(component);
		decorator.action();
	}
}
