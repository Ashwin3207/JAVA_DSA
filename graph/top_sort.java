import java.util.*;

public class top_sort {
    static class Edge
    {
            int src;
            int dst;

            Edge(int s,int d)
            {
                this.src=s;
                this.dst=d;
            }
    }
    public static void createGraph(ArrayList<Edge>[]graph,int V)
    {

        for(int i =0;i<V;i++)
        {
            graph[i]=new ArrayList<>();
        }

        //0-vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,3));

        //1-vertex
        graph[1].add(new Edge(1, 2));

        //2-vertex
         //no outgoing edges

        //3-vertex
        graph[3].add(new Edge(3,2));

        //4 vertex
        graph[4].add(new Edge(4,2));
    }

    public static void topSort(ArrayList<Edge>[]graph)
    {

        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i =0 ;i<graph.length;i++)
        {   if(!vis[i])
            topSortUtil(graph,s,i,vis);
        }
        while(!(s.isEmpty()))
        {
            System.out.print(s.pop()+" ");
        }
    }
    public static void topSortUtil(ArrayList<Edge>[]graph,Stack<Integer> s,int current,boolean[]vis)
    {
        vis[current]=true;

        for(int i =0;i<graph[current].size();i++)
        {
            Edge e = graph[current].get(i);

            if(!vis[e.dst])
            {
                topSortUtil(graph, s, e.dst, vis);
            }
        }
        s.push(current);
    }
    public static void main(String[] args) {
        
        int V=5;
        ArrayList<Edge>[]graph = new ArrayList[V];
        createGraph(graph, V);
        topSort(graph);
    }
}
