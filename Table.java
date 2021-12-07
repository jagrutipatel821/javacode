import java.util.*;
public class Table {
    public static void numberFunctionTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
        return;
    }
    public static void main(String[] args) {
        System.out.print("enter the nubmer which you want the print table:- ");
        Scanner Sc = new  Scanner(System.in);
        int n=Sc.nextInt();
        Sc.close();
        numberFunctionTable(n);
    }
}
