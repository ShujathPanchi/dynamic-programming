import java.util.Scanner;

public class DivisorSum {
    public int divisor_sum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                sum+= i;
            }
        }
        return sum;
    }
}
