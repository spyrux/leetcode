class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> umap;
        
        for(std::vector<int>::iterator it = nums.begin(); it != nums.end(); ++it){
            int num = target - *it;
            int distance = it - nums.begin();
            if(umap.find(num) == umap.end()){
                 cout <<" not found\n\n";
            }else{
                return vector<int>{distance, umap.find(num)->second};
            }
            
            umap[*it] = distance;
            
            
        }
        

        
        return vector<int>(0);
    }
};