package Command;

/**
 * 命令抽象父类
 * @author Administrator
 *
 */
public abstract class Command{
	
	protected GearBox mybox;
	
	public Command(GearBox mybox) {
		super();
		this.mybox = mybox;
	}
	abstract void execute();//执行
	
	abstract void undo();//回退
}
