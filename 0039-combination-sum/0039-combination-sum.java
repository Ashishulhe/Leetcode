/*class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
    }
}*/
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        btrack(0, candidates, target, new ArrayList<>());

        return ans;
    }

    private void btrack(int idx,
                           int[] candidates,
                           int target,
                           List<Integer> temp) {

        // base case
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {

            // pruning
            if (candidates[i] > target)
                break;

            // choose
            temp.add(candidates[i]);

            // recurse
            // i not i+1 because reuse allowed
            btrack(i, candidates, target - candidates[i], temp);

            // backtrack
            temp.remove(temp.size() - 1);
        }
    }
}