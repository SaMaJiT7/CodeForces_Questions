import java.util.Arrays;

public class longest_prefix {
    public static void main(String[] args) {
        String[] a = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(a));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idex = 0;
        while(idex < s1.length() && idex < s2.length()){
            if(s1.charAt(idex) == s2.charAt(idex)){
                idex++;
            }
            else {
                break;
            }
        }
        return s1.substring(0,idex);
    }
}
