package fuction;
public class Bj_function_selfnum {

	public static void main(String[] args) {
		int[] arr = new int[10001];
		for(int i=1; i<arr.length; i++) {
			int A = d(i);
			if(A<=10000) {
				arr[A]=1;
			}
		}
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=1) {
				System.out.println(i);
			}
		}
	}
	public static int d(int num) {
		int result=num;
		while(num>0) {
			result =result+ num%10;
			num = num/10;
		}
		return result;								
	}
}