package Test;

import java.util.Arrays;

/**
 * @author 张铠建
 * @description 冒泡排序
 * @createdate 2019-05-29 13:11
 **/
public class TestDelArray {
    public static void main(String[] args) {
        //创建一个新数组
        int[] arr = new int[]{1,5,2,4,3};
        for (int i = 0;i<arr.length;i++){
            for (int j = i;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
