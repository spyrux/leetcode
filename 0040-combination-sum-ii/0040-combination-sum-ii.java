class Solution {
    
    List<List<Integer>> combs;
   
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        combs = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0,  target, new ArrayList<>());
        return combs;
        
    }
    
    
    
    public void dfs(int[] candidates, int i, int target, List<Integer> list){
        
        if(target == 0){
            combs.add(new ArrayList<>(list));
            return;
        }
        
        if(target < 0){
            return;
        }
        
        if(i >= candidates.length){
            return;
        }

        
        List<Integer> copy = new ArrayList<>(list);
        copy.add(candidates[i]);
        dfs(candidates, i+1, target - candidates[i], copy);
        
        
        while(i < candidates.length -1 && candidates[i] == candidates[i+1]){
            i++;
        }
        copy.remove(copy.size()-1);
        //backtracking
        dfs(candidates, i+1,target, copy);

        
        
        
        
    }
}