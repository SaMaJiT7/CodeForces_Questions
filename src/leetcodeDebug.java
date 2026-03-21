public class leetcodeDebug {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }
    public static int numberOfMatches(int n) {
        int totalmatch = 0;
        if (n == 1) {
            return totalmatch;
        }
        if (n % 2 == 0) {
            numberOfMatches(n / 2);
            totalmatch = totalmatch + n / 2;
        } else {
            numberOfMatches((n - 1) / 2 + 1);
            totalmatch = totalmatch + (n - 1) / 2;
        }
        return totalmatch;
    }
}
