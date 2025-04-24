import java.util.*;
public class Append {

    public static void AppendStr(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        //new array to store the result

        char result[] = new char[ch1.length+ ch2.length];
        
        for(int i=0; i<ch1.length; i++){
            result[i]= ch1[i];
        }

        for(int i=0; i<ch2.length;i++){
            result[ch1.length + i]= ch2[i];
        }

        System.out.print("Appended String: ");

        /* char c → This declares a variable c of type char to hold each element from the array.

          : result → This means we are looping through the array named result.

          Inside the loop: System.out.print(c); → This prints each character one by one without a newline. */

        for(char c: result){
            System.out.print(c);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str1 = sc.next();

        System.out.print("Enter String 2: ");
        String str2 = sc.next();

        AppendStr(str1, str2);
    }
}
