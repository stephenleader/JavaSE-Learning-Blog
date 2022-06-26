import chongXie.A;
import chongXie.B;
import jiCheng.Student;

public class Application {
    //静态static，指向父类，
    public static void main(String[] args){
        A a = new A();
        a.test();//此处引用了B中的test

        //父类的引用指向了子类
        B b = new A();
        b.test();//B


        /*
        方法的调用只和左边，定义的数据类型有关
         */

    }
}
