class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> stack=new Stack<>();

        for(int i : asteroids)
        {
            if(stack.isEmpty() || i>0  )
            {
                stack.push(i);
            }
            else
            {
                while(!stack.isEmpty())
                {
                    int top=stack.peek();
                    if(top<0)
                    {
                        stack.push(i);
                        break;
                    }
                    
                    int temp=Math.abs(i);

                    if(temp==top)
                    {
                        stack.pop();
                        break;
                    }
                    else if(temp<top)
                    {
                        break;
                    }
                    else
                    {
                        stack.pop();
                        if(stack.isEmpty())
                        {
                            stack.push(i);
                            break;
                        }
                    }
                }
            }
        }

        int []ans=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
        
    }
}