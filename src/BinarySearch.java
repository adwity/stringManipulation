
public class BinarySearch {

	public static int index(int find, int[] a) {

		int f = 0;
		int l = a.length - 1;
		int mid = (f + l) / 2;

		while (f <= l) {
			if (a[mid] > find) {
				l = mid-1;
			} else if (a[mid] < find) {
				f = mid+1;
			}

			else if (a[mid] == find) {
				return mid;
			}
			
			mid=(f + l) / 2;
		}

		return -1;

	}
	
	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,7,8,30,67};
		int find = 65;
		int b =		index(find,a);
		System.out.print(b);
	}


}
