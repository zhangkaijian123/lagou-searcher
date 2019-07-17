package Test;

import ArrayList.MyArray;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-29 13:21
 **/
public class TestMyArray {
    public static void main(String[] args) {
        MyArray myArray=new MyArray();
        System.out.println(myArray.size());
        myArray.add(1);
        myArray.add(3);
        myArray.add(2);
        myArray.show();

        System.out.println(myArray.serach(4));
        System.out.println(myArray.binarySerach(2));
    }
}
