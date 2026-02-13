import java.util.*;
public class Divisors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        ArrayList<Integer> divisors= new ArrayList<>();

        for(int i=1;i<=N;i++){
            if(N%i==0){
                divisors.add(i);
            }
        }
        System.out.println(divisors);

    
        
    }
    
}
