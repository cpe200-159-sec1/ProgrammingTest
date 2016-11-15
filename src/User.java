public class User implements IUser {
    private String name;
    private String password;
    private String rex = "[A-Za-z][A-Za-z0-9]{7,}";
    private int type;

    public User(String name, String password, int type) {
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
        if (name != null) {
            if (name.matches(rex)) {
                this.name = name;
                return name;
            }
        } else {
            System.out.println("Invalid name.");

        }
        return null;
    }

    @Override
    public String setPassword(String password) {
        if (password != null) {
            if (isPasswordCorrect(password)) {
                this.password = password;
                return password;
            }
        } else {
            System.out.println("Invalid Password.");
        }
        return null;
    }

    @Override
    public boolean isPasswordCorrect(String password) {

        return password.matches(rex);
    }

    @Override
    public int getType() {
        return type;
    }

    public String getPassword() {
        return password;
    }

    public void setType(int type) {
        if (type == 1 || type == 2)
            this.type = type;
    }
}