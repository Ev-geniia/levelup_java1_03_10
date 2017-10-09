public class primeNumbers {
    public static void main(String[] args) {
       int a = 2;
       int b = 10000;
        System.out.println("The prime numbers are: ");
       for (int i=a; i<=b; i++) {
           int currentNumber = i;
           boolean isPrime = true;
           int sqrt = (int) Math.sqrt(currentNumber);
           for (int n=2; n<=sqrt; n++) {
               if (currentNumber%n==0) {
                   isPrime=false;
               }
           }
           if (isPrime==true)
           {
               System.out.println(currentNumber);
           }
       }
    }
}
