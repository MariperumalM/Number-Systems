//Printing multiples of 3 from 1 to 100

public class MultiplesOf3 {
    
    public static void main(String[] args) {
        int n=1;
        while(n<=100){
            if(n%3 == 0){
                System.out.println(n);
            }
            n++;
        }
    }
}
