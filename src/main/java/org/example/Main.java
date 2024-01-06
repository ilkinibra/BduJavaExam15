import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long evenDigitProduct = findEvenDigitProduct(number);
        System.out.println("Product of even digits: " + evenDigitProduct);

        scanner.close();
    }

    private static long findEvenDigitProduct(long num) {
        num = Math.abs(num);

        long product = 1;

        while (num > 0) {
            long digit = num % 10;
            if (digit % 2 == 0) {
                product *= digit;
            }
            num /= 10;
        }

        return product;
    }
}
