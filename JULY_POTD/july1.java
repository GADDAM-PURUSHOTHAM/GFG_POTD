class Solution {
    public int substrCount(String s, int k) {
        // code here
        
        int c=0;
        
        for(int i=0;i<s.length()-k+1;i++)
        {
            int a[]=new int[26];
            int count=0;
            for(int j=i;j<i+k;j++)
            {
                a[s.charAt(j)-'a']++;
            }
            for(int j=0;j<26;j++)
            {
                if(a[j]>0)
                {
                    count++;
                }
            }
            if(count==k-1)
            {
                c++;
            }
        }
        return c;
    }
}
