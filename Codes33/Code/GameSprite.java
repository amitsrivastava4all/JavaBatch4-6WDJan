import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GameSprite {
	
	BufferedImage fullImage ;
	
	public GameSprite(String imageName){
		//fullImage = new ImageIcon(GameSprite.class.getResource("sprite.png")).getImage();
		try {
			fullImage = ImageIO.read(GameSprite.class.getResource(imageName)) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fullImage = ImageIO.read(new File("c:\\image\\mypic.jpg"));
	}
	
	public Image getCamera(int x, int y , int w , int h){
		Image image =  fullImage.getSubimage(x, y, w, h);
		return image;
	}
	
	public  Image getSubImage(int imagePos){
		int width = 100;
		int height = 130;
		int y = 0 ;
		int gap = 20;
		int x   = imagePos - 1;
		x = x * width + gap ;
		
		Image image =  fullImage.getSubimage(x, y, width, height);
		return image;
	}

}
