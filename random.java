import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random r = new Random();
        int a [] = new int [10];
        for (int i=0;i<a.length;i++)
        {
            a[i] = r.nextInt(1500);
        }
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        int max = a[0];
        for (int i=1; i<a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.println("Max = " + max);
        int min = a[0];
        for (int i=1; i<a.length; i++) {
            if (a[i]<min) {
                min=a[i];
            }
        }
        System.out.println("Min = " + min);
    }
}

