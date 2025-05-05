
import java.util.*;

public class cycle_check {
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
        // circular graph & should return true
        // 2 vertex
        graph[2].add(new Edge(2, 3));

    }

    public static boolean checkCycle(ArrayList<Edge>[] graph){


        boolean vis[] = new boolean[graph.length];

        for(int i =0;i<graph.length;i++){

           
            if(!(vis[i]))
            {
                if(checkCycleUtil(graph, vis, i, -1))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkCycleUtil(ArrayList<Edge>[]graph,boolean vis[],int curr,int par)
    {
        vis[curr]=true; //visit current node
        
        for(int i =0 ; i < graph[curr].size();i++)
        {
             Edge e =  graph[curr].get(i);

            if(vis[e.dest] && e.dest!=par)
            {
                return true;             // If the neighbouring node is visited but it is not the parent the cycle is confirmed
            }
            else if(!vis[e.dest])
            {
                if(checkCycleUtil(graph, vis, e.dest, curr))
                {                                                                       //if the neighbour is not visited then we continue the serach and recursively call the function
                    return true;
                }
            }             

            //if it a visited and is a parent then it is following the path without anny cycle there is no need to do anything
        }
        return false;
    }

    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        graphCreation(graph, V);            // Creating the graph

        System.out.println(checkCycle(graph));          // Checking for cycle

    }
}
