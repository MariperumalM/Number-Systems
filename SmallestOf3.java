import java.util.*;

public class SmallestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();

        if(a<b && a<c){
            System.out.println("Smallest number is a = "+a);
        }
        else if(b<a && b<c){
            System.out.println("Smallest number is b = "+b);
        }
        else{
            System.out.println("Smallest number is c = "+c);
        }
    }
}
