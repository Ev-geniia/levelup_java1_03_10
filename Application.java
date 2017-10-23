package hometask;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        InMemoryUserStorage storage = new InMemoryUserStorage ();
        PermissionService permission = new PermissionService(storage);
        LocalStorage authUsersStorage = LocalStorage.createLocalStorage();

        System.out.println(storage);

        storage.addUser("Ivan", "Ivanov", "password1");
        storage.addUser("Ivan", "Ivanov", "password2");
        storage.addUser("Ivan", "Ivanov", "password3");
        storage.addUser("Petr", "Petrov", "password4");
        storage.addUser("Petr", "Petrov", "password5");
        storage.addUser("Sergey", "Sergeyev", "password6");
        storage.addUser("Sergey", "Sergeyev", "password7");
        storage.addUser("Sergey", "Sergeyev", "password8");
        storage.addUser("Alexey", "Alexeyev", "password9");
        storage.addUser("Alexey", "Alexeyev", "password10");
        System.out.println(storage);

        User [] usersList =  storage.getUsers();
        storage.removeUser(usersList[0].getLogin());
        System.out.println(storage);

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your login");
        String login = sc.nextLine();
        System.out.println("'" + login + "'");
        System.out.println("Please enter your password");
        String password = sc.nextLine();
        System.out.println("'" + password + "'");

        boolean auth = permission.Authenticate(login, password);
        System.out.println(auth);
        if (auth == true){
            User authUser = storage.findByLogin(login);
            authUsersStorage.StoreUser(authUser);
            System.out.println("User successfully logged in: " + authUser);
        } else {
            System.out.println("Wrong data entered");
        }

    }
}
