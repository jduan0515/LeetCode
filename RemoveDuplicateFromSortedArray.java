public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length == 0) return 0;
        int i = 0, j = 1;
        for(; j < A.length; j++){
            if (A[j] != A[j - 1]) {
                A[++i] = A[j];
            }
        }
       return ++i;
    }
}