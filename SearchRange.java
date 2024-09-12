import java.util.*;
public class SearchRange{
    public static void main(String[] args){
        int n, key=0;
        
        System.out.println("Enter the limit of the array:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Starting Range: ");
        int start = sc.nextInt();
        System.out.println("Enter the Ending Range: ");
        int end = sc.nextInt();
        System.out.println("Enter the element to be searched for: ");
        int target=sc.nextInt();
        for(int i=start;i<=end;i++){
            int element = a[i];
            if(element==target){
                key=-1;
            }
        }
        for(int i=start;i<=end;i++){
            if(key==-1){
                System.out.println("Element found at index: " +i);
            }
            else{
                System.out.println("Element not found within the range");
            }
        }
        
    }
}