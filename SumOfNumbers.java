//Printing Sum of Numbers

import java.util.*;
public class SumOfNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value = ");
        int n = sc.nextInt();

        int sum = n*(n+1)/2;
        System.out.println("Sum of "+n+" numbers is = "+sum);
    }
    
}
