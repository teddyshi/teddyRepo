package adapter.classAdapter;

import adapter.objectAdapter.PipeFour;
import adapter.objectAdapter.PipeSix;
import adapter.objectAdapter.Target;

public class PipeAdapter extends PipeFour implements Target {
	
	private PipeSix pipeSix;
	
	public PipeAdapter(PipeSix pipeSix) {
		super();
		this.pipeSix = pipeSix;
	}

	public void describePipeSix() {
		// TODO Auto-generated method stub
		System.out.println("||");
		System.out.println("||");
		System.out.println("\\/");
		pipeSix.describePipeSix();
	}

}
