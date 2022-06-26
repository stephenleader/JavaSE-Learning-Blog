package chongXie;
//本类继承父类
public class A extends B{

    //Override重写,要求继承的父类必须是非静态的，才可以进行重写
    @Override
    public void test(){
        System.out.println("A->test");
    }
}
