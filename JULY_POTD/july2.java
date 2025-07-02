class Solution {
    public int totalElements(int[] arr) {
     
        int l=0,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            while(map.size()>2)
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
            max=Math.max(max,(i+1)-l);
            
        }
        return max;
    }
}
