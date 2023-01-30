class Solution {
    public int myAtoi(String s) {
        int result = 0;
        boolean neg = false;
        for (int i = 0; i < s.length(); i++) {
            if (result != 0 && s.charAt(i) == '-') {
                neg = true;
                continue;
            }
            switch (s.charAt(i)) {
                case '0': result = result * 10; continue;
                case '1': result = result * 10 + 1; continue;
                case '2': result = result * 10 + 2; continue;
                case '3': result = result * 10 + 3; continue;
                case '4': result = result * 10 + 4; continue;
                case '5': result = result * 10 + 5; continue;
                case '6': result = result * 10 + 6; continue;
                case '7': result = result * 10 + 7; continue;
                case '8': result = result * 10 + 8; continue;
                case '9': result = result * 10 + 9; continue;
            }
        }
        if (neg) {
            result *= -1;
        }
        return result;
    }
}