package Test;

/**
 * @author 张铠建
 * @description 二分法查找
 * @createdate 2019-05-29 19:23
 **/
public class TestBinarySerach {
    public static void main(String[] args) {
        int[] arr = new int[]{21,32,54};
        int num = 32;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
        int mid = (high+low)/2;
            if (arr[mid]==num){
                System.out.println(mid);
                break;
            }else {
                if (arr[mid] > num) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
    }
}
