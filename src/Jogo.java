import java.util.ArrayList;

public class Jogo {
	public static void main(String args[]) {

		ArrayList<GameObject> jogo = new ArrayList<GameObject>();

		jogo.add(new Cenario(0, 0));
		jogo.add(new SceneObject(15, 21, true));
		jogo.add(new Enemy(10, 30, 100));
		jogo.add(new Hero(15, 20, 100, 1500, 2));

		for (GameObject gm : jogo) {
			gm.update();
			gm.draw();

		}
	}
}
