
public class StringBadUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("fhdjhfkjdshfhsffhdhgjhghdfhghdgdhgkjgfhdhghkdhfkjhsdkjfhksjd");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("fjdshkjfhf");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		String sql = "select * from property";
		String location = "noida    ";
		if(location!=null && location.trim().length()>0){
			sql  = sql + " where location='"+location+"'";
		}

	}

}
