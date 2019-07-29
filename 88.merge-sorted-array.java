import com.sun.org.apache.regexp.internal.recompile;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1; i >= 0; i--) {
            nums1[n + i] = nums1[i];
        }
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < m && j < n) {
            if (nums1[n + i] < nums2[j]) {
                nums1[index] = nums1[n + i];
                i++;
            } else {
                nums1[index] = nums2[j];
                j++;
            }
            index++;
        }
        if (i >= m) {
            while (j < n) {
                nums1[index] = nums2[j];
                index++;
                j++;
            }
        }
        // for (int t : nums1) {
        // System.out.println(t);
        // }
    }
}
