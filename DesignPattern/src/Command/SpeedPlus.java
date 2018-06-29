package Command;

/**
 * º”µµ√¸¡Ó
 * @author Administrator
 *
 */
public class SpeedPlus extends Command {

	public SpeedPlus(GearBox mybox) {
		super(mybox);
	}

	public void execute() {
		// TODO Auto-generated method stub
		mybox.speedPlus();
	}

	public void undo() {
		mybox.speedMinus();
		// TODO Auto-generated method stub

	}
	
}
