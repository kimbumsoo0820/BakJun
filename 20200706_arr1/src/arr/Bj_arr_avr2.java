package arr;
import java.util.Scanner;
public class Bj_arr_avr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
				
		for(int i=0; i<A; i++) {
			int B = sc.nextInt();			
			double result =0;			
			int[] arr = new int[B];
			for(int j=0; j<arr.length;j++) {
				int C = sc.nextInt();
				arr[j] = C;
				result +=arr[j];				
			}
			result = result/arr.length;
			int count=0;
			for(int k=0; k<arr.length; k++) {
				if(arr[k]>result) {
					count++;
				}				
			}
			result = (double)count/(double)B * 100;
			System.out.println(String.format("%.3f", result)+"%");
			
		}
	}
}
