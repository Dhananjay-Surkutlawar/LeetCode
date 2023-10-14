class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        String ans="";
            int ch=0;
        for(int i=0;i<word1.length()+word2.length();i++)
        {
            if(i<word1.length()) ans=ans+word1.charAt(ch);

            if( i< word2.length()) ans= ans+word2.charAt(ch++);
            else 
            ch++;
            
        }
        return ans;
    }
}