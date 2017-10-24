package hometask;

public abstract class AbstractUserStorage implements UserStorage {

    @Override
    public User findByLogin (String login) {

        User [] users = getUsers();

        for (User savedUser : users) {
            if (savedUser != null && savedUser.getLogin().equals(login)) {
                    return savedUser;
            }
        }
        return null; // stub
    }

    @Override
    public User findByNameAndLastName (String name, String lastName) {
        User [] users = this.getUsers();
        for (User user : users) {
            if (user.getName().equals (name) && user.getLastName().equals (lastName)) {
                return user;
            }
        }

        return null; //stub
    }
}
