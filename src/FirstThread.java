/**
 * Created by zhaorui on 15/10/15.
 */
public class FirstThread extends Thread {

    // 多线程i是非共享的
    private int i;

    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + " " + Integer.toString(i));
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i< 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + Integer.toString(i));

            if (i==20){
                new FirstThread().start();
                new FirstThread().start();
            }

        }
    }


}
