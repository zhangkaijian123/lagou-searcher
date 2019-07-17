package Test;

/**
 * @author 张铠建
 * @description 汉诺塔
 * @createdate 2019-06-04 21:51
 **/
public class TestHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
    /**
     * @description
     * @author 张铠建
     * @date 2019/6/4
     * @param n 共有n个盘子
     * @param from 开始的柱子
     * @param in 中间的柱子
     * @param to 目标柱子
     * @return void
     * 无论有多少个盘子，都认为有两个，上面所有的盘子和最下面的盘子
     */
    public static void hanoi(int n,char from,char in, char to){
        if (n==1){
            System.out.println("第1个盘子从"+from+"移到"+to);
        }else {
            //把上面所有盘子移动到第中间柱子
            hanoi(n-1,from,to,in);
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);
            //把上面所有盘子从中间柱子移动到目标柱子
            hanoi(n-1,in,from,to);
        }
    }
}
