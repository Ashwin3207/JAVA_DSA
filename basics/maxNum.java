public class maxNum {
    public static int findMax(int num[])
    {
        int Maxnum=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++)
        {
            if(num[i]>Maxnum)
            {
                Maxnum=num[i];
            }
        }
        return Maxnum;
    }
    public static void main(String[] args) {
        int num[]={4,9,1,0,4,1,0,15,9};
        System.out.println(findMax(num));

       

    }
    
}
