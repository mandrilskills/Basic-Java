
public class LinearSearch{
    public static void main(String[] args) {
        int num[] = {23, 45,1,2,8,10,9,-11,10};
        int target = 9;
        int ans=linearSearch(num, target);
        System.out.println("Element found at:" +ans);
    }
    static int linearSearch(int a[], int target){
        if(a.length == 0){
            return -1;
        }
        //run a for loop
        for(int i=0; i<a.length; i++){
            int element = a[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}