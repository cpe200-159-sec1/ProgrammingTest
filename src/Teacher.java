import javax.swing.plaf.basic.BasicTreeUI;

public class Teacher extends User {
    Teacher()
    {
        this("Anonymous", "password", USER_TEACHER);
        throw new RuntimeException("You have to fill in the username password and type\n" +
                "Now you're forced to use our default settings");
    }

    Teacher(String name, String password, int type)
    {
        super(name, password, type);
        if(type != USER_TEACHER)
            throw new RuntimeException("Wrong type");
    }
}
