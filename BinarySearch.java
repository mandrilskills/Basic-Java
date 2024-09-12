import java.util.*;
public class BinarySearch {
    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in Sorted Order: ");
        for(int i=0; i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int target =sc.nextInt();
        int index = bSearch(a,target);
        if(index!=-1){
            System.out.println("Search Successful. Element found at index - "+index);}
            else{
                System.out.println("Search Unsuccessful!!!");
            }
        
    }
    public static int bSearch(int a[], int target){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<target){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
