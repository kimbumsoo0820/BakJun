package arr;
import java.util.Scanner;
public class Bj_arr_countnum {

    public static void main(String[] args) {
        Scanner stin = new Scanner(System.in);

        int a= stin.nextInt();
        int b= stin.nextInt();
        int c= stin.nextInt();
        int d= a*b*c;
        int e=0;
        int cnt=0;

        int length1 = (int)(Math.log10(d)+1);

        int [] arr1 = new int[length1] ;

        for(int i =arr1.length-1; i>=0; i--)
        {

            arr1[i] = d%10;
            d = d/10;

        }
        for(int i =0; i<10; i++)
        {
            cnt=0;
            for(int j=0; j<arr1.length; j++)
            {

                if(arr1[j] == i)
                    cnt++;
            }
            System.out.println(cnt);
        }


    }

}


