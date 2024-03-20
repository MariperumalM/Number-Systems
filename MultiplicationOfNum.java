//Printing product of n numbers

import java.util.*;
public class MultiplicationOfNum{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        int product = 1;

        for(int i=1; i<=n; i++){
            product = product*i;
        }
        System.out.println("Product of "+n+" numbers is "+product);
    }
}