class Solution {
    public int[] shuffle(int[] arr, int n) 
    {
        int []nums= new int [2*n];
        int a=0;
        for(int i=0;i<n;i++)
        {
            nums[a]=arr[i];
            nums[a+1]=arr[i+n];
            a=a+2;
        }
        return nums;
    }
}