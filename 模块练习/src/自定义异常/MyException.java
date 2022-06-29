package 自定义异常;

//一旦继承了exception了，就意思为自定义的异常类了
public class MyException extends Exception{

    private int detail;

    public MyException(int a){
        this.detail = a;
    }
    //toString异常的打印信息
    @Override
    public String toString(){
        return "MyException{" + "detail=" + detail + "}";
    }

}
