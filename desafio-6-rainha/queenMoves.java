import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2;
        boolean sameRow, sameColumn, diagonal;
        // se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1
        // movimento
        // se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while (true) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)
                break; // condição de parada

            if (x2 == x1 && y2 == y1)
                System.out.println("0");
            else if (x1 > 8 || y1 > 8 || x2 > 8 || y2 > 8)
                System.out.println();
            else if (x2 == x1 || y2 == y1 || (Math.abs(x2 - x1) == Math.abs(y2 - y1)))
                System.out.println("1");
            else
                System.out.println("2");
        }
        sc.close();
    }
}