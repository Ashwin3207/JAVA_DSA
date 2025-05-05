
public class knapdp {

    public static int knap(int n,int weight[],int val[],int W,int dp[][])
    {
        if(n==0 || W==0)
        return 0;

        if(dp[n][W]!=-1)
        return dp[n][W];

        if(weight[n-1] <= W)
        {
            //include
            int ans1=val[n-1] + knap(n-1, weight, val, W-weight[n-1], dp);
            //exclude  
            int ans2=knap(n-1, weight, val, W, dp);

            return dp[n][W] = Math.max(ans1, ans2);
        }
        else
        {
            return dp[n][W] = knap(n-1, weight, val, W, dp); 
        }
       
    

    }
    public static void main(String[] args) {
        
        int val [] = {15,14,10,45,30};

        int weight [] = {2,5,1,3,4};
        int n = weight.length;
        int W = 7;
        int dp[][] = new int[n+1][W+1];
        for(int i =0;i<=n;i++)
        {
                for(int j =0;j<=W;j++)
                {
                    dp[i][j]=-1;
                }
        }
        System.out.println(knap(n, weight, val, W, dp));

        
    }
}
