package arr;
import java.util.Arrays;
import java.util.Scanner;
public class Bj_arr_avr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		double []arr1 = new double [A];

		double result=0.0, result2=0.0;
		for(int i = 0; i<A; i++) {
			int B = sc.nextInt();
			arr1[i] = B;
		}
		Arrays.sort(arr1);
		for(int i=0; i<A; i++) {
			result = arr1[i]/arr1[arr1.length-1]*100;
			arr1[i] = result;
		}
		for(int i=0; i<A; i++) {
			result2 = (arr1[i]+result2);
		}
		System.out.println(result2/A);
	}

}
