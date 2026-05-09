class Solution {
    public int getLucky(String s, int k) {
        int num = 0;
        for (char ch : s.toCharArray()) {
            int val = ch - 'a' + 1;

        
            while (val > 0) {
                num += val % 10;
                val /= 10;
            }
        }

        for (int i = 1; i < k; i++) {
            int next = 0;

            while (num > 0) {
                next += num % 10;
                num /= 10;
            }

            num = next;
        }

        return num;
    }
}
