package codingchallengesec5;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-21));
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int largestPrime = 0;
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (number % i == 0) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }

}
