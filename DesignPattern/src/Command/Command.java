package Command;

/**
 * ���������
 * @author Administrator
 *
 */
public abstract class Command{
	
	protected GearBox mybox;
	
	public Command(GearBox mybox) {
		super();
		this.mybox = mybox;
	}
	abstract void execute();//ִ��
	
	abstract void undo();//����
}
