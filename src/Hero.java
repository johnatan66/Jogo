
public class Hero extends GameObject implements Moveable{
	public int life;
	public int power;
	public int weapon;
	
	public Hero(int posX, int posY, int life, int power, int weapon) {
		super(posX, posY);
		this.life = life;
		this.power = power;
		this.weapon = weapon;
	}
	@Override
	public void update() {
		move(5, 20);
		System.out.println("Heroi atualizado");
		
	}
	@Override
	public void draw() {
		System.out.println("O Heroi foi desenhado");
		
	}
	@Override
	public void move(int direcao, int velocidade) {
		System.out.println("Heroi foi para: "+direcao+" com a velocidade: "+velocidade);
		
	}
	
	
	

}
