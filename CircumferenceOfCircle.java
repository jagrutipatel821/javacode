import java.util.Scanner;
public class CircumferenceOfCircle{


    public static void printTheCircumferenceOfCircle(int radius){
        double c = (2*Math.PI*radius);
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        System.out.print("Enter the radius :- ");
        Scanner sc= new Scanner(System.in);
        int radius= sc.nextInt();
        sc.close();
        
        printTheCircumferenceOfCircle(radius);
    }
}