class Solution {
    public boolean validMountainArray(int[] arr) 
    {
        if(arr.length<3)
        return false;
        int i=0;
        while(i<arr.length-1 && arr[i]<arr[i+1]) // go till the highest point 
        {
            i++;
        }
        if(i==0 || i==arr.length-1)
        return false;

        while(i<arr.length-1 && arr[i]>arr[i+1]) // go till last point if condition satisfy
        { i++; }

        return (i==arr.length-1);
    }
}