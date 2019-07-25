
public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
    }

    public static int lengthOfLastWord(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                res++;
            } else {
                res = 0;
            }
        }
        return res;
    }
}