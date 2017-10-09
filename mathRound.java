import java.util.Scanner;

public class mathRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
            double x = sc.nextDouble();
            long result = Math.round(x);
            System.out.println("The rounded number is " + result);
    }
}
