
public class testPrime {
	
	public static void main(String[] args) {
		int n =30;
		if(n<2) {
			System.out.print("not prime");
		}
		
		for(int i =2; i<n;i++) {
			if(n%i ==0) {
				System.out.print("not prime");
				break;
			}
			
			else {
				System.out.print("prime");
				break;
			}
		}
		
		
		
	}

}
