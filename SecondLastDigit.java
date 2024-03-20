//Printing second last digit of a given number

public class SecondLastDigit {
    
    public static void main(String[] args) {
        int n = 1234;
        int num = n%100;
        int ld = num/10;
        System.out.println(ld);
}
}