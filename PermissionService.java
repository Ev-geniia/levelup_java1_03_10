package hometask;

public class PermissionService {

    private AbstractUserStorage userStorage;

    public PermissionService (AbstractUserStorage storage) {
        this.userStorage = storage;
    }
//
//    public boolean Authenticate (User user) {
//        String checkLogin = user.getLogin();
//        User storedUser = userStorage.findByLogin(checkLogin);
//        if (storedUser != null && storedUser.getPassword().equals(user.getPassword())) {
//                return true;
//        } else {
//            return false;
//        }
//
//    }

    public boolean Authenticate (String login, String password) {
        User storedUser = userStorage.findByLogin(login);
        if (storedUser != null && storedUser.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
