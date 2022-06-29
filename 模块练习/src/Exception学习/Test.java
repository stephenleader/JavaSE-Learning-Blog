package Exception学习;
//ctrl+alt+t:可以选择包围操作
public class Test {
    public static void main(String[] args) throws Exception {
       /* int a = 1;
        int b = 0;*/
        try {
            new Test().test(1, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test(int a,int b) throws Exception{//用来应对突发状况
        if(b==0){
            throw new ArithmeticException();//主动抛出异常，一般在方法中使用
        }
        System.out.println(a/b);
    }
}


/*
//主动抛出异常
//try监控区域
        try{

                }catch(Error e){//catch(输入想要捕获的类型）捕获异常
                System.out.println("Error");
                }catch(Exception e) {
                System.out.println("Exception");
                }catch(Throwable t){
                System.out.println("Throwable");
                }finally {
                System.out.println("finally");
                }
                //finally可以不要finally，假设IO资源关闭
                }*/