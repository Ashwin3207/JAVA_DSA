
public class kadane_java {
    public static void main(String[] args) {

        int arr[]={1,3,-5,6,9,0,-7};
        int SubSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++)
        {
                currSum+=arr[i];

                if(currSum>SubSum)
                {SubSum=currSum;}

                if(currSum<0)
                {currSum=0;}
        }
        System.out.println(SubSum);
        
    }
    
}
