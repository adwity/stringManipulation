
public class comp {

	public static String com(String a) {
		
		int count =0;
		String comp = "";
		for(int i =0;i<a.length();i++) {
			count++;
			if(i+1>=a.length() || a.charAt(i)!=a.charAt(i+1)) {
				comp = comp+a.charAt(i)+count;
				count = 0;
				System.out.println(comp);
			}
		}
		return comp;
		
	}
	
	public static void main(String[] args) {
		System.out.println(com("aaddwwwwwwwwwwwwwitttttttttttttttttttyy"));
	}
}
