import jiCheng.Person;
import jiCheng.Student;
import jiCheng.Teacher;
//Object >> String

//Object >> Person !> Teacher

//Object >> Person >> Student
public class Application2 {
    public static void main(String[] args){
        Object object = new Student();
        //instanceof用于判断类与类之间是否相似，是否属于父子关系
        System.out.println(object instanceof Student);//
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof Teacher);//Teacher和student没有任何关系
        System.out.println(object instanceof String);
        System.out.println("====================");
        Person person = new Student();
        System.out.println(person instanceof Student);//有关系，因改为true
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);
//        System.out.println(person instanceof Teacher);//Teacher和student没有任何关系
//        System.out.println(person instanceof String);
        /*
        person和teacher没有任何关系
         */
    }
}
