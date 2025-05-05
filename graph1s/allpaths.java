import java.util.ArrayList;

public class allpaths {

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

    public static void graphCreation(ArrayList<Edge>[] graph, int V) {
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
       
        // 2 vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

         // 3 vertex
         graph[3].add(new Edge(3, 1));
         graph[3].add(new Edge(3, 5));
         graph[3].add(new Edge(3, 4));

          // 4 vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 3));
          // 5 vertex
          graph[5].add(new Edge(5, 4));
          graph[5].add(new Edge(5, 3));
          graph[5].add(new Edge(5, 6));

            // 6 vertex
        graph[6].add(new Edge(6, 5));
    

    }
    public static void findPath(ArrayList<Edge>[]graph,boolean vis[],int curr,int target,String path)
    {
        if(curr==target)
        {
            System.out.println(path);
            System.out.println(" ");
            return;
        }
        for(int i =0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);

            if(!(vis[e.dest]))
            {

                vis[curr]=true;
                findPath(graph, vis, e.dest, target, path+" -> "+e.dest);
                vis[curr]=false;

            }
           
        }

    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
         graphCreation(graph, V);            // Creating the graph
        String path="0";
        boolean vis[]= new boolean[V];

         findPath(graph, vis, 0, 5, path);
    }
}
