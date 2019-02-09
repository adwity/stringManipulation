import java.util.Arrays;

public class permutation {

	public static String sort(String str) {
		char[] arrc = str.toCharArray();
		Arrays.sort(arrc);
		return new String(arrc);
	}
	
	public static void main(String[] args) {
		String a = "adwity";
		String b = "dwitya ";
		a = sort(a);
		b= sort(b);
		System.out.println(a.equals(b));
	}
}
