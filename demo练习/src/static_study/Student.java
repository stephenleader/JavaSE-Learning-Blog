package static_study;
//static

//静态导入包
import static java.lang.Math.random;


public class Student {
    private static int age;//加了static为静态变量
    private double score;

    public void run(){

    }
    public static void go(){

    }
    public static void main(String[] args){
        Student student = new Student();

       //定义了static静态的变量，可以通过类来调用与此类相关的变量
        System.out.println(Student.age);
        //System.out.println(Student.score);

        //但如果是封装的类的话，则不管用不用static，都可以调用
        System.out.println(student.age);
        System.out.println(student.score);

        //非静态的方法，必须要封装了new才可以调用
        new Student().run();

        //而静态的方法，不要new
        /*
        void main非静态方法可以去调用静态方法中的变量
        而static void main静态方法不能去调用非静态的方法
         */
        go();
        System.out.println(Math.random());
    }
}
