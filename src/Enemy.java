
public class Enemy extends GameObject implements Moveable{
	public int life;

	public Enemy(int posX, int posY, int life) {
		super(posX, posY);
		this.life = life;
	}

	@Override
	public void update() {
		move(10, 20);
		System.out.println("inimigo atualizado");
		
	}

	@Override
	public void draw() {
		System.out.println("O inimigo foi desenhado");
	}

	@Override
	public void move(int direcao, int velocidade) {
		System.out.println("inimigo foi para: "+direcao+" com a velocidade: "+velocidade);
		
	}
	

}
