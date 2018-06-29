package composite;

import java.util.ArrayList;

public class ProjectManager extends Employer {

	public ProjectManager(String name) {
		super(name);
	}

	@Override
	public void add(Employer emp) {
		if(employers==null){
			employers = new ArrayList<Employer>();
		}
		employers.add(emp);
	}

	@Override
	public void delete(Employer emp) {
		if(employers==null){
			employers = new ArrayList<Employer>();
		}
		employers.remove(emp);
	}

}
