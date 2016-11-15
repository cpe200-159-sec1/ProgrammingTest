import java.util.ArrayList;

public class Users {
    // User repository
    private ArrayList<IUser> userList;

    // Create new user with type, name and password
    // user created with this method should be automatically added to userList;
    public IUser create(int type, String name, String password) {
        User Tempuser = new User();
        Tempuser.setName(name);
        Tempuser.setPassword(password);
        Tempuser.setType(type);

        userList.add(Tempuser);


        return null;
    }

    // Add new user to repository
    public void add(IUser user) {

        userList.add(user);

    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user) throws RuntimeException {

        if(!(userList.remove(user)))
            throw new RuntimeException("this user is not on the list");

    }

    // Return true if the user is in the list
    public boolean exists(IUser user) {

        return userList.contains(user);

    }

    // Return number of user in the list
    public int count() {

        return userList.size();

    }

    // Return number of user in the list, according to type
    public int countByType(int type) {
        for(int typenum: userList){
            if
        }

        return 0;
    }
}
