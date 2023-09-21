class Solution {
    public String removeStars(String s) 
    {
        LinkedList<Character>list=new LinkedList<Character>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(0)=='*')
             continue;

            if(s.charAt(i)=='*')
            list.removeLast();

            if(s.charAt(i)!='*')
            list.add(s.charAt(i));

        }

        StringBuilder builder = new StringBuilder(list.size());
    for(Character ch: list)
    {
        builder.append(ch);
    }
    return builder.toString();

        
    }
}