package Facade;

/**
 * ���ģʽ
 * ����ȷ��Щ��ϵͳ���Դ���ͻ�������ʱ�����ģʽ����ָ�ɲ�ͬ������
 * ��b/s�����е�mvc����ṹ�У�������÷�����������ģʽ��
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
