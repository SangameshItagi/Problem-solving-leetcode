class Solution {
    public long beautifulSubarrays(int[] nums) {
        long ans=0;
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        long xor=0;
        for(int num:nums){
            xor^=num;
            map.put(xor, map.getOrDefault(xor, 0)+1);
        }
        for(Map.Entry<Long, Integer> entry : map.entrySet()){
            ans += sum(entry.getValue());
        }
        return ans;
    }
    
    public int sum(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            sum+=i;
        }
        return sum;
    }
}