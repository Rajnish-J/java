import java.util.*;

class adjacent_list_rep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //! adjacent list representation of graph

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).get(u);
        }
    }
}