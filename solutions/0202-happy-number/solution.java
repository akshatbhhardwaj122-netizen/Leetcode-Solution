class Solution {
    public boolean isHappy(int n) {
       
        for (int i = 0; i < 1000; i++) {
            int sum = 0;
            int temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }

            if (sum == 1) {
                return true;
            }

            n = sum;
        }

        return false;
    }
}
