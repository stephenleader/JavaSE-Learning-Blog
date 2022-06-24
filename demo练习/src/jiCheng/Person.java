package jiCheng;
//ren
/**
 * 作为父类
 */

public class Person {
    public Person(String name){
        System.out.println("Person无参数执行了");
    }
    public int money = 10_0000_0000;
    protected String name = "狂神";
    public void print(){
        System.out.println("Person is here!");
    }
    public void say(){
        System.out.println("hello");
    }

}
