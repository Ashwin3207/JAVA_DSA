public class check_sorted {

    public static boolean check_sorting(int arr[],int i)
    {   if(i==arr.length-1)
        {
            return true;        //since it will only reach last if all elements are less
        }
        if(arr[i]>arr[i+1])
        {
            return false;                               //if any element is found to be more i.e in not sorted order
        }
          return(check_sorting(arr,i+1));                       //otherwise keep checking with increasing indices
              
    }

    public static void main(String[] args) {

        int arr[]={6,2,3,4,5};
        System.out.println(check_sorting(arr,0));
    }
}
