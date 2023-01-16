class Solution {
    public int evalRPN(String[] tokens) {
        // each operation revolves around two numbers
        // after each operation answer becomes previous number
        Stack<Integer> intStack = new Stack<>();

        int curr = Integer.parseInt(tokens[0]);
        int previous = -201;
        
        for(int i = 1; i < tokens.length; i++){

            try{
                int pop = Integer.parseInt(tokens[i]);
                
                intStack.push(curr);
                curr = pop;
                

            }catch(NumberFormatException a){
                if(tokens[i].equals("+")){
                    previous = intStack.pop();
                    curr = previous + curr;

                }else if(tokens[i].equals("-")){
                    previous = intStack.pop();
                    curr = previous - curr;

                }else if(tokens[i].equals("/")){
                    previous = intStack.pop();
                    curr = previous / curr;

                }else{
                    previous = intStack.pop();
                    curr = previous * curr;

                }

            }
        }

        

        


        return curr;

        
        
    }
}