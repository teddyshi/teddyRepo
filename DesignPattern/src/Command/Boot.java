package Command;

/**
 * µã»ğÃüÁî
 * @author Administrator
 *
 */
public class Boot extends Command {
	
	public Boot(GearBox mybox) {
		super(mybox);
	}

	public void execute() {
		// TODO Auto-generated method stub
		mybox.boot();
	}
	
	public void undo() {
		// TODO Auto-generated method stub
		mybox.off();
	}

}
