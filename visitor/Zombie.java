package visitor;

public class Zombie implements Enemy{
	
	private float speed;
	private int damage;
	
	public Zombie() {
		this.speed = 0.5f;
		this.damage = 10;
	}

	@Override
	public float getSpeed() {
		return this.speed;
	}

	@Override
	public int getDamage() {
		return this.damage;
	}

	@Override
	public float getPower(Visitor visitor) {
		return visitor.calculateZombiePower(this);
	}

}
