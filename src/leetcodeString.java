public class leetcodeString {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        int lastDigit = num.charAt(num.length() - 1) - '0';

        if (lastDigit % 2 != 0) {
            return num;
        } else if (num.length() > 1) {
            return largestOddNumber(num.substring(0, num.length() - 1));
        } else {
            return "";
        }
    }
}