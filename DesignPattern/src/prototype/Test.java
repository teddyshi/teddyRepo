package prototype;

/**
 * ԭ��ģʽ���ŵ㣺
 * ���һ�����ж���A��ʵ�������Բ�ʹ��new�ؼ��������������µ�ʵ�������Ǹ���.clone�������õ���ʵ����
 * ��ô�����ŵ����ڸ�Ч�������¡��ֱ�����ڴ��и��ƶ��󣬶�����һ��������Ҫ���ڴ����¿��ٿռ䡣
 * �������ǳ����֮�֣�ǳ������ָ�������������ٿռ䣬���󼰼��ϵȸ������Թ���ռ䡣
 * �����ָ�����ۻ�������������һ����ٿռ䣬���û���Ӱ�졣
 * ����java�е�cloneable�ӿڣ�Ĭ��ʵ��ǳ�������������clone�����������ֹ�ʵ�֡�
 * ���ʵ�֣�
 * ֻҪA��ʵ��Cloneable�ӿڣ����Ҹ�����ԭ�е�clone��������ôA�����ԭʵ�����������ʵ�������Կ�¡������
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Prototype p1 = new Prototype("123");
		Prototype p2 = (Prototype)p1.clone();
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}
}
