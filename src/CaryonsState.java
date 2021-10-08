
public class CaryonsState  implements PencilState{

	Pencil pencil;
	public CaryonsState(Pencil pencil) {
		this.pencil = pencil;
	}

	@Override
	public void start() {
		System.out.println("The pencil is used as caryons");
	}

	@Override
	public void stop() {
		System.out.println("The pencil is not used as caryons");
	
	}

}
