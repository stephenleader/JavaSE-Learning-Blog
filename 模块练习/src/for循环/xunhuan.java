package for循环;

public class xunhuan {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50};//定义了一个数组
        //遍历数组的元素
        for ( int i = 0 ; i < 5 ; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("========");
        //从number里面取出赋值给int x，只是简化作用
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
