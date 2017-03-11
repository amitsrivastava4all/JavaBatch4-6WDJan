import java.util.LinkedList;

class Song
{
	int duration;
	String name;
	String albumName;
	int rating;
	Song(int duration, String name, String albumName, int rating){
		this.duration = duration;
		this.name = name;
		this.albumName = albumName;
		this.rating = rating;
	}
}
class Student{
	int rollno;
	String name;
}
public class SongDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y1 = 200;
		Integer gg =900;
		gg++;
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(gg);
		l1.add(y1);
		l1.add(gg + y1);
		
		
		Song boomboom = new Song(6,"Boom Boom","Boom 2012",5);
		LinkedList songList =new LinkedList();
		Student ram =new Student();
		songList.add(boomboom);
		songList.add(ram);
		
		
		LinkedList l = new LinkedList();
		int pp = 100;
		Integer kk = new Integer(pp);  // Boxing
		Integer kk1 = new Integer(200);  // Boxing
		l.add(kk);
		l.add(kk1);
		int result = kk.intValue() + kk1.intValue();  //UnBoxing
		Integer rr = new Integer(result);  // Boxing
		l.add(rr);
		System.out.println(l);
		
	}

}
