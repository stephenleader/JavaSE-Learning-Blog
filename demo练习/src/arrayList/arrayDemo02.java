package arrayList;

import java.util.Arrays;

public class arrayDemo02 {
    public static void main(String[] args){
        int[] array = {1,22,333,444};
        //打印数组

        System.out.println(array);
        System.out.println(Arrays.toString(array));

    }
    public void printArray(int[] a){
        for (int i = 0 ; i < a.length ; i++){
            if(i==0){
                System.out.println("[");
            }
            if(i == a.length){
                System.out.println(a[i]+",");
            }
        }
    }
}
