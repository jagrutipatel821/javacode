import java.util.*;
 
public class Arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("the n:- ");
      int n = sc.nextInt();
      System.out.println("the m:- ");
      int m = sc.nextInt();
 
      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               
               matrix[i][j] = sc.nextInt();
           }
      }
      sc.close();
      System.out.println("The transpose is : ");
      //To print transpose
      for(int j=0; j<m ;j++) {
          for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
   }
}
