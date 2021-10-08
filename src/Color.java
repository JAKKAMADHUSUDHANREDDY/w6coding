
public class Color implements PencilState{

	Pencil pencil;
	public Color(Pencil pencil) {
		this.pencil = pencil;
	}

	@Override
	public void start() {
		System.out.println("The pencil is in coloring state");
	}

	@Override
	public void stop() {
		System.out.println("The coloring state of pencil is stopped");
	
	}

}
