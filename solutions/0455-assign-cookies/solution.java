import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort both the greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);
        
        int childPtr = 0;
        int cookiePtr = 0;
        
        // Traverse both arrays using two pointers
        while (childPtr < g.length && cookiePtr < s.length) {
            // If the cookie size satisfies the child's greed factor,
            // move to the next child
            if (s[cookiePtr] >= g[childPtr]) {
                childPtr++;
            }
            // Always move to the next cookie
            cookiePtr++;
        }
        
        // The child pointer represents the number of content children
        return childPtr;
    }
}

