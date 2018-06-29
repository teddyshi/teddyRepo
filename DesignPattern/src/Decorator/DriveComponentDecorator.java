package Decorator;

public class DriveComponentDecorator extends DriveComponent {

	private Drive component;
	
	public DriveComponentDecorator(Drive component) {
		super();
		this.component = component;
	}

	public void action() {
		// TODO Auto-generated method stub
		System.out.print("天气很好,");
		component.action();
	}

}
