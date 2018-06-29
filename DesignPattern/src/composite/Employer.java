package composite;

import java.util.List;

public abstract class Employer {
	private String name;
	
	public Employer(String name) {
		super();
		this.name = name;
	}

	public abstract void add(Employer emp);
	
	public abstract void delete(Employer emp);
	
	public List<Employer> employers;
	
	public void printInfo(){
		System.out.println(name);
	}

	public List<Employer> getEmployers() {
		return employers;
	}
	
	

	
}
