import java.util.*;

public class PalindromeStr{
    public static boolean PalindromeStr(String s) {
        int n = s.length();
        for(int i=0; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String?");

        String s = sc.next();
        System.out.println(PalindromeStr(s));
    }
}
