package ArrayList;

/**
 * @author 张铠建
 * @description 栈
 * @createdate 2019-05-31 17:16
 **/
public class MyStack {
    private int[] elements;

    public MyStack() {
        this.elements=new int[0];
    }
    //添加元素
    public void push(int element){
        //创建一个新的数组
        int[] newArr = new int[elements.length+1];
        for (int i=0;i<elements.length;i++){
            newArr[i]=elements[i];
        }
        newArr[elements.length]=element;
        elements=newArr;
    }
    //取出栈顶元素
    public int pop(){
        if (elements.length == 0){
            throw new RuntimeException("stack is empty");
        }
        int element = elements[elements.length-1];
        int[] newElement = new int[elements.length-1];
        for (int i = 0;i<newElement.length;i++){
            newElement[i] = elements[i];
        }
        elements = newElement;
        return element;
    }
    //查看栈顶元素
    public int peep(){
        return elements[elements.length-1];
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }
}
