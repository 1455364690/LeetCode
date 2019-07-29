
public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 6, 0 };
        int[] b = { 3 };
        merge(a, 5, b, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
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