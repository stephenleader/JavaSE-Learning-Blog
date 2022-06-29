package 内部类的学习;

public class Outer {
    private int id;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    public class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }
    }

    public void getID(){
        System.out.println(id);
    }
    //内部类的另一种写法
    //一个Java类中可以有多个class类，但是只能有一个public class
    class A{

    }


    //这是一个局部内部类
    public void method(){
        class Inner{
            public void in(){

            }
        }
    }

}
