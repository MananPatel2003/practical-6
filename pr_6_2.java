import java.util.Scanner;

public class pr_6_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        pr_6_2 t1 = new pr_6_2();
        pr_6_2 t2 = new pr_6_2();
        int[] arr = new int[15];

        for (int i = 0; i < 15; i++) {
            double randNumber = Math.random();
            double d = randNumber * 100;
            arr[i] = (int) d;
        }
        t1.oddIndex(arr);
        System.out.println();
        t2.evenIndex(arr);
    }

    private void oddIndex(int[] arr) {
    }

    private void evenIndex(int[] arr) {
    }

}
