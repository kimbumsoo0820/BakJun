package arr;
import java.util.Arrays;
import java.util.Scanner;
public class Bj_arr_maxmin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int [] arr = new int [A];
		for(int i =0; i<A; i++) {
			int B = sc.nextInt();
			arr[i] = B;
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[A-1]);
		
	}

}
