import java.util.List;

public class Pencil {

	PencilState colorstate;
	PencilState watercolors;
	PencilState writestate;
	PencilState caryons;

	PencilState state;
	String name;
	List<String> pencilstate;

	public Pencil()
	{
		colorstate = new Color(this);
		watercolors = new WaterColor(this);
		writestate = new Write(this);
		caryons = new CaryonsState(this);		
	}

	void addItems(List<String> item) {
		this.pencilstate = item;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	
	void startstate() {
		System.out.println( "......."+ name + ".......");
		for (String p : pencilstate) {
			System.out.println("   " + p);
		}
	}
	public PencilState getPs() {
		return state;
	}

	public void setPs(PencilState ps) {
		this.state = ps;
	}

	public void start() {
		state.start();
	}
	
	public void stop() {
		state.stop();
	}

	public PencilState getColorstate() {
		return colorstate;
	}

	public PencilState getWatercolors() {
		return watercolors;
	}

	public PencilState getWritestate() {
		return writestate;
	}

	public PencilState getCaryons() {
		return caryons;
	}
	
}
