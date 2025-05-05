

public class printdecrease {

    public static int revprint(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return 1;
        }
      
        else
        {   System.out.println(n);
            return revprint(n-1);
        }
    
    }
    public static void incprint(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
            
        }
        incprint(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        revprint(20);
        incprint(20);
    }
}
