

public class trapping_rainwater {
    public static int trappedRainwater(int height[])
    {
        int n = height.length;

        int left_max[] = new int[n];
        int right_max[] = new int[n];

        left_max[0]=height[0];
        right_max[n-1]=height[n-1];
        for(int i=1;i<n;i++)
        {
            left_max[i]= Math.max(left_max[i-1],height[i]);
        }
 
        for(int i=n-2;i>=0;i--)
        {
            right_max[i]= Math.max(right_max[i+1],height[i]);
        }
            int trappedwater=0;
        for (int i = 0; i < n; i++) {
            int waterLevel= Math.min(left_max[i],right_max[i])-height[i];
            trappedwater+=waterLevel;
            
        }
        return trappedwater; 
    }
    public static void main(String[] args) {
        

        int height[]= {4,2,0,6,3,2,5};

        System.out.println(trappedRainwater(height));
    }

}
