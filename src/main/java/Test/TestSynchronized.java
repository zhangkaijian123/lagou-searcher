package Test;

import java.util.concurrent.locks.ReentrantLock;

public class TestSynchronized {
    public static Object obj = new Object();
    public static ReentrantLock lock1 = new ReentrantLock(true);//true忽略线程的优先级
    public static ReentrantLock lock2 = new ReentrantLock(true);//true忽略线程的优先级
    public static int i = 0 ;
    static class ThreaDemo extends Thread{
        @Override
        public void run() {
            for (int j = 0;j<10000;j++){
                lock1.lock();
                try{
                    i++;
                }finally{
                    lock1.unlock();
                }
            }
        }
    }
    static class ThreaDemo1 extends Thread{
        int k = 0;
        public ThreaDemo1(int k){
            this.k = k;
        }
        @Override
        public void run() {
            try{
                if (k==1){
                    lock1.lockInterruptibly();
                    Thread.sleep(1000);
                    lock2.lockInterruptibly();
                }else {
                    lock2.lockInterruptibly();
                    Thread.sleep(1000);
                    lock1.lockInterruptibly();
                }
                System.out.println(Thread.currentThread().getName()+"执行完毕！");
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                if (lock1.isHeldByCurrentThread()){
                    lock1.unlock();
                }
                if (lock2.isHeldByCurrentThread()){
                    lock2.unlock();
                }
                System.out.println(Thread.currentThread().getName()+"退出");
            }
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreaDemo1(1),"t1");
        Thread t2 = new Thread(new ThreaDemo1(2),"t2");
        t1.start();
        t2.start();
        try {
            Thread.sleep(2000);
            t1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
