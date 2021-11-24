import java.util.*;
public class EvenOrNot{
    public static void numberIsEvenOrNot (int n){
        if(n%2==0){
            System.out.println("This number is Even :- "+n );

        }
        else{
            System.out.println("This number is not Even :- "+n);
        }
        return;
        
    }
    public static void main(String[] args) {
        System.out.print("check here for number is Even or not :-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberIsEvenOrNot(n);
        
    }
}