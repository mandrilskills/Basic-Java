import java.util.*;
public class LeaderArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter the Size of the Array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements into the array:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The Leaders of the Array is:");
        int max = Integer.MIN_VALUE;
        for(i=n-1;i>=0;i--){
            if(a[i]>max){
                System.out.print(a[i]+" ");
                max=a[i];
            }
        }

    }
}
