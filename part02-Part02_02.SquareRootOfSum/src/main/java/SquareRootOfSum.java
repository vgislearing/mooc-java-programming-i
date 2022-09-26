
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = Integer.valueOf(scanner.nextLine());
        int two = Integer.valueOf(scanner.nextLine());
        int number = one + two;
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);
    }
}
