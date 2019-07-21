/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */
class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == 'I' && i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                res += 4;
                i++;
            } else if (currChar == 'I' && i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                res += 9;
                i++;
            } else if (currChar == 'I') {
                res += 1;
            } else if (currChar == 'V') {
                res += 5;
            } else if (currChar == 'X' && i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                res += 40;
                i++;
            } else if (currChar == 'X' && i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                res += 90;
                i++;
            } else if (currChar == 'X') {
                res += 10;
            } else if (currChar == 'L') {
                res += 50;
            } else if (currChar == 'C' && i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                res += 400;
                i++;
            } else if (currChar == 'C' && i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                res += 900;
                i++;
            } else if (currChar == 'C') {
                res += 100;
            } else if (currChar == 'D') {
                res += 500;
            } else if (currChar == 'M') {
                res += 1000;
            }
        }
        return res;
    }
}
