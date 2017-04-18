
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuilder sb = new StringBuilder("hello");
		StringBuffer sb = new StringBuffer("hello");
		sb.append("hello").append("how").append(200.30);
		sb.insert(1, "hi");
		sb.reverse();
		System.out.println(sb);
		sb.deleteCharAt(0);
		sb.delete(2, 5);
		sb.setCharAt(2, 'a');
		sb.ensureCapacity(1000);
		sb.trimToSize();
		String t = sb.toString();
		
	}

}
