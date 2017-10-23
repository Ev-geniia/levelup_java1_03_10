package hometask;

public interface UserStorage {

    //the whole block cut and pasted from hometask.AbstractUserStorage, "public abstract" wording deleted as redundant
    User findByLogin (String login);
    User findByNameAndLastName (String name, String lastName);
    User [] getUsers (); //wasn't in hometask, returns user
    void removeUser(String login);
    void addUser (String name, String lastName, String password);

}
