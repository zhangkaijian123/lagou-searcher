package Test;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-29 16:32
 **/
public class Tsetjinzita {
    public static void main(String[] args) {
        int index = 9;
        for (int i = 1;i<=index;i++){
            if (index<=5) {
                for (int j = 0;j<index-i;j++){
                    System.out.print(" ");
                }
                for (int k = 0;k<2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int h=2*i-1;h>0;h--){
                    System.out.print("*");
                }
                for (int g=index-i;g>0;g--){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
