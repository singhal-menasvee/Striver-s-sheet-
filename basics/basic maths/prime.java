import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        
        int count=2;
        for(int i=2;i<N;i++){
            if(N%i==0){
                count++;
            }
        }
        if(count>2){
           System.out.println(false);
        }
        else{
            System.out.println(true);

        }

    }
    
    
}
