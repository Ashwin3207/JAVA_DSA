import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs
{
  
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
    public static void bfsfunc(ArrayList<Edge>[]graph)
    {
        Queue<Integer> q= new LinkedList<>();
        boolean vis[]= new boolean[graph.length];
        q.add(0);

        while(!(q.isEmpty()))
        {
            int curr= q.remove();
            if(!vis[curr])
            {
                System.out.println(curr);
                vis[curr]=true;
          
            for(int i=0;i<graph[curr].size();i++)
            {
                Edge e = graph[curr].get(i);
                q.add(e.dest);
                
                
            }
            }
    }
    return;
      
    }

    public static void main(String[] args)
    {
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

        bfsfunc(graph);

    }

    
}
