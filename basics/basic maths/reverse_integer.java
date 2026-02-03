import java.util.*;
public class reverse_integer{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0;
        while(n!=0) {
            int digits= n%10;
            n=n/10;
            //for detecting overflow above 32-bit integers....
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                System.out.println(0);
            }
            rev= rev*10 + digits;
            

            
        }
        System.out.println(rev);

    }
}