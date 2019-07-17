package Test;

/**
 * @author 张铠建
 * @description 打印斐波那契数列
 * @createdate 2019-06-04 21:46
 **/
public class TestFibonacci {
    public static void main(String[] args) {
        //斐波那契数列 1 1 2 3 5 8 13 21
        System.out.println(fibonacci(4));
    }
    public static int fibonacci(int i){
        if (i==1||i==2){
            return 1;
        }else {
            return fibonacci(i-1)+fibonacci(i-2);
        }
    }
}
