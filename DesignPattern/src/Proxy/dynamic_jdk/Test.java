package Proxy.dynamic_jdk;

/**
 * ��̬�������ڽӿڣ�JDK��
 * ����Ǵ���ģʽ��ͨʵ�ַ�ʽ��һ�����֡�
 * ��̬����ģʽ������Ŀ�������е����������Ҫ�Դ���ʽ����ʱ���ظ����롣
 * �ڵ���ʱ��̬���ɴ������ʵ�����󶨱�����Ŀ���࣬���䷽��һ�������ã�Ҳһ��������
 * ����Ա����Ӧҵ��ͬ����д�����Ĵ�����ʹ���������ֻ���ʵ��䶯�������invoke�������ɡ�
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
