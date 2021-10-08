
public class PencilMainClass {

	public static void main(String[] args) {

		PencilBuilder wood = new WoodPencilBuilder();
		Pencil p = wood.create().dosomething().buildPencil();
		p.startstate();
		p.setPs(new Write(p));
		p.start();
		p.stop();
		
		PencilBuilder color = new ColorPencilBuilder();
		p = color.create().dosomething().buildPencil();
		p.startstate();
		p.setPs(new Color(p));
		p.start();
		p.stop();
		p.setPs(new WaterColor(p));
		p.start();
		p.stop();
		p.setPs(new CaryonsState(p));
		p.start();
		p.stop();
		
		
	}
}
