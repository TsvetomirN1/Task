
import java.util.Scanner;

public class task {
    static void printSymbol(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print('-');
        }
    }

    static void printStar(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print('*');
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        String star = "*";
        String space = "-";

        if (n > 2 && n % 2 != 0) {

            printUp(n, star, space);
            printDown(n, star, space);
        }

    }

    private static void printUp(int n, String star, String space) {
        int range = (n + 1) / 2;
        for (int i = 0; i < range; i++) {
            String upperPart = space.repeat(n - i) + star.repeat(n + 2 * i)
                    + space.repeat(n - 2 * i)
                    + star.repeat(n + 2 * i)
                    + space.repeat(n - i)
                    + space.repeat(n - i)
                    + star.repeat(n + 2 * i)
                    + space.repeat(n - 2 * i)
                    + star.repeat(n + 2 * i)
                    + space.repeat(n - i);
            System.out.print(upperPart);
            System.out.println();

        }
    }

    private static void printDown(int n, String star, String space) {
        int numOFRows = (n + 1) / 2;
        for (int i = 0; i < numOFRows; i++) {
            String lowerPart = space.repeat(n/ 2 - i)  + star.repeat(n) + space.repeat(1 + 2 * i)
                    + star.repeat((n* 2) - 1 - 2 * i)
                    + space.repeat(1 + 2 * i)
                    + star.repeat(n)
                    + space.repeat(n - 1 - 2 * i)
                    + star.repeat(n)
                    + space.repeat(1 + 2 * i)
                    + star.repeat((n * 2) - 1 - 2 * i)
                    + space.repeat(1 + 2 * i)
                    + star.repeat(n)
                    + space.repeat(n / 2 - i);
            System.out.println(lowerPart);

        }
    }
}





