/**
 * Created by zhaorui on 15/10/15.
 */
public class SecondThread implements Runnable {

    // 多线程i是共享的
    private int i;

    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + Integer.toString(i));
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + Integer.toString(i));

            if (i == 20) {
                SecondThread st = new SecondThread();
                new Thread(st, "新线程1").start();
                new Thread(st, "新线程2").start();
            }

        }
    }
}
