package Facade;

public class Facade {
	private ServiceA serviceA;
	
	private ServiceB serviceB;

	
	public Facade() {
		super();
		this.serviceA = new ServiceAImpl();
		this.serviceB = new ServiceBImpl();
	}

	public ServiceA getServiceA() {
		return serviceA;
	}

	public void setServiceA(ServiceA serviceA) {
		this.serviceA = serviceA;
	}

	public ServiceB getServiceB() {
		return serviceB;
	}

	public void setServiceB(ServiceB serviceB) {
		this.serviceB = serviceB;
	}
	
	public void action(){
		serviceA.action();
		serviceB.action();
	}
}
