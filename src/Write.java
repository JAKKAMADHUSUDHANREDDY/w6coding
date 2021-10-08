
public class Write implements PencilState{

	Pencil pencil;
	public Write(Pencil pencil) {
		this.pencil = pencil;
	}

	@Override
	public void start() {
		System.out.println("The pencil is used for writing");
	}

	@Override
	public void stop() {
		System.out.println("The pencil is not used for writing");
	}
}