
public class WaterColor implements PencilState{

	Pencil pencil;
	public WaterColor(Pencil pencil) {
		this.pencil = pencil;
	}

	@Override
	public void start() {
		System.out.println("The pencil is used as water colors");
	}

	@Override
	public void stop() {
		System.out.println("The pencil is not used as water colors");
	}
}