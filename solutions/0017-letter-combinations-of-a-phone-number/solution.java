class Solution {

    void fun(int i, String digits, Map<Character, String> map,
             List<String> ans, String str) {

        if (i == digits.length()) {
            ans.add(str);
            return;
        }

        char digit = digits.charAt(i);
        String letters = map.get(digit);

        for (int j = 0; j < letters.length(); j++) {
            fun(i + 1, digits, map, ans, str + letters.charAt(j));
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        fun(0, digits, map, ans, "");

        return ans;
    }
}
