import java.util.*;
public class EvenIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the elements into the array:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The Even elements at Even Index (Counted from 0) are:");
        for(i=0;i<n;i++){
            if(i%2==0 && a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }

    }
}