package primitivedatatypes;

public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {

        // Byte can hold up to 8 bits
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("The Min Byte value --> " + minByte);
        System.out.println("The Max Byte value --> " + maxByte);

        // Short can hold up to 2 bytes
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("The Min Short value --> " + minShort);
        System.out.println("The Max Short value --> " + maxShort);

        // Int can hold up to 4 bytes
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("The Min Int value --> " + minInt);
        System.out.println("The Max Int value --> " + maxInt);
        System.out.println("The Int OverFlow --> " + (maxInt + 1));
        System.out.println("The Int UnderFlow --> " + (minInt - 1));

        int intWith_Score = 2_147_483_647;

        // Long can hold up to 8 bytes
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("The Min Long value --> " + minLong);
        System.out.println("The Max Long value --> " + maxLong);

        // Number without L is treated as integer
        long long_val = 2_147_483_648L;
        System.out.println(long_val);

        // Type Casting
        byte byteCast = (byte) (256 / 2);
        System.out.println(byteCast);

        byte b = 100;
        short s = 1200;
        int i = 200;
        long l = 50000L + 10L * (b + s + i);
        System.out.println(l);

        // Float can hold up to 4 bytes
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("The Min Float value --> " + minFloat);
        System.out.println("The Max Float value --> " + maxFloat);

        // Double can hold up to 8 bytes
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("The Min Double value --> " + minDouble);
        System.out.println("The Max Double value --> " + maxDouble);

        int myInt = 5 / 3;
        float myFloat = 5f / 3;
        double myDouble = 5d / 3;
        System.out.println("myInt --> " + myInt);
        System.out.println("myFloat --> " + myFloat);
        System.out.println("myDouble --> " + myDouble);

        // Char can support up to 2 bytes
        char c = 'D';
        char c_unicode = '\u0044';
        char c_unicode1 = '\u0040';
        System.out.println("Char D & its unicode --> " + c + " " + c_unicode);
        System.out.println("Unicode value of 0040 --> " + c_unicode1);

        // Boolean size is only 1 bit
        boolean true_v = true;
        boolean false_v = false;
    }
}
