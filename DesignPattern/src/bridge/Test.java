package bridge;

/**
 * �Ž�ģʽ���ŵ㣺
 * ����ӿڼ���ʵ�ֲ���
 * ��߿�������
 * ʹ�þ���ʵ�ֶԿͻ�͸����
 * 
 * ʵ�ַ�ʽ��ʹĿ����󼰶�������Ϊ�����࣬����������ΪĿ�����Ĺ��캯����Ρ�
 * ��Ŀ����󼰶�������ľ���ʵ�־�������е���
 * Ŀ����󣨳����ࣩ��ְ�����ֻ�ǵ��ö��������������
 * �������󣨳����ࣩ��ְ�����ֻ�Ƕ����˱���Ҫ�����£�������ô����ƾ����ʵ��
 * ������Ҳ����ѭ�˸��ھۡ�����ϵı����ּ
 * 
 * @author Teddy.shi
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("������:");
		Shape shape1 = new Rectangle(new DrawObject1());
		shape1.draw();
		
		System.out.println("�������廷:");
		Shape shape2 = new OlympicRings(new DrawObject2());
		shape2.draw();
	}
}
