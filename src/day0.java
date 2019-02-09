import java.util.Scanner;

public class day0 {


	public static int hashFunction(int a) {
		int x = a%13;
		if (x==0) {
			return 13;
		}
		
		return x;
	}
	
	public static void main(String args[]) {
		int[] x = {12,43,54,56,89,123,564};
		int[] y = new int[13];
		for(int i =0; i<x.length;i++) {
			y[i] = hashFunction(x[i]);
			System.out.println(y[i]);
		}
		
		int[] z = new int[13];
		for(int i=0;i<z.length;i++) {
			if(y[i]==0){
			z[y[i]] = x[i];
			System.out.println("the element "+x[i]+ " is in position "+y[i]);}
			else {
				z[y[i]+1] = x[i];
				System.out.println("the element "+x[i]+ " is in position "+(y[i]+1));}
			}
		}
		

}
