package utilities;

public class Util {
    public String concatenateWords(String ... words) {
        return String.join("", words);
    }

    public Long computeFactorial(Integer number) {
        return (number <= 1) ? 1L : computeFactorial(number - 1) * number;
    }
}
