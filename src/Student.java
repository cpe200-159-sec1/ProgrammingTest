public class Student extends User {
    Student()
    {
        this("Anonymous", "password", USER_STUDENT);
        throw new RuntimeException("You have to fill in the username password and type\n" +
                "Now you're forced to use our default settings");
    }

    Student(String name, String password, int type)
    {
        super(name, password, type);
        if(type != USER_STUDENT)
            throw new RuntimeException("Wrong type");
    }
}
