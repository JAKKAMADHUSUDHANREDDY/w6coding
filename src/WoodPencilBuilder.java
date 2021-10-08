
public class WoodPencilBuilder extends PencilBuilder {

	public WoodPencilBuilder()
	{
		this.name = "Wood pencil";

	}
	@Override
	public PencilBuilder create() {
		this.state.add(name + " is creating");
		return this;
	}

	@Override
	public PencilBuilder dosomething() {
		this.state.add(name + " is writing");
		return this;
	}

	
}
