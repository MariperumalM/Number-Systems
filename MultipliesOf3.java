public class MultipliesOf3 {
    public static void main(String[] args) {
        int n=1;
        
        while(n<=100){
            if(n%2 == 0 && n%3 == 0){
                System.out.println(n);
            }
            n++;
        }
    }
    
}
