class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
            
            
            HashMap<Integer,Integer> map=new HashMap<>();
            int l=0,result=0;
            for(int i=0;i<arr.length;i++)
            {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                
                while(map.size()>k)
                {
                    if(map.get(arr[l])==1)
                    {
                        map.remove(arr[l]);
                    }
                    else
                    {
                        map.put(arr[l],map.get(arr[l])-1);
                    }
                    l++;
                }
                result=result+(i+1-l);
                
            }
            return result;
    }
}

