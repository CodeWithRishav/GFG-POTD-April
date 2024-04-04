class Solution {
    public static long sumSubstrings(String s) {
        final int MOD = 1000000007;
        int n = s.length();
        long[] dp = new long[n];
        dp[0] = s.charAt(0) - '0';
        long result = dp[0];
        
        for (int i = 1; i < n; i++) {
            int num = s.charAt(i) - '0';
            dp[i] = (dp[i - 1] * 10 + num * (i + 1)) % MOD;
            result = (result + dp[i]) % MOD;
        }
        
        return result;
    }
}