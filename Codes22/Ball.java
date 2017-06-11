import java.awt.Color;

public class Ball implements GameConstants {
	private int x;
	private int y;
	private int w;
	private int h;
	private int speed;
	private int yspeed;
	private Color color;
	private boolean isVisible;
	Ball(int x, int y){
		this.x = x;
		this.y = y;
		this.h=this.w=50;
		this.isVisible = true;
		this.color = getColor(Util.getRandomNo(5));
		this.speed = BALL_SPEED;
		this.yspeed=BALL_SPEED;
	}
	
	private Color getColor(int color){
		switch(color){
		case 0:
			return Color.RED;
		case 1:
			return Color.BLUE;
		case 2:
			return Color.WHITE;
		case 3:
			return Color.ORANGE;
		case 4:
			return Color.CYAN;
		case 5:
			return Color.YELLOW;
		default:
			return Color.GREEN;
		}
		
	}
	
	
	public boolean isVisible() {
		return isVisible;
	}


	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
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
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void move(){
		if(x>(GameConstants.GWIDTH-this.w)){
			speed = Util.getRandomNo(BALL_SPEED) * -1;
		}
		else
		if(x<=0){
			speed = Util.getRandomNo(BALL_SPEED);
		}
		if(y>(GameConstants.GHEIGHT-this.h)){
			yspeed = Util.getRandomNo(BALL_SPEED) * -1 ;
		}
		else
			if(y<=0)
		{
			yspeed = Util.getRandomNo(BALL_SPEED);;
		}
		x = x + speed;
		y = y + yspeed;
	}
}
