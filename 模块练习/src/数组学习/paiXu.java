package 数组学习;

import java.util.Arrays;

//冒泡排序,时间复杂度n^2
public class paiXu {
    public static void main(String[] args){
    int[] a = {1,4,5,6,7,75,23};
    int[] sort = sort(a);
    System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] array){
        int temp = 0;
        for (int i = 0 ; i < array.length-1 ; i++){
            boolean flag = false;
            //内层循环，比较判断两个数
            for(int j = 0 ; j < array.length-1-i ; j++){
                if(array[j+1] > array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }


        }
        return array;
    }

}
