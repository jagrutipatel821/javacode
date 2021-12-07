import java.util.*;
public class HelloName {
    public static void main(String[] args) {
        System.out.print("Enter the name:-");
        Scanner Sc = new Scanner(System.in);
        String name = Sc.nextLine();
        Sc.close();
        System.out.print("Hello ");
        System.out.println(name);
    }
    
}
