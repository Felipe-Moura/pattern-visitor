import visitor.EnemyArmyVisitor;
import visitor.Skeleton;
import visitor.Zombie;

public class Main {

	public static void main(String[] args) {
		
		Zombie myZombie = new Zombie();
		Skeleton mySkeleton = new Skeleton();
		int numberOfZombies = 50;
		int numberOfSkeletons = 30;
		
		EnemyArmyVisitor visitor = new EnemyArmyVisitor();
		
		float armyPower = (visitor.calculateZombiePower(myZombie) * numberOfZombies) + (visitor.calculateSkeletonPower(mySkeleton) * numberOfSkeletons);
		
		System.out.println("The power of your army is: " + armyPower);

	}

}
