import java.util.ArrayList;

public class Users {
    // User repository
    private ArrayList<IUser> userList;

    // Create new user with type, name and password
    // user created with this method should be automatically added to userList;
    public IUser create(int t, String n, String pass) {
if(t==1){
    Student s=new Student();
    s.setName(n);s.setPassword(pass);s.type=1;
    add(s);
    return s;
}
else if(t==2) {
    Teacher d=new Teacher();
    d.setName(n);d.setPassword(pass);d.type=2;
    add(d);
    return d;
}
System.out.println("type must be 1(student) or 2(teacher)!");
        return null;
    }

    // Add new user to repository
    public void add(IUser user) {
        if(!exists(user)){
userList.add(user);}
else{
    System.out.println(user.getName()+" has already been a user!");
        }
    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user) throws RuntimeException {
        if(exists(user)){
            userList.remove(user);
            }
        else{
            System.out.println(user.getName()+" is not found!");
        }
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
        int found=0;
        for(int i=0;i<userList.size();i++) {
if(userList.get(i).getType()==type){found+=1;}
        }
        return found;
    }
}
