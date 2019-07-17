package ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-29 13:18
 **/
public class MyArray {

    private int[] elements;

    public MyArray() {
        this.elements=new int[0];
    }
    public int size(){
        return elements.length;
    }
    //往数组的末尾添加一个元素
    public void add(int element){
        //创建一个新的数组
        int[] newArr = new int[elements.length+1];
        for (int i=0;i<elements.length;i++){
            newArr[i]=elements[i];
        }
        newArr[elements.length]=element;
        elements=newArr;
    }
    //打印数组中的元素
    public void show(){
        System.out.println(Arrays.toString(elements));
    }
    //删除数组中的元素
    public void delete(int index) {
        if (isTransboundary(index)) {
            //创建一个新的数组
            int[] newArr = new int[elements.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = elements[i];
                } else {
                    newArr[i] = elements[i + 1];
                }
            }
            elements = newArr;
        }else {
            throw new RuntimeException("下标越界");
        }
    }
    //取出指定位置的元素
    public int get(int index){
        if (isTransboundary(index)){
            return elements[index];
        }else {
            throw new RuntimeException("下标越界");
        }
    }
    public void insert(int element,int index){
        //创建一个新的数组
        int[] newArr = new int[elements.length+1];
        for (int i=0;i<elements.length;i++){
            if (i<index){
                newArr[i]=elements[i];
            }else {
                newArr[i+1]=elements[i];
            }
        }
        newArr[index]=element;
        elements=newArr;
    }
    //替换指定位置的元素
    public void set(int element,int index){
        if (isTransboundary(index)){
            elements[index]=element;
        }else {
            throw new RuntimeException("下标越界");
        }
    }
    //线性查找元素下标
    public int serach(int element){
        for (int i = 0;i<elements.length;i++){
            if (elements[i] == element){
                return i;
            }
        }
        return -1;
    }
    //二分法查找，返回的是数组排序、去重后的下标
    public int binarySerach(int element){
        //需要先排序，去重，在进行二分法查找
        int[] sortList = Sort(elements);
        int low = 0;
        int high = sortList.length-1;
        while(low<high){
            int mid=(high+low)/2;
            if (sortList[mid]>element){
                high = mid-1;
            }else if (sortList[mid]<element){
                low = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    //健壮性判断(判断下标是否越界)
    public boolean isTransboundary(int index){
        if (index>=0&&index<=elements.length-1){
            return true;
        }else {
            return false;
        }
    }
    //对数组去重、排序
    public int[] Sort(int[] arr){
        HashSet<Integer> hashSet= new HashSet<Integer>();
        for (int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        Set<Integer> set = new TreeSet<Integer>(hashSet);
        Integer[] integers = set.toArray(new Integer[]{});
        int[] result = new int[integers.length];
        for (int j=0;j<integers.length;j++){
            result[j] = integers[j].intValue();
        }
        return  result;
    }
}
