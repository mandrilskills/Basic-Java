import java.util.*;
public class MatrixAdd {
    public static void main(String[]args){
        int m,n, i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        m=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        System.out.println("Enter elements into the 1st matrix: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements into the 2nd Matrix: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("The addition result of the matrix is: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+b[i][j]+" ");
            }
        }

    }
}
