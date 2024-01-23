class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(graph,0,new ArrayList<>());
        return res;
    }
    public void dfs(int graph[][],int src,List<Integer> path)
    {
        path.add(src);
        if(src==graph.length-1)
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<graph[src].length;i++)
        {
            dfs(graph,graph[src][i],path);
            path.remove(path.size()-1);
        }
    }
}
