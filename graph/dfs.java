import java.util.ArrayList;

public class dfs {
    static class Edge
    {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w)
        {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void dfs(ArrayList<Edge>[]graph,int V)
    {
        boolean vis[]= new boolean[V];
        for(int i =0;i<V;i++)
        {   if(!vis[i])
            {
            dfsUtil(graph,i,vis);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[]graph,int curr,boolean vis[])
    {
        System.out.println(curr);
        vis[curr]=true;
        for(int i =0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
            {
                dfsUtil(graph,e.dest,vis);
            }
        }
    }

    public static void main(String[] args) {
        

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for (int i = 0; i < V; i++)
        {
            graph[i] = new ArrayList<>();
        }

        // 0-vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1-vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, -1));
        graph[1].add(new Edge(1, 3, 3));
        graph[1].add(new Edge(1, 4, 7));

        // 2-vertex
        graph[2].add(new Edge(2, 1, 2));

        // 3-vertex
        graph[3].add(new Edge(3, 1, 3));

        // 4-vertex
        graph[4].add(new Edge(4, 1, 7));
        graph[4].add(new Edge(1,3,4));
     


        dfs(graph,V);
    }
}
