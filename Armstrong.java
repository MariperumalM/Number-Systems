public class Armstrong {
    public static void main(String[] args) {
        
        int num = 371;
        int original=num, rem, result=0;

        while(original != 0){
            rem = original%10;
            result = Math.pow(rem,3);
            original /= 10;
        }

        if(result == num)
            System.out.println("Its a armstrong");
        else
            System.out.println("Not a armstrong");

    }
    
}
