package utilities;

import java.math.BigInteger;

public class Util {
    public String concatenateWords(String ... words) {
        return String.join("", words);
    }

    public BigInteger computeFactorial(Integer number) {
        BigInteger res = new BigInteger("1");
        while (number > 1) {
            res = res.multiply(new BigInteger(String.valueOf(number)));
            number--;
        }
        return res;
    }
}