class Solution {
    
    
    List<List<Integer>> combs;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combs = new ArrayList<>();
        
        dfs(candidates, 0, target, 0, new ArrayList<>());
        
        return combs;
        
    }
    
    
    
    
    public void dfs(int[] candidates, int i, int target, int currSum, List<Integer> list){
        
        
        
        if(i >= candidates.length){
            return;
        }
        if(currSum > target){
            return;
        }
        
        List<Integer> copy = new ArrayList<>(list);
        
        if(currSum == target){
            combs.add(copy);
            return;
        }
        copy.add(candidates[i]);
        
        dfs(candidates, i, target, currSum+candidates[i], copy);
        
        copy.remove(copy.size()-1);
        dfs(candidates, i+1, target, currSum, copy);
        
    }
}