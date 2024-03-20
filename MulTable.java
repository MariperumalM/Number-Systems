//Printing a multiplication table

import java.util.*;
public class MulTable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value = ");
        int n = sc.nextInt();
        int product;

        System.out.println("Printing "+n+" Table");
        for(int i=1;i<=10; i++){
            product = n*i;
            System.out.println(i+" * "+n+" = "+product);
        }
    }
    
}
