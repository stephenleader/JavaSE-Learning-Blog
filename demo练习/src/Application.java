import jiCheng.Student;

public class Application {
    public static void main(String[] args){
        Student student = new Student();
        student.say();
        System.out.println(student.money);
        student.test("qingqig");
        student.test1();
    }
}
