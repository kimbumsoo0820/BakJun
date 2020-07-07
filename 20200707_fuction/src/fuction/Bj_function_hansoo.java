package fuction;
import java.util.Scanner;
public class Bj_function_hansoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int[] arr = new int[3];
		int count=0;
		for(int i=1; i<A+1; i++) {
			if(i>0 && i<100) {
				count = i;
			}
			else if(i==1000){
				break;
			}
			else {
				int j=0, result=i;
				while(result>0) {
					arr[j]=result%10;
					result /=10;
					j++;
				}
				if(arr[1]-arr[0]==arr[2]-arr[1]) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();		
	}	
}


