import java.util.*;

class Solution {
    public List<Integer> findGoodIntegers(int n) {
        int limit = (int) Math.cbrt(n);
        Map<Integer, Integer> count = new HashMap<>();

        for (int a = 1; a <= limit; a++) {
            int aCube = a * a * a;

            for (int b = a; b <= limit; b++) {
                int sum = aCube + b * b * b;

                if (sum > n) break;

                count.put(sum, count.getOrDefault(sum, 0) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() >= 2) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        return result;
    }
}
