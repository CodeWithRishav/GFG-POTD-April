class Solution {
    // Function to count number of ways to reach the nth stair
    // when order does not matter.
    Long countWays(int n) {
        // your code here
        Long ans =  new Long(1);
        if(n == 1)  return ans;
        int i = 1;
        
        
        if(n%2 == 0){
                i = 2;
                
        }else{
            i = 3;
            
        }
        
        ans = new Long(2);
        while(i<n){
                ans++;
                i+=2;
            }
        return ans;
        
    }
}