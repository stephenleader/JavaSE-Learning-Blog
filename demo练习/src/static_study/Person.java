package static_study;

public class Person {
    //2
    {
        //匿名代码块，在程序执行的时候，程序不会主动去调用这个方法
        //这个模块在构建代码的时候就自动建好了
        System.out.println("hello ,this is no-name block!");
    }

    //1:只执行一次
    static {
        //静态代码块，程序会在这里经过
        System.out.println("this is static coding block");
    }

    //3
    public Person(){
        System.out.println("构造方法");
    }
    public static void main(String[] args){
        Person person = new Person();
    }
}
