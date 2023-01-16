class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // brute force is to find the closest warmer temperature for each index
        // o(n) is too slow for this so we gotta optimize 


        // need to find distance of next biggest 
        int[] days = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1; i < temperatures.length; i++){

            while(!stack.isEmpty() && (temperatures[i] > temperatures[stack.peek()])){
                days[stack.peek()] = i - stack.peek();
                stack.pop();
            }

            stack.push(i);
        }
        return days;
    }
}