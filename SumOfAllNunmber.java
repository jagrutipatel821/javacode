import java.util.*;
public class SumOfAllNunmber {
    public static void sumOfAllOddNumber(int n){
        int count=1;
        for (int i=1; i<=n; i++){
            if(n%2!=0){
                count=count+1;
                
            }
        
        }
        
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        sumOfAllOddNumber(n);
    }
    
}
