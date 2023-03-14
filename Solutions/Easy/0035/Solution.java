class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length-1;
        int mid=(l+r)/2;
        while(l<=r){
            mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        if(target<nums[mid]) return mid;
        else return mid+1;
    }
}