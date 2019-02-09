
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int num1=15;
		int num2=10;
		int div;
		if(num1>num2) {
			div=num2;
		}
		else {
			div=num1;
		}
		
		while((num1 % div !=0)|| (num2 % div !=0)) {
			div--;
		}
		System.out.print(div);
		
	}
}
