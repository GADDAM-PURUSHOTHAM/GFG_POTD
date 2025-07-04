class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        if(s.length()<k)
        {
            return -1;
        }
        int c=-1,l=0;
        
        HashMap<Character,Integer> map=new HashMap<>(); 
        
        for(int i=0;i<s.length();i++)
        {
            
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            
            while(map.size()>k)
            {
                if(map.get(s.charAt(l))==1)
                {
                    map.remove(s.charAt(l));
                }
                else
                {
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    
                }
                l++;
            }
            if(map.size()==k)
            {
                c=Math.max(c,i+1-l);
            }
        }
        return c;
        
    }
}
