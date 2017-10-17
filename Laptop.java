public class Laptop {
    private double price;
    private double weight;

    //constructor with params
    public Laptop(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }
    //constructor without params
    Laptop() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }



    //
//    @Override
//    public String toString() {
//        return  "Laptop characteristics: price = " + getPrice() +" weight = " + getWeight();
//    }
}
