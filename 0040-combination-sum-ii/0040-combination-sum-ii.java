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
        
        for(int j = i; j < candidates.length; j++){
            
            if(j!= i && candidates[j] == candidates[j-1]){
                continue;
            }
            if(candidates[j] > target){
                break;
            }
            
            list.add(candidates[j]);
            dfs(candidates, j+1, target - candidates[j],  list);
            list.remove(list.size()-1);
        
            
        }
        
        
        
        
    }
}