import java.io.IOException;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {

            int number = leitor.nextInt();

            String evenOrOdd, positiveNegative, result;

            evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
            positiveNegative = (number > 0) ? "POSITIVE" : "NEGATIVE";
            result = (number == 0) ? "NULL" : evenOrOdd + " " + positiveNegative;

            System.out.println(result);

        }
        leitor.close();
    }
}