public class User implements IUser {
    private static String name;
    private static String password;
    public static int type;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        if (name != null) {
            this.name = name;
            return name;
        }
        throw new RuntimeException();
    }

    @Override
    public String setPassword(String password) {
        if (password != null) {
            this.password = password;
            return password;
        }
        throw new RuntimeException();
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if (this.password == password) return true;
        else return false;
    }

    @Override
    public int getType() {
        if (type == 1 || type == 2)
            return type;
        else throw new RuntimeException();
    }
}