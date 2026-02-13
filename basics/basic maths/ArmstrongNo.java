import java.util.*;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int original=N;
        int sum=0;
        int digits= Integer.toString(N).length();
        while(N>0){
         int digit= N%10;
         sum= sum + (int)Math.pow(digit, digits);   //imp to use(int) here cuz java will throw possible lossy conversion from double to int
         N=N/10;
        }
        if(original==sum){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        
    }
    
}
