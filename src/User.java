public class User implements IUser {
    private String name;
    private String password;
    private int type;

    User()
    {
        throw new RuntimeException("You have to fill in the username password and type");
    }

    User(String name, String password, int type) {
        setName(name);
        setPassword(password);
        setType(type);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        boolean bool = ifEligible(name);
        this.name = bool?name:this.name;
        if(this.name == null || !bool)
            throw new RuntimeException("Wrong name input");
        return this.name;
    }

    @Override
    public String setPassword(String password) {
        boolean bool = ifEligible(password);
        this.password = bool?password:this.password;
        if(this.password == null || !bool)
            throw new RuntimeException("Wrong password input");
        return this.password;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        return password != null && password.equals(this.password);
    }

    @Override
    public int getType() {
        return type;
    }

    private boolean ifEligible(String str)
    {
        return  !(str.equalsIgnoreCase("") || str == null);
    }

    void setType(int type)
    {
        switch (type)
        {
            case 1:
                this.type = USER_STUDENT;
                break;
            case 2:
                this.type = USER_TEACHER;
                break;
            default:
                System.out.println("Wrong type input");
                throw new RuntimeException();
        }
    }
}
