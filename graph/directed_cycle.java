
import java.util.*;

public class directed_cycle
{
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
    public static void createGraph(ArrayList<Edge>[]graph,int V)
    {

        for(int i =0;i<V;i++)
        {
            graph[i]=new ArrayList<>();
        }

        //0-vertex
        graph[0].add(new Edge(0,1));
        //1-vertex
        graph[1].add(new Edge(1,2));
        //2-vertex
        graph[2].add(new Edge(2,3));
        //3-vertex
        graph[3].add(new Edge(3,1));


    }
    public static boolean checkCycle(ArrayList<Edge>[]graph)
    {

        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i =0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                if(isCycleUtil(graph,i,vis,stack))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isCycleUtil(ArrayList<Edge>[]graph,int curr,boolean []vis,boolean []stack)
    {
            vis[curr]=true;
            stack[curr]=true;

            for(int i =0;i<graph[curr].size();i++)
            {
                Edge e = graph[curr].get(i);

                if(stack[e.dest])
                {
                    return true;                                                    // if the neighbour was already visited in current stack or from current loop
                }
                if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack))
                {
                    return true;                                                      //if it is not visited then run the cycle check if that return true returns true
                }
            }


        return false;
    }

    
    public static void main(String args[])
    {
        int V=4;
        ArrayList<Edge>[]graph= new ArrayList[V];
        createGraph(graph, V);

        System.out.println(checkCycle(graph));


    }
}