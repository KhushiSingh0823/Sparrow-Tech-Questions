import java.util.*;
public class StrLenght {

    public static int calLength(String str){
        int count =0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");

        String str = sc.next();
        System.out.println(calLength(str));
    }
}
