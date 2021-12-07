import java.util.*;
public class Average{
    public static void calculateAverage(int a, int b, int c){
        System.out.println("Average:-"+(a+b+c)/3);
        return ;

    }
    public static void main(String[] args) {
        System.out.print("Enter a 3 number here to find there Average :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        calculateAverage(a, b, c); 
        
    }
}