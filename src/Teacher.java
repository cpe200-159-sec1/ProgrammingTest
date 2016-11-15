public class Teacher extends User {
    public Teacher (String name ,String password)
    {
        super.setName(name);
        super.setPassword(password);
        super.setType(USER_TEACHER);
    }
}
