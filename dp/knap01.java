
public class knap01{
    
    public static int knap(int n,int []weight, int []val,int W)
    {
        if(n==0 || W==0)
        return 0;

        if(weight[n-1] <= W )
        {
            //include
            int ans1 = val[n-1]+knap(n-1, weight, val, W-weight[n-1]);
            
            //exclude
            int ans2 = knap(n-1, weight, val, W);

            //picking the maximum of both
            return Math.max(ans1, ans2);
        }
        else
        {   //not valid

       return knap(n-1, weight, val, W);
        }  
            
    }
    public static void main(String [] args)
    {
       int val[]={15,14,10,45,30};

       int weight[]={2,5,1,3,4};
        int n = weight.length;
       int W = 7;

       System.out.println(knap(n, weight, val, W));
    }
}