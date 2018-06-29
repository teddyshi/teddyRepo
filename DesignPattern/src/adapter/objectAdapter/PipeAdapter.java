package adapter.objectAdapter;

public class PipeAdapter implements Target {

	private PipeFour pipeFour;
	private PipeSix pipeSix;
	
	public PipeAdapter(PipeFour pipeFour,PipeSix pipeSix) {
		super();
		this.pipeFour = pipeFour;
		this.pipeSix = pipeSix;
	}

	public void describePipeFour() {
		// TODO Auto-generated method stub
		pipeFour.describePipeFour();
	}

	public void describePipeSix() {
		// TODO Auto-generated method stub
		System.out.println("||");
		System.out.println("||");
		System.out.println("\\/");
		pipeSix.describePipeSix();
	}

}
