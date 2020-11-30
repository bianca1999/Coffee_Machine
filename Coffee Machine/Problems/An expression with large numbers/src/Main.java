import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] parts = scanner.nextLine().split("\\s+");

        BigInteger a = null;
        BigInteger b = null;
        BigInteger c = null;
        BigInteger d = null;

        try {
            a = new BigInteger(parts[0]);
            b = new BigInteger(parts[1]);
            c = new BigInteger(parts[2]);
            d = new BigInteger(parts[3]);
            BigInteger result = a.negate();
            result = result.multiply(b);
            result = result.add(c);
            result = result.subtract(d);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Can't parse a big integer value");
            e.printStackTrace();
        }
    }
}