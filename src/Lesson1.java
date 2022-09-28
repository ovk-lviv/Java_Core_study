import java.util.Arrays;
import java.util.Random;

public class Lesson1 {

    public static void main(String[] args) {

        // Task 1: create variables of primitive type

        byte b = 1;
        short s = 129;
        int i = 3409;
        long l = 346587698080980L;

        float f = 3.2f;
        double d = 78.979;

        char c = 'f';
        boolean bool = true;

        //Task 2: show min, max values for primitive data types using wrappers

        Byte minByte = Byte.MIN_VALUE;
        Byte maxByte = Byte.MAX_VALUE;

        Short minShort = Short.MIN_VALUE;
        Short maxShort = Short.MAX_VALUE;

        Integer minInt = Integer.MIN_VALUE;
        Integer maxInt = Integer.MAX_VALUE;

        Long minLong = Long.MIN_VALUE;
        Long maxLong = Long.MAX_VALUE;

        Float minFloat = Float.MIN_VALUE;
        Float maxFloat = Float.MAX_VALUE;

        Double minDouble = Double.MIN_VALUE;
        Double maxDouble = Double.MAX_VALUE;

        Character minCharacter = Character.MIN_VALUE;
        Character maxCharacter = Character.MAX_VALUE;

        System.out.println(minByte);
        System.out.println(maxByte);
        System.out.println(minShort);
        System.out.println(maxShort);
        System.out.println(minInt);
        System.out.println(maxInt);
        System.out.println(minLong);
        System.out.println(maxLong);
        System.out.println(minFloat);
        System.out.println(maxFloat);
        System.out.println(minDouble);
        System.out.println(maxDouble);
        System.out.println(minCharacter);
        System.out.println(maxCharacter);

        /**Output:
         -128
         127
         -32768
         32767
         -2147483648
         2147483647
         -9223372036854775808
         9223372036854775807
         1.4E-45
         3.4028235E38
         4.9E-324
         1.7976931348623157E308
         ￿
         **/

        //Task 3: create int array, find min, max values.
        int max = 0;

        int[] array = new int[10];
        Random random = new Random();

        for (int k = 0; k < array.length; k++) {
            array[k] = random.nextInt();
        }

        int min = array[0];

        for (int k = 0; k < array.length; k++) {
            if (array[k] > max) {
                max = array[k];
            }
        }
        for (int k = 0; k < array.length; k++) {
            if (array[k] < min) {
                min = array[k];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);

    }
}


