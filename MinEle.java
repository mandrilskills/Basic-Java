public class MinEle {
    public static void main(String[] args) {
        int a[] = {6,8,9,10,12,13,15,16,0,1,-1};
        System.out.println("The minimum element of the array is: "+ min(a));
    }
    static int min(int a[]){
        int ans = 0;
        for (int i=1;i<a.length; i++){
            if(a[i]<ans){
                ans=a[i];
            }
        }
        return ans;
    }
    
}
