public class Student extends User {
    public Student (String name ,String password)
    {
        super.setName(name);
        super.setPassword(password);
        super.setType(USER_STUDENT);
    }

}
