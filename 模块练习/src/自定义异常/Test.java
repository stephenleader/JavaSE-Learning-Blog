package 自定义异常;

public class Test {

    //可能会存在异常的方法
    //再throw exception抛出，在外面捕获try，catch
    static void test(int a) throws MyException {
        System.out.println("传递的参数为a="+a);
        if(a>10){
            throw new MyException(a);
        }
        System.out.println("OK");
    }
    public static void main(String[] args){
        try {
            test(11);
        } catch (MyException e) {
            System.out.println("MyException = > " + e);
        }
    }
}
