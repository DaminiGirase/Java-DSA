public class DFID {

    static int graph[][] = {
        {0,1,1},
        {0,0,1},
        {0,0,0}
    };

    static void dfid(int start, int maxDepth){

        for(int depth=0; depth<=maxDepth; depth++){
            System.out.print("\nDepth "+depth+": ");
            dfs(start, depth);
        }
    }

    static void dfs(int node, int depth){

        if(depth < 0) return;

        System.out.print(node + " ");

        for(int i=0;i<graph[node].length;i++){
            if(graph[node][i]==1){
                dfs(i, depth-1);
            }
        }
    }

    public static void main(String[] args) {
        dfid(0,2);
    }
}