public class pr_6_4 extends Thread {

    public static void main(String[] args) {

        pr_6_4 p1 = new pr_6_4();
        pr_6_4 p2 = new pr_6_4();
        pr_6_4 p3 = new pr_6_4();
        Thread FIRST = new Thread(p1);
        Thread SECOND = new Thread(p2);
        Thread THIRD = new Thread(p3);

        FIRST.setPriority(7);
        SECOND.setPriority(3);
        THIRD.setPriority(4);

        System.out.println("Thread 1 priority - " + FIRST.getPriority());
        System.out.println("Thread 2 priority - " + SECOND.getPriority());
        System.out.println("Thread 3 priority - " + THIRD.getPriority());

    }

}
