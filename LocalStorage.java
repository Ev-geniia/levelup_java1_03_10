package hometask;

public class LocalStorage {

    private User loggedUser;

    private LocalStorage() {
    }

    public static LocalStorage createLocalStorage() {
        LocalStorage localStorage = new LocalStorage();
        return localStorage;
    }

    public void StoreUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }
}
