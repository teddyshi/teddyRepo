package Decorator;

/**
 * ��һ��������һЩ����ְ�𣬲�����Ӱ��ԭ�����ִ���߼�
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		//װ��ǰ
		Drive component = new DriveComponent();
		component.action();
		//װ�κ�
		Drive decorator = new DriveComponentDecorator(component);
		decorator.action();
	}
}
