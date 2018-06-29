package Command;

/**
 * ºıµµ√¸¡Ó
 * @author Administrator
 *
 */
public class SpeedMinus extends Command {
	


	public SpeedMinus(GearBox mybox) {
		super(mybox);
		// TODO Auto-generated constructor stub
	}

	public void execute() {
		// TODO Auto-generated method stub
		mybox.speedMinus();
	}

	public void undo() {
		// TODO Auto-generated method stub
		mybox.speedPlus();
	}

}
