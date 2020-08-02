package org.liyixin.fizzbuzz;

/**
 * @author Liyixin
 */
public class MathUtils {
    private MathUtils() {
    }

    public static int getDigit(int num) {
        int count = 0;
        while(num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static int pow(int x, int y) {
        if(y < 0) {
            throw new IllegalArgumentException("negative index was not supported");
        }
        int pow = 1;
        while(y != 0) {
            if((y & 1) != 0) {
                pow *= x;
            }
            y >>= 1;
            x *= x;
        }

        return pow;
    }

    public static boolean contains(int given, int target) {
        int digit = MathUtils.getDigit(target);
        int div = MathUtils.pow(10, digit);
        while(given != 0) {
            if(given % div == target) {
                return true;
            }
            given = given / 10;
        }
        return false;
    }

}
