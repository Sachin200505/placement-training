class Solution {
    public List<TreeNode> generateTrees(int n) {
        return dfs(1, n);
    }

    private List<TreeNode> dfs(int i, int j) {
        List<TreeNode> ans = new ArrayList<>();
        if (i > j) {
            ans.add(null);
            return ans;
        }
        for (int v = i; v <= j; ++v) {
            var left = dfs(i, v - 1);
            var right = dfs(v + 1, j);
            for (var l : left) {
                for (var r : right) {
                    ans.add(new TreeNode(v, l, r));
                }
            }
        }
        return ans;
    }
}