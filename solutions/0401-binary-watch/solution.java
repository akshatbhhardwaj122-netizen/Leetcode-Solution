import java.util.*;

class Solution {

    public List<String> readBinaryWatch(int turnedOn) {

        List<String> ans = new ArrayList<>();

        // Check all possible hours
        for (int h = 0; h < 12; h++) {

            // Check all possible minutes
            for (int m = 0; m < 60; m++) {

                // Count total ON bits
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {

                    // Format time
                    String time = h + ":";

                    if (m < 10)
                        time += "0";

                    time += m;

                    ans.add(time);
                }
            }
        }

        return ans;
    }
}
