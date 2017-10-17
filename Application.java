
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        Laptop[] laptops = new Laptop[5];
        laptops[0] = new Laptop(123.5, 2.0);
        laptops[1] = new Laptop(250.85, 1.75);
        laptops[2] = new Laptop(999.99, 1.5);
        laptops[3] = new Laptop(749.99, 2.5);
        laptops[4] = new Laptop(500.75, 3.3);

        User[] users = new User[5];
        users[0] = new User("Friedrich", "Nietzsche");
        users[1] = new User("Sigmund", "Freud");
        users[2] = new User("Immanuel", "Kant");
        users[3] = new User("Karl", "Marx");
        users[4] = new User("Martin", "Heidegger");

        System.out.println("Before sorting:");

        for (int i = 0; i < laptops.length; i++) {
            System.out.println(laptops[i]);
        }
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        Arrays.sort(laptops, (o1, o2) -> {
                    double p1 = o1.getPrice();
                    double p2 = o2.getPrice();

                    int compare = Double.compare(p1, p2);
                    return compare;
                }
        );

        System.out.println("After sorting:");

        for (int i = 0; i < laptops.length; i++) {
            System.out.println(laptops[i]);
        }


    }

}
