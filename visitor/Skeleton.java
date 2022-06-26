package visitor;

public class Skeleton implements Enemy{
	
	private float speed;
	private int damage;
	
	public Skeleton() {
		this.speed = 1.5f;
		this.damage = 8;
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
		return visitor.calculateSkeletonPower(this);
	}

}
