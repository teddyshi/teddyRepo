package singleton;

/**
 * ����ģʽ������һ���࣬���乹�캯������Ϊ˽�У�ʹ�ⲿ����new�ؼ���ʵ����֮��
 * ����һ��getInstance��������һ������
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
