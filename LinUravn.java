import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class LinUravn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        double a=sc.nextDouble();
        System.out.println("Enter b");
        double b=sc.nextDouble();
        double x=-b/a;
        System.out.println("x=" + x);

    }
}
