class Solution {
    public boolean isMonotonic(int[] nums)
    {
        boolean flag=true;
        boolean flag2=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(!(nums[i]<=nums[i+1]))
            {
                flag=false;
                break;
            }
        }

        if(flag==false)
        {
             for(int i=0;i<nums.length-1;i++)
        {
            if(!(nums[i]>=nums[i+1]))
            {
                flag2=false;
                break;
            }
        }
        }

        if(flag || flag2)
        return true;
        else
        return false;


        
    }
}