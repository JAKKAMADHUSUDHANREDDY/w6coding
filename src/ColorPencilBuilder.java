
public class ColorPencilBuilder extends PencilBuilder {

	public ColorPencilBuilder()
	{
		this.name = "Color pencil";

	}
	@Override
	public PencilBuilder create() {
		this.state.add(name + " is creating");
		return this;
	}

	@Override
	public PencilBuilder dosomething() {
		this.state.add(name + " is doing colors");
		return this;
	}

	
}
