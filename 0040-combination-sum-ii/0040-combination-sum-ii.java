class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        
        if(candidates == null|| candidates.length == 0){
            return results;
        }
        
        List<Integer> sum = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumHelper(candidates, results, sum, target, 0);
        
        
        
        return results;
    }
    
    
    
    public void combinationSumHelper(int[] candidates, List<List<Integer>> results, List<Integer> sum, int target, int start){
        
        if(target == 0){
            results.add(new ArrayList<>(sum));
            return;
        }
        
        for(int i = start; i < candidates.length; i++){
            if(i!=start && candidates[i] == candidates[i-1]){
                continue;
            }
            
            if(candidates[i] > target){
                break;
            }
            
            sum.add(candidates[i]);        
            combinationSumHelper(candidates, results, sum, target - candidates[i], i + 1);
            sum.remove(sum.size()-1);
        }
        
        
        
    }
}