/**
 * Created by zhaorui on 15/10/15.
 */
public class DrawTest {
    public static void main(String[] args) {
        Account account = new Account("zhaorui", 1000);
        new DrawThread("A", account, 800).start();
        new DrawThread("B", account, 800).start();
    }
}
