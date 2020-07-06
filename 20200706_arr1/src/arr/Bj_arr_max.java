package arr;
import java.util.Scanner;
public class Bj_arr_max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result=0, check=0;
		for(int i=0; i<9; i++) {
			int A = sc.nextInt();
			int [] arr = new int[9] ;
			arr[i] = A;
			if(result<=arr[i]) {
				result=arr[i];
				check=i+1;
			}
		}
		System.out.println(result);
		System.out.println(check);
		
	}

}