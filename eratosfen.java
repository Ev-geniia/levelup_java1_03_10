public class eratosfen {
    public static void main(String[] args) {
        int a = 2;
        int b = 10000;
        int sqrt = (int) Math.sqrt(b);
        boolean [] ar = new boolean [b+1];
        System.out.println("The prime numbers are:");
        for (int i = 2; i<=b; i++) {
            ar[i]=true;
        }
        for(int k=2; k<=sqrt; k++) {
            if (ar[k]==true){
                int currentNum=k;
                for (int l=currentNum*2; l<=b; l+=currentNum) {
                    ar[l]=false;
                }
            }
        }
        for(int i=a; i<=b; i++) {
            if (ar[i]==true) {
                System.out.println(i);
            }
        }
    }
}
