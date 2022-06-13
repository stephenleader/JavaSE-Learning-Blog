package struct;

public class test07 {
    //修饰符-返回类型-方法名
    public static void main(String[] args){
        float max = max(67,67);
        System.out.println(max);
    }

    //比较大小
    public static float max(int num1,int num2){
        int result = 0;
        if(num1>num2){
            result = num1;
        }
        if(num1==num2){
            System.out.println("num1==num2");
            result = num1;
            return 0;
        }
        if(num1<num2){
            result = num2;
        }
        return result;
    }
}
