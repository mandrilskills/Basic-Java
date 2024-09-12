import java.util.*;
public class Average{
    public static void main(String[]args){
        int n, i;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n=scn.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        int sum=0;
        for(i=0;i<n;i++){
            sum=sum+a[i];
        }
        
        double avg=sum/n;
        System.out.println("The sum of the elements in the array is: "+sum);
        System.out.println("The average of the elements in the array is: "+avg);
    }
}