//Printing numbers 1 to 10 except 5 using continue

public class ContinueStat {
    public static void main(String[] args) {
        
        int n=1;
        while(n<=10){

            if(n == 5){
                n++;
                continue;
            }
            System.out.println(n);
            n++;
        }
    }
    
}
