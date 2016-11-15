import java.util.ArrayList;

public class Users {

    private ArrayList<IUser> userList;

    public Users() {
        this.userList = new ArrayList<>();
    }

    public IUser create(int type, String name, String password) {
        IUser user = new User(name,password,type);
        if(user.getName() != null && user.getPassword() != null)
            userList.add(user);
        return user;
    }


    public void add(IUser user) {
        userList.add(user);
    }


    public void remove(IUser user) throws RuntimeException {
        if(exists(user))
            userList.remove(user);
        else
            throw new RuntimeException("User is not in the list.");
    }


    public boolean exists(IUser user) {
        return userList.contains(user);
    }


    public int count() {

        return userList.size();
    }


    public int countByType(int type) {
        int n = 0;
        for(IUser i: userList)
        {
            if(i.getType()==type)
                n ++;
        }
        return n;

    }
    public void print()
    {
        for(IUser i: userList)
            System.out.println(i.getName()+ " " + i.getPassword()+" " + (i.getType()==IUser.USER_STUDENT?"student.":"teacher."));
    }
}