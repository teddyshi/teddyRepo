package Proxy.dynamic_cglib;


/**
 * ����cglib�Ķ�̬����ʵ�֣������������̣�AOP��ʵ�ֻ��ơ�
 * ����Ǵ���ģʽ�ı��֣���ͨ����ģʽ���ǻ��ڽӿڵģ����˱��ֵ�ʵ�ַ�ʽ������ӿڵġ�
 * ����ʵ�ֻ���˼���ǣ�������еı�����Ŀ���࣬����һ����������̳���Ŀ���࣬ǿ�Ƹ��Ǹ��෽�������������������
 * Ȼ��̬����һ���������ʵ���������á�
 * ��cglib��̬����ʵ�ֻ��ƣ���ǿ��֮�����ڣ�����ӿڣ����ⲻ��Ҫ���ظ�������룬ʹ����Աרע�����������
 * Ȼ����ȱ�����ڣ�������˼̳л��ƣ��ʱ�final���ε��࣬�ǲ��ܱ�����ġ�
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
