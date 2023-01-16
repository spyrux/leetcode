class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        // idea is to add speed to position until target while checking if any cars match position, if they do they become a fleet moving at min of the fleet speed 
        int[][] pairArray = new int[position.length][2];
        
        for(int i = 0; i < position.length; i++){
            pairArray[i][0] = position[i];
            pairArray[i][1] = speed[i];


        }

        Arrays.sort(pairArray, (a, b) -> b[0]-a[0]  );

        double slowest = time(target,pairArray[0][0],pairArray[0][1]);
        System.out.println(slowest);
        int fleet = 1;
        

        for(int i = 1; i < pairArray.length; i++){
            if(time(target, pairArray[i][0], pairArray[i][1]) > slowest ){
                slowest = time(target, pairArray[i][0], pairArray[i][1]);
                System.out.println(slowest);
                fleet++;
            }
        }
        return fleet;
        
    }

    public double time(int target,int position, int speed ){

        return (double)(target-position)/speed;
    }
}