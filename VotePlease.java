import java.util.*;
public class VotePlease{
    public static void vote(int age){
        if(age>18){
            System.out.println("please vote, you are eligible to vote");
        }
        else{
            System.out.println("you can't vote, you aren't eligible to vote");
        }
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter the age :- ");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        sc.close();
        vote(age);
    }
}