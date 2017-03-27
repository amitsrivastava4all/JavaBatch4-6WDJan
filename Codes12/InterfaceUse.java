/*
 * Java 7
 * interface are 100% Abstract
 * abstract methods + Constants
 * What to do
 */
interface StarPlayer{
	void fly();
	void hide();
}
interface IPlayer{
	int MIN_POWER = 1; // public static final int MIN_POWER = 1;
	int MAX_POWER = 10;
	int DEFAULT_POWER = 3;
	void jump();  // public abstract void jump();
	int increasePower();
	int decreasePower();
	
	
}
abstract class CommonFeatures{
	void scoreCompute(){
		System.out.println("Compute Score");
	}
	void walk(){
		System.out.println("Player Walk");
	}
}
// How to do
class RedPlayerImpl extends CommonFeatures implements IPlayer,StarPlayer{
	int power = DEFAULT_POWER;
	@Override
	public void jump(){
		System.out.println("Red Player Jumps High");
	}
	@Override
	public int increasePower() {
		// TODO Auto-generated method stub
		return power>=MAX_POWER?MAX_POWER:++power;
	}
	@Override
	public int decreasePower() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
}
class GreenPlayerImpl implements IPlayer{
	int power = DEFAULT_POWER;
	@Override
	public void jump(){
		System.out.println("Green Player Jumps Average");
	}

	public int increasePower() {
		// TODO Auto-generated method stub
		 return power>=MAX_POWER?MAX_POWER:(power+=2);
	}

	public int decreasePower() {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class InterfaceUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedPlayerImpl redPlayer = new RedPlayerImpl();
		redPlayer.fly();
		redPlayer.walk();
		redPlayer.jump();

	}

}
