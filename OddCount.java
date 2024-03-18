//Printing odd numbers and their count

import java.util.*;
public class OddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter n = ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count of Odd numbers is = "+count);
    }
    
}
