class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binarystr = new StringBuilder();
        for(char ch: s.toCharArray()){
            String binary =String.format("%8s",Integer.toBinaryString(ch)).replace(' ','0');
            binarystr.append(binary);
        }
        String original = binarystr.toString();
        String reversed = binarystr.reverse().toString();
        return original.equals(reversed);
    }
}
