package jiCheng;

//xuesheng is ren
//子类可以继承父类的所有方法
public class Student extends Person {

   public void go(){
       System.out.println("gogogog@!!");
   }



    //无参数形式
    public Student(){
        //隐藏代码，调用了父类的无参构造
        super("name");
        //super调佣父类的构造器，必须要在子类的构造器的第一行


        System.out.println("Student无参数执行了");
    }
 //学生继承了父类，在调用的时候就可以调用全部的父类温度方法



    private String name = "qinjiang";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }



    public void run(){
        System.out.println("son...");
    }

    public void eat(){
        System.out.println("ear..");
    }

}
