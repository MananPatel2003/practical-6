public class pr_6_1 extends Thread {

    public void run() {

        try {
            System.out.println("Hello World");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {

        pr_6_1 h1 = new pr_6_1();
        Thread t1 = new Thread(h1);
        t1.start();
    }

}
