import java.util.ArrayList;
import java.util.List;

public abstract class PencilBuilder {

	String name;
	List<String> state = new ArrayList<String>();

	public abstract PencilBuilder create();
	public abstract PencilBuilder dosomething();


	public Pencil buildPencil() {
		Pencil p = new Pencil();
		p.setName(this.name);
		p.addItems(state);
		return p;
	}
	
}
