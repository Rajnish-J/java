import java.util.*;

class BFS {
    public static void main(String[] args) {
        
    }

    public static void BFS(List<List<Integer>> graph, int src){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.size()];

        q.add(src);
        vis[src] = true;

        while (q.size() > 0) {
            int rem = q.remove();

            //! processing the removed
            System.out.println(rem);

            //! all the nbrs
            List<Integer> nbrs = graph.get(rem);
            for(int nbr : nbrs){
                if(vis[nbr] == false){
                    q.add(nbr);
                    vis[nbr] = true;
                }
            }
        }
    }
}