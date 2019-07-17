package Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 张铠建
 * @description 数组扩容
 * @createdate 2019-05-29 13:02
 **/
public class TestOpArray {
    public static void main(String[] args) {
        //解决数组不可变的问题
        int[] arr = new int[] {9,8,7};
        //快速查看数组中的元素
        System.out.println(Arrays.toString(arr));
        //要加入数组的元素
        int dst = 6;

        int[] newArr = new int[arr.length+1];
        for (int i = 0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        newArr[arr.length]=dst;
        System.out.println(Arrays.toString(newArr));
        arr=newArr;
        System.out.println(Arrays.toString(arr));
    }
}
