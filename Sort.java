
  /* 
  @author Gabriel Benavidez
  
  Time complexity is O(n^2) because the sort method's else statement has a run time the size of the array which is n.
    within the sort method it calls the helper method which has a runtime on O(n). So O(n*n) is equal to O(n^2). */ 
  
    static Stack<Integer> sort(Stack <Integer> stack)
        {
            try
            {
        
                if (stack.isEmpty())
                {
                    System.out.println("Stack is empty");
                }
                
                else 
                {
                    
                    
                    while(!stack.isEmpty())
                    {
                        Integer curr = stack.pop(); 
                        helper(curr,stack);
                        helperStack.push(curr);
                        
                    }
                
                }
                
                
            } 
            catch(EmptyStackException e)
            {
                System.out.println("error");   
                
            }
            
            return helperStack;
        
        }
    
    static void helper( Integer element, Stack <Integer> s)
    {
        try
        {
            Integer tmp = helperStack.peek();
        
        
            while(!helperStack.isEmpty() && element < tmp)
            {
                tmp = helperStack.pop();
                s.push(tmp);
            
            }
        }
        
        catch(EmptyStackException e)
        {
            
        }
    
    
    }
    
    // end of code
    