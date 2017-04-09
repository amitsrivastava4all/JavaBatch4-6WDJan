import java.io.File;

import jaco.mp3.player.MP3Player;

public class PlaySong {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MP3Player mp3 = new MP3Player(new File("/Users/amit/Documents/songs/E.mp3"));
		mp3.play();
		Thread.sleep(15000);
	}

}
