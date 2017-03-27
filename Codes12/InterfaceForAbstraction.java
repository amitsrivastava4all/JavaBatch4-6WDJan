class AllFeatures implements Silver,Gold{
	public void swimAllowed(){
		
	}
	public void golfAllowed(){
		
	}
	public void yogaAllowed(){
		
	}
	
}
interface Silver{
	public void yogaAllowed();
}
interface Gold{
	public void yogaAllowed();
	public void golfAllowed();
}
public class InterfaceForAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Silver all = new AllFeatures();
		all.yogaAllowed();
		//all.golfAllowed();

	}

}
