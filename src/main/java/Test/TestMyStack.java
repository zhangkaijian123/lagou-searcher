package Test;

import ArrayList.MyStack;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-31 17:32
 **/
public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
