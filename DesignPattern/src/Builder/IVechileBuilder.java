package Builder;

/**
 * ���峵����ͨ�ý��첽��
 * @author Administrator
 *
 */
public interface IVechileBuilder {
	
	void buildBody();//���쳵��
	
	void buildWheels();//��װ����
	
	void lacquer();//����
	
	void decorate();//����װ��
	
	void installEqp();//��װ���ڵ����豸
	
	void adjust();//�������ܵ�У
	
	void test();//�������
	
	Vechile buildVechile();//���ؽ���ĳ���
}
