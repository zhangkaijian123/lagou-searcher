package Test;

/**
 * @author 张铠建
 * @description 线性查找数组
 * @createdate 2019-05-29 19:22
 **/
public class TestSerach {
    public static void main(String[] args) {
        int[] arr = new int[]{32,36,35,37,38};
        int index = -1;
        int num = 35;
        //遍历数组
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == num){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
