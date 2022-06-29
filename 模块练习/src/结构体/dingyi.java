package 结构体;

public class dingyi {
    //前面两个是修饰符，后面一个是返回值void
    public static void main(String[] args){
        int sum = add(1,2);
        System.out.println(sum);
    }

    //加法,加了static才能变成一类
    public static int add(int a,int b){
        return a+b;
    }


}
