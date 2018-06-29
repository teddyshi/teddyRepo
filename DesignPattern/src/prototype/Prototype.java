package prototype;

public class Prototype implements Cloneable {
	
	private String name ;

	
	public Prototype(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone()  {
		try{
			return super.clone();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	
}
