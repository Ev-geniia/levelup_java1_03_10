public class User {
    private String name;
    private String lastName;

    //constructor with params
    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    //constructor without params
    User () {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
