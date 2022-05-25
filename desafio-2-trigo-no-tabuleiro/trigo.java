import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            long weightKg = (long) (Math.pow(2, x) / 12) / 1000;
            System.out.printf("%d kg\n", weightKg);
        }
        sc.close();
    }
}