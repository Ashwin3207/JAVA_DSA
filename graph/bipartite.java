import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class bipartite {


        static class Edge {
            int src;
            int dest;
    
            public Edge(int s, int d) {
                this.src = s;
                this.dest = d;
    
            }
        }
    
        public static void graphCreation(ArrayList<Edge>[] graph, int V) {
            for (int i = 0; i < V; i++) {
                graph[i] = new ArrayList<>();
            }
    
            // 0 vertex
            graph[0].add(new Edge(0, 1));
            // 1 vertex
            graph[1].add(new Edge(1, 2));
           
            // 2 vertex
            graph[2].add(new Edge(2, 3));
    
        }

        public static boolean isBipartite(ArrayList<Edge>[]graph)
        {
            int col[]=new int[graph.length];
            
            for(int i =0;i<graph.length;i++)
            {
                col[i]=-1;
            }
            Queue<Integer> q= new LinkedList<>();

            for(int i =0;i<graph.length;i++)
            {
                if(col[i]==-1)
                {
                    q.add(i);
                    col[i]=0;

                    while(!(q.isEmpty()))
                    {
                        int curr = q.remove();

                        for(int j =0;j<graph[curr].size();j++)
                        {
                            Edge e = graph[curr].get(j);
                            if(col[e.dest]==-1)
                            {
                                int nextCol = col[curr]==0 ? 1:0;
                                col[e.dest]=nextCol;
                                q.add(e.dest);
                            }
                            else if(col[e.dest]==col[curr])
                            {
                                return false;
                            }
                        }
                    }
                }
            }

            return true;
        }

public static void main(String[]args)
{

    int V = 4;
    ArrayList<Edge>[] graph = new ArrayList[V];
     graphCreation(graph, V);            // Creating the graph
     
     System.out.println(isBipartite(graph));
}    
}
