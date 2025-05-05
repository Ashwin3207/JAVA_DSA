import java.util.*;

public class haspath {
    static class Edge
    {
        int src;
        int dest;
    

        public Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
          
        }
    }

    public static boolean has_path(ArrayList<Edge>[]graph,int src,int dest,boolean vis[])
    {
        if(src==dest)
        {
           
            return true;
            
        }

        vis[src]=true;
        for(int i =0;i<graph[src].size(); i++)
        {
            Edge e = graph[src].get(i);

            //e.dest= neighbour

            if(!(vis[e.dest]) && has_path(graph, e.dest, dest, vis))
            {   System.out.println(e.src);
                return true;
            }
        }
        return false;


    }
    public static void main(String[] args) {
        
        int V = 7;
        ArrayList<Edge> graph[]= new ArrayList[V];

        for(int i = 0;i<V;i++)
        {
            graph[i]= new ArrayList<>();
        }


        // 0 vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0, 2));



        // 1 vertex
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1, 0));

        // 2 vertex
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2, 4));

        // 3 vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        //4 vertex
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        //5 vertex
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        //6 vertex
        graph[6].add(new Edge(6, 5));

        boolean vis[]=new boolean[V];

      System.out.println(has_path(graph, 0, 6, vis));
    }



}
