package Builder;

/**
 * �����������ɰ�װ�����ĳ���ָ�ӣ������װ���������
 * @author Administrator
 *
 */
public class VechileDirector {
	
	public Vechile constructVechile(IVechileBuilder builder){
		builder.buildBody();
		builder.buildWheels();
		builder.decorate();
		builder.installEqp();
		builder.adjust();
		builder.lacquer();
		builder.test();
		return builder.buildVechile();
	}
}
