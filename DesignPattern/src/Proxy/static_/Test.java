package Proxy.static_;

/**
 * ����ģʽ������AProxyImpl���AImpl��ʵ����A�ӿ�
 * AProxyImpl�Ĵ�����������AImpl���������������Լ�������Ĳ�����
 * ��ôAProxyImpl����AImpl1�Ĵ�����
 * ����ģʽ���ŵ㼰ʹ�ó��ϣ�
 * 1.�����ǲ���ֱ�ӵ���Դ��ʱ����������Գе���ͬ��ְ��
 * 2.����ֲ�
 * 3.Ԥ������������
 * Spring�����˴���ģʽʵ����AOP��Ƭ��������ʽ�������
 * ������һЩ�������ֱ���Ĺ�������ȡ�����̻�������ʹ�����ǵĿ�����Աֻרע��ҵ���߼���
 * ���⣬���ǻ��ᵽ�������ֶ�̬����ģʽ��ʵ�ַ�ʽ�����ڽӿڵ�InvocationHandlerʵ�ַ�ʽ���Լ�cglibʵ�ַ�ʽ
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		A a  = new AProxyImpl();
		a.doAction();
	}
}
