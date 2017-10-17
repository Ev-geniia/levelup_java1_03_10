public class cyclesHelloWorld {
    public static void main(String[] args) {
        for (int index = 0; index < 5; index++) {
            System.out.println("Hello World");
        }
        int x = 250;
        int y = 5;
        while (x>y) {
            x/=y;
            System.out.println("another \"Hello World\"");
        }
        int z = 12;
        do {
            System.out.println("\"Hello World\" again");
                    z--;
        } while (z>=8);
    }
}
