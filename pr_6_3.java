
public class pr_6_3 extends Thread {

    public void run() {
        int n = 1;
        try {
            while (true) {
                System.out.println(n);
                n++;
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {

        pr_6_3 s1 = new pr_6_3();
        Thread t1 = new Thread(s1);
        t1.start();

    }

}
