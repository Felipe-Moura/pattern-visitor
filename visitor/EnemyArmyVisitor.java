package visitor;

public class EnemyArmyVisitor implements Visitor{
	
	public EnemyArmyVisitor() {}

	@Override
	public float calculateZombiePower(Zombie zombie) {
		return zombie.getSpeed() * zombie.getDamage();
	}

	@Override
	public float calculateSkeletonPower(Skeleton skeleton) {
		return skeleton.getSpeed() * skeleton.getDamage();
	}

}
