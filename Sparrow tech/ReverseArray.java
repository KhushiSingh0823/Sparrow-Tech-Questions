import java.util.*;
public class ReverseArray {
    public static void calcRev(int arr[]){
        int n = arr.length;
        /*int revArr[] = new int[n];
        for(int i = 0; i < n; i++){
            revArr[i] = arr[n - 1 - i]; 
        }
        for(int i = 0; i < n; i++){
            arr[i] = revArr[i]; 
        }*/

        int left = 0, right = n-1;
        while(left< right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++ ;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of elements of Array: ");
         
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter elements of Array: ");

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Reverse Array: ");
        calcRev(arr); 
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
