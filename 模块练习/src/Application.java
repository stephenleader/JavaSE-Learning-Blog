import 重写.A;
import 重写.B;
import 继承.Person;
import 继承.Student;

public class Application {
    //静态static，指向父类，
    public static void main(String[] args){
        A a = new A();
        a.test();//此处引用了B中的test

        //父类的引用指向了子类
        B b = new A();
        b.test();//B

        //可以指向的引用类型就不确定了，父类的引用指向子类
        //这种
        Student s1 = new Student();
        Person s2 = new Student();
        Object s3 = new Student();
        /*
        方法的调用只和左边，定义的数据类型有关
         */

        //@Override重写了才可以用该子类的方法，不然不可以使用该子类下的方法

        //类型之间转换，低转高不需要墙砖，高转低需要强转
        Person student = new Student();
        ((Student) student).go();
        Student student2 = new Student();
        student2.go();
    }
}
