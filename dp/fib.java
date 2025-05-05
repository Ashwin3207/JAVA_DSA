public class fib {

    public static int fibo(int n, int []dp)
    {
        if (n == 1)
        return 1;
        if(n==0)
        return 0;

    if (dp[n] != -1)
        return dp[n];

    dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp); 
    return dp[n]; 

    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];

       
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
       int ans =  fibo(n,dp);
        System.out.println(ans);
    }
}
