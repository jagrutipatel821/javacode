import java.util.*;
public class Calculater {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int operator = Sc.nextInt();
        Sc.close();
        
        switch(operator) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : if(b == 0) {
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a/b);
                    }
         break;
            case 5 : if(b == 0) {
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a%b);
                    }
         break; 
            default : System.out.println("Invalid Operator");
        }
    }
 }
 
    
