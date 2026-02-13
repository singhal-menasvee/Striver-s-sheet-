import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N1= sc.nextInt();
        int N2=sc.nextInt();

        int gcd=1;
        int min= Math.min(N1, N2);
        for(int i=1;i<=min;i++){
            if(N1%i==0 && N2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);

        
    }
}
