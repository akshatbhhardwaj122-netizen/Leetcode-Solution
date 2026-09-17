public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        // The first element of any row is always 1
        row.add(1);
        
        for (int i = 1; i <= rowIndex; i++) {
            // Step 1: Add a 1 at the end to represent the new row's boundary
            row.add(1);
            
            // Step 2: Update the elements from right to left (excluding boundaries)
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        
        return row;
    }
}

