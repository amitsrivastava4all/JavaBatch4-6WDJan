import java.util.Random;

public interface Util {
	Random r = new Random();
	static int getRandomNo(int seed){
		int number = r.nextInt(seed);
		if(number==0){
			return 11;
		}
		return number;
	}
}
