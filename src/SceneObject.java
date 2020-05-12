
public class SceneObject extends GameObject {
	private boolean visible;

	public SceneObject(int posX, int posY, boolean visible) {
		super(posX, posY);
		this.visible = visible;
	}

	@Override
	public void update() {
		System.out.println("executei o update na cena");

	}

	@Override
	public void draw() {
		if (visible) {
			System.out.println("executei o draw cena");

		} else {
			System.out.println("cena nao desenhada");
		}
	}

}
