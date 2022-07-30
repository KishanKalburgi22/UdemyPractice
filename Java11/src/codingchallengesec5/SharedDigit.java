package codingchallengesec5;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(22, 33));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            int aFirst = a % 10;
            int aSecond = a / 10;

            int bFirst = b % 10;
            int bSecond = b / 10;

            return aFirst == bFirst || aFirst == bSecond || aSecond == bFirst || aSecond == bSecond;
        }
        return false;
    }
}
