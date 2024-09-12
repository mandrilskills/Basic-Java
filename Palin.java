import java.util.*;
public class Palin {
    public static void main(String[]args){
        int n; int rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        int temp=n
        while(n!=0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(temp==rev)
            System.out.println("The number is Palindrome");
        else
            System.out.println("The number is not Palindrome");
        
    }
}
