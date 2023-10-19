class Solution {
    public int removeDuplicates(int[] nums) 
    {
        ArrayList<Integer> set =new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(!(set.contains(nums[i])))
            set.add(nums[i]);
            

        }
        for(int i=0;i<set.size();i++)
        {
            nums[i]=set.get(i);
        }
        return set.size();
       
    }
}