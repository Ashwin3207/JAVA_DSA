public class path {

    public static double finddis(String path)
    {   
        double x=0;
        double y =0;
        for(int i=0;i<path.length();i++)
        {
            switch (path.charAt(i)) {
                case 'W' -> x--;
                case 'E' -> x++;
                case 'N' -> y++;
                default -> y--;
            }
        }
        double distance = Math.sqrt((Math.pow(x,2.0)+Math.pow(y,2.0)));
        return distance;
    }

    public static void main(String[] args) {
        
        String path="WNEENESENNN";

        System.out.println(finddis(path));
    }
}
