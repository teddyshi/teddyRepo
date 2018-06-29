package Command;

/**
 * Ï¨»ğÃüÁî
 * @author Administrator
 *
 */
public class Off extends Command {

	public Off(GearBox mybox) {
		super(mybox);
		// TODO Auto-generated constructor stub
	}

	@Override
	void execute() {
		// TODO Auto-generated method stub
		mybox.off();
	}

	@Override
	void undo() {
		// TODO Auto-generated method stub
		mybox.boot();
	}

}
