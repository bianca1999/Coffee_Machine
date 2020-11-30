import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(BigInteger n) {
        BigInteger result = null;
        while(n.compareTo(BigInteger.ZERO) == 0){
            result = result.multiply(n);
            n = n.subtract(BigInteger.TWO);

        }
        return result;


    }
}