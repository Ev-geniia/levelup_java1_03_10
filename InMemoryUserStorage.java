package hometask;


import java.util.Arrays;

public class InMemoryUserStorage extends AbstractUserStorage {

    final int UsersCount = 10;
    final int initialUserId = 1;

    private User [] users;
    private int nexUserId;


    public InMemoryUserStorage () {
        users = new User[UsersCount];
        nexUserId = initialUserId;
    }

    private String generateLogin (String name, String lastName) {
        String first3LettersName = name.substring(0,3);
        String first3LettersLastName = lastName.substring(0,3);

        String login = first3LettersName + first3LettersLastName;
        User searchUser = findByLogin(login);
        if (searchUser == null) {
            return login;
        }
        else {
            String loginWithoutLastLetter = login.substring(0,login.length()-1);
            int endDigit = 1;
            String newLogin = loginWithoutLastLetter + endDigit;
            while (findByLogin(newLogin) != null) {
                endDigit++;
                newLogin = loginWithoutLastLetter + endDigit;
            }
            return newLogin;
        }

    }

    @Override
    public String toString() {
        return "InMemoryUserStorage{" +
                "users=" + Arrays.toString(users) +
                ", nexUserId=" + nexUserId +
                '}';
    }

    @Override
    public User [] getUsers() {
        return users;
    }

    @Override
    public void removeUser(String login) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin() == login) {
                users[i] = null;
            }
        }

    }

    @Override
    public void addUser(String name, String lastName, String password) {
        String login = generateLogin(name, lastName);
        User newUser = new User (login, name, lastName, password, nexUserId);
        int i = getIndexFreeSpace();
        users[i] = newUser;
        nexUserId++;
    }

    private int getIndexFreeSpace () {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
