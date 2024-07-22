import java.util.*;

class adjacent_node{
    public static void main(String[] args) {
        //! undirected graph
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] graph = new int[n][n];

        for(int i = 0; i<=m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u][v] = 1;
            graph[v][u] = 1;
        }
    }
}