class Solution {

public int max(int num)
{
    int max=-1;
    while(num!=0)
    {
        max=Math.max(num%10,max);
        num=num/10;

    }
    return max;

}
    public int maxSum(int[] nums) 
    {
        int sum=0;
        if(nums.length==0)
        return -1;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int max1=max(nums[i]);
                int max2=max(nums[j]);
                if(max1==max2)
                {
                    sum=Math.max(sum,nums[i] + nums[j]);
                }
            }
        }

        if(sum!=0)
        return sum;
        else
        return -1;

        // if(nums.length==0)
        // return -1;

        // int left=0;
        // int right=left+1;
        // int sum=0;
        //     while(right<nums.length)
        //     {
        //         char []arr=String.valueOf(nums[left]).toCharArray();
        //         char []arr2=String.valueOf(nums[right]).toCharArray();
        //         Arrays.sort(arr);
        //         Arrays.sort(arr2);
        //         if(arr[arr.length-1]==arr2[arr2.length-1])
        //         {
        //             sum=Math.max(sum,nums[left++] + nums[right++]);
        //         }

        //     }

        //     if(sum!=0)
        //     return sum;
        //     else
        //     return -1;
        
    }
}