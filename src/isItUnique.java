
public class isItUnique {
	
static boolean isUnique(String str) {
	
		if(str.length()>128) {
			return false;
		}
		boolean[] asci = new boolean[128];
		for(int i =0; i<str.length();i++) {
			int val = str.charAt(i);
			if(asci[val]) {
				return false;
			}
			asci[val]=true;
		}
		
		return true;
}

public static void main(String[] args) {
	boolean z = isUnique("adwity aryal");
	System.out.println(z);
}
}
