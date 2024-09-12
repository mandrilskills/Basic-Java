import java.util.*;
public class ReverseArray {
    public static void main(String[]args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the number of elements into the array: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("The array is:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("The array in reversed order:");
        for(i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        
    }
}
