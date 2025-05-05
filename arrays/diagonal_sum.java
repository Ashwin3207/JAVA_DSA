public class diagonal_sum {

    //brute force approach
    public static int brutediag(int matrix[][])
    {
        int sum =0;
        int n =matrix.length;
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum+=matrix[i][j];
                }
                else if(i+j==n-1)
                {
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    //optimized linear approach
    public static int diagsum(int matrix[][])
    {
        int sum =0;
        int n =matrix.length;
        for(int i =0;i<n;i++)
        {
            sum+=matrix[i][i];
            sum+=matrix[i][(n-1)-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
             
                        //bruteforce call
        System.out.println(brutediag(matrix));
        System.out.println(diagsum(matrix));
        
    }
    
}
