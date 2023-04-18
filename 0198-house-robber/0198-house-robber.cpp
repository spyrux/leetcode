#include <algorithm>

class Solution {
public:
    
    
    int rob(vector<int>& nums) {
        
        
        if(nums.size() == 1){
            return nums.at(0);
        }
        if(nums.size() == 2){
            return max(nums.at(0), nums.at(1));
        }
        int amount = 0;
        vector<int> money(nums.size());
        money.at(0) = nums.at(0);
        money.at(1) = max(nums.at(0), nums.at(1));
        
        for (vector<int>::iterator p=money.begin(); p!=money.end(); ++p){
            int distance = std::distance(money.begin(), p);
            if(distance >= 2){
                vector<int>::iterator pasthouse = p - 2;
                
                *p = max(*pasthouse+ nums[distance], money.at(distance-1));
                

            }
            
           
            
            amount = max(*p, amount);
            
        }
        
        
        
        return amount;
        
    }
    
    
    
};