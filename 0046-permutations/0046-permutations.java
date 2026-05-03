//Onfor1409
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        List<Integer> current = new ArrayList<>();
        boolean[] visited = new boolean[n];
        backtrack(n, nums, current, res, visited);
        return res;
    }
    public void backtrack(int n, int[] nums, List<Integer> current,List<List<Integer>> res, boolean[] visited) {
        if (current.size() == n) {
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < n; i++) {  
            if (visited[i]) continue;
            current.add(nums[i]);
            visited[i] = true;
            backtrack(n, nums, current, res, visited); 
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }
}
//Onfor1409