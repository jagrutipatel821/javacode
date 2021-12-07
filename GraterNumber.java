import java.util.Scanner;

public class GraterNumber {
    public static void whichIsGrater(int a, int b){
        if(a>b){
            System.out.println("a is Grater than b :- "+ a);
        }
        else if(b>a){
            System.out.println("b is Grater than a :- "+b);

        }
        else{
            System.out.println("a is equal to b ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the numbers a and b:- ");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        sc.close();
        whichIsGrater(a, b);

    }
    
}
