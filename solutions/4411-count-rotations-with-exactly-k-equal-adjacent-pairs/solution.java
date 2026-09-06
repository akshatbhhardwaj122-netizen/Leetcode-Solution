class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int score=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                score++;
            }
        }
        int count=0;
        if(score ==k){
            count++;
        }
        for(int j=0;j<n-1;j++){
            if(s.charAt(j)==s.charAt(j+1)){
                 score--;
            }
        int pre=(j-1+n)%n;
        if(s.charAt(pre)==s.charAt(j)){
            score++;
           }
        if(score==k){
            count++;
        }
        }
      return count; 
    }
 
}
