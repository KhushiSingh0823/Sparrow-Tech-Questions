import java.util.*;
public class Duplicate {

    public static int DuplicateStr(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        System.out.print("Enter the Sorted elements of Array: ");

        int arr[] = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
         }

        System.out.println(DuplicateStr(arr));
        
    }
}
