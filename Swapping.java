public class Swapping {
    public static void main(String[] args) {
        
        int a = 5, b = 7, temp;

        System.out.println("Before swapping a = "+a+" b = "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping a = "+a+" b = "+b);
    }
    
}
