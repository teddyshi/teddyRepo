package Observer;

/**
 * �۲���ģʽ��
 * ����һ�����۲��ߣ��������ɸ��۲���
 * ���۲�����һ���£���֪ͨ�۲��ߣ�������۲��б�Ĺ۲����ܹ���֪������¡�
 * ����ǹ۲���ģʽ��Ҳ�Ǵ�����¼�ģ�͵����˼·
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		//�������۲��߶���
		ObsObject obs = new ObsObject();
		
		//����۲��߶��󵽹۲��б�
		obs.addObserver(new ObserverB());
		obs.addObserver(new ObserverA());
		
		
		//���۲��߿�ʼ����
		obs.doSomethings();
	}
}
