//Printing Even numbers and their count
import java.util.Scanner;

public class EvenCount {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter n = ");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            if(i%2 == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count of Even numbers is = "+count);
    }
    
}
