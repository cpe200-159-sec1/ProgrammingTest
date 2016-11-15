public class User implements IUser {
    public String name,password;
    public int type;
    public User(){}
    public User(String n,String p,int t){
        name=(n.equals(""))?"Anonymous":n;
        password=setPassword(p);
        type=t;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String n) {name=(n.equals(""))?"Anonymous":n;
        return name;
    }

    @Override
    public String setPassword(String p) {
        if(p.length()>=8){
            password=p;
        return p;
    }
    p="mypassword";
    System.out.println("Password must be 8 characters or longer ");
        System.out.println("your password is automatically set to \"mypassword\"");
    return "mypassword";
    }

    @Override
    public boolean isPasswordCorrect(String p) {
        return p.equals(this.password);
    }

    @Override
    public int getType() {
        return type;
    }
}
