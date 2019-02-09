
public class replace {

	public static boolean repla(String a, String b) {
		
		if(a.length()!=b.length()) {
			return false;
		}
		String temp ="";
		for(int i =b.length(); i>0;i--) {
			char c = b.charAt(i-1);
			temp = temp+c;
		}
		
		if(a.equals(temp)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.print(repla("cata","taca"));
	}
}
