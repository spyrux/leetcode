class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //binary search but jump arrays
        //have index for low high array index
        //check if taget is bigger or smaller 

        int lowi = 0;
        int highi = matrix.length -1;
        while(lowi <= highi){
            
            int mmid = highi + (lowi - highi)/2;
            int midmin = matrix[mmid][0];

            int midmax = matrix[mmid][matrix[mmid].length - 1];
            int highmax = matrix[highi][matrix[highi].length - 1];
            if(target < midmin){
                highi = mmid - 1;
            }if(target > midmax){
                lowi = mmid + 1;
            }if(target > midmin && target < midmax || target == midmin || target == midmax){
                
                break;
            }
        }
        if(!(lowi <= highi)){
            return false;
        }
        int targetindex = highi + (lowi - highi)/2;

        int low2 = 0;
        int high2 = matrix[targetindex].length - 1;
        while(low2 <= high2){
            int mid2 = high2 + (low2 - high2)/2;
            if(target > matrix[targetindex][mid2]){
                low2 = mid2 + 1;
            }if(target < matrix[targetindex][mid2]){
                high2 = mid2 - 1;
            }if(target == matrix[targetindex][mid2]){
                return true;
            }
        }



        return false;
    }
}