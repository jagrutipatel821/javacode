import java.util.*;
public class prime{
    public static void primeNumber(int a)  {
        boolean isprime =true;
        for(int i=2; i<a/2; i++){
            if(a%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println("this number is prime:- "+a);

        }
        else{
            System.out.println("this number is not a prime:- "+a);
        }

        return;    
            
        }
    public static void main(String[] args) {
        System.out.print("check here a number is prime or not:- ");
        Scanner Sc = new Scanner(System.in);
        int a=Sc.nextInt();
        primeNumber(a);
    }
     
}