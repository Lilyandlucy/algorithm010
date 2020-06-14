package Week01;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PlusOne {

    /**
     * v1
     *
     * @param digits
     * @return
     */
    public int[] plusOneV1(int[] digits) {
        int length = digits.length;
        digits[length - 1] = digits[length - 1]++;
        boolean carry = false;
        for (int i = length - 1; i >= 0; i--) {
            if (carry) {
                digits[i] = digits[i]++;
            }
            if (digits[i] >= 10) {
                digits[i] = digits[i] % 10;
                carry = true;
            } else {
                break;
            }
        }


        if (digits[0] == 0 && carry) {
            int[] newResult = new int[digits.length + 1];
            System.arraycopy(digits, 0, newResult, 1, digits.length);
            newResult[0] = 1;
            return newResult;
        }

        return digits;
    }


    /**
     * v2
     *
     * @param digits
     * @return
     */
    public int[] plusOneV2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
