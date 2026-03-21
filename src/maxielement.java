public class maxielement {
        public static void main (String[]args){
            int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,12,12,12};
            System.out.println(findSpecialInteger(arr));
        }

    public static int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int s = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (s == arr[i]) {
                count++;
                if(arr.length < 10) {
                    if (count > n / 2) {
                        return s;
                    }
                }
                else {
                    if (count < n / 2) {
                        return s;
                    }
                }
            } else {
                s = arr[i];
                // Do not reset count here, as it needs to accumulate the count for the current element
            }
        }

        return -1; // No special integer found
    }
}