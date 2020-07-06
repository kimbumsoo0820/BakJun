package arr;
import java.util.Scanner;
import java.util.Arrays;
public class Bj_arr_namuji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr2=new int[10];
		int count=0;
		for(int i=0; i<10; i++) {
			int A = sc.nextInt();
			arr2[i] = A%42;
		}
		Arrays.sort(arr2);
		
		for(int i =0; i<9; i++ ) {
			if(arr2[i] == arr2[i+1]) {
				count++;
			}
		
		}
		System.out.println(arr2.length-count);
	}
}
