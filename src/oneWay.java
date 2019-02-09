
public class oneWay {

	static boolean onechar(String a, String b) {
		
		if(a.length() == b.length()) {
			return oneEdit(a,b);
		}
		
		if(a.length() +1 == b.length()) {
			return oneinsert(a,b);
		}
		if(a.length()-1 == b.length()) {
			return oneinsert(b,a);
		}
		return false;
		
	}

	private static boolean oneinsert(String a, String b) {
		boolean x = false;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				
				if(x) {
					return false;
				}
				x = true;
			}
		}
		return true;
	}

	private static boolean oneEdit(String a, String b) {
		int ind1 = 0;
		int in2 = 0;
		while(ind1<a.length() && in2<b.length()) {
			if(a.charAt(ind1)!=b.charAt(in2)) {
				if(ind1!=in2) {
				return false;
			}
				in2++;
				}
				else {
					ind1++;
					in2++;
				}
		}
			in2++;
			
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(onechar("adwity","adity"));
	}
}
