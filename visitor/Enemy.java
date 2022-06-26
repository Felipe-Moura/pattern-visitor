package visitor;

public interface Enemy {
	
	public float getSpeed();
	
	public int getDamage();
	
	public float getPower(Visitor visitor);

}
