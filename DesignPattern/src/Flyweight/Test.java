package Flyweight;

/**
 * ����hashtableʵ�ֵ���Ԫģʽ(��Ԫģʽͨ���빤��ģʽ���ã������Container.get�����൱�ڹ���������
 * 
 * �ŵ㣺����֧�ֶ��ϸ���ȶ���Ĵ�ȡ������Լ�ڴ濪��
 * ��ν�Լ�����ü���Ψһ�ԣ����Ա����ظ������µĶ��󣨼����ֵ����Ψһȷ������
 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		
		Container c = new Container();
		ElementObject eo1;
		ElementObject eo2;
		ElementObject eo3;
		eo1 = c.get("v1");
		eo2 = c.get("v1");
		eo3 = c.get("v3");
		System.out.println(eo1.getValue());
		System.out.println(eo2.getValue());
		System.out.println(c.getSize());
		System.out.println(eo1==eo2);
		
	}
}
