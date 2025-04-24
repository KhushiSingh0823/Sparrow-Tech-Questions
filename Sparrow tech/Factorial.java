import java.util.*;
public class Factorial {
    public static int calFactorial(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        int fact = n* calFactorial(n-1);
        return fact;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        
        int n = sc.nextInt();
        System.out.println(calFactorial(n));
    }
}
