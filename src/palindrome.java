
public class palindrome {

	static boolean check(String a) {
		int i = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		System.out.print("runs");
		for (int i1 =0; i1<a.length();i1++) {
			System.out.println("l");
			int x = a.charAt(i1);
			System.out.print(x);
			table[x]++;
		}

		for (int count : table) {
			if (count % 2 == 1) {
				i++;
			}
		}

		if (i > 1) {
			return false;
		}

		return true;

	}

	public static void Main(String[] args) {
		check("aaaaafff");
	}

}
