package Command;

/**
 * ����ģʽ��
 * �����������������������ߵ���ϵ�������߼��ͻ��˳��򣬲���֪���κν������κνӿڡ�
 * �����װ�ɱȽ��ھ۵Ķ��󣬴Ӷ�ʹ��������־��¼����Ҫ��������������������Ӧ�ó���ʱ�����ˣ�Undo��������ʵ�ֵġ�
 * �����У����ǰ�������𡢱�����Ӽ�������Ϊ��װ��Ϊ�˱�������󣬼����ֿ�������Ѽ�ʻԱ����ɵ����ߣ���װ��Ϊ��UndoControl����
 * ������������������������������֮�䣬�����ͨ��commandģʽ����ġ�
 * 
 * ����ģʽ�ĺô��ǽ����Ӧ���ڽ϶ೣ��������һ�����ģʽ������������ơ�֧�ֳ������¼���־����������ȵ�
 * ȱ���ǣ���Ҫ���ɹ���ľ��������ࡣ
 * 
 * 
 * @author teddy.shi
 */
public class Test {
	public static void main(String[] args) {
		//��ʼ������
		Undoable myControl = new UndoControl();//��ʼ�����ȿ�����
		GearBox box = new GearBox(false,0);//��ʼ�������䣬δ��������ǰ��λ0
		Boot bootCmd = new Boot(box);//�������
		Off offCmd = new Off(box);//Ϩ������
		SpeedMinus minusCmd = new SpeedMinus(box);//��������
		SpeedPlus plusCmd = new SpeedPlus(box);//�ӵ�����
		
		//���ȿ�ʼ
		System.out.println("������ȿ�ʼ");
		myControl.executeCommond(bootCmd);
		myControl.executeCommond(plusCmd);
		myControl.executeCommond(minusCmd);
		myControl.executeCommond(plusCmd);
		myControl.executeCommond(plusCmd);
		myControl.executeCommond(plusCmd);
		

		//�����������
		System.out.println("����ģʽ�µĵ������˲��ԣ�");
		myControl.undoByStep();
		System.out.println("����ģʽ�µĵ������˲��ԣ�");
		myControl.undoByStep();
		
		System.out.println("����ģʽ�µ�ȫ�����˲��ԣ�");
		myControl.undoAll();

		
	}
}
