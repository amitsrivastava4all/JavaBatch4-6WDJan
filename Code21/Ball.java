
public class Ball {
	private int x;
	private int y;
	private int w;
	private int h;
	private int speed;
	private int yspeed;
	Ball(int x, int y){
		this.x = x;
		this.y = y;
		this.h=this.w=50;
		this.speed = 10;
		this.yspeed=10;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void move(){
		if(x>(GameConstants.GWIDTH-this.w)){
			speed = -10;
		}
		else
		if(x<=0){
			speed = 10;
		}
		if(y>(GameConstants.GHEIGHT-this.h)){
			yspeed = -10;
		}
		else
			if(y<=0)
		{
			yspeed = 10;
		}
		x = x + speed;
		y = y + yspeed;
	}
}
