/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int res = 0;
        if (s.length() == 0)
            return 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                res++;
            } else {
                res = 0;
            }
        }
        return res;
    }
}
