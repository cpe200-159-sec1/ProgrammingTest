import java.util.ArrayList;

public class Users {
    // User repository
    private ArrayList<IUser> userList = new ArrayList<>();

    // Create new user with type, name and password
    // user created with this method should be automatically added to userList;
    public IUser create(int type, String name, String password) {
        IUser tmp = new User();

        tmp.setName(name);
        tmp.setPassword(password);
        tmp.setType(type);

        userList.add(tmp);
        return tmp;
    }

    // Add new user to repository
    public void add(IUser user) {
        userList.add(user);
    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user) throws RuntimeException {
        if (!userList.remove(user))
            throw new RuntimeException("Don't Found");
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
        int count = 0;
        for (IUser i : userList)
            if (i.getType() == type)
                count++;

        return count;
    }
}
