class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n=len(nums1)
        m=len(nums2)
        if n==0:
            return self.median(nums2)
        if m==0:
            return self.median(nums1)
        for i in range(n):
            self.binarySearch(nums2, nums1[i])
        return self.median(nums2)
    
    def binarySearch(self, arr, k):
        n=len(arr)
        l,r=0,n-1
        while l<=r:
            mid=int((l+r)/2)
            if k<arr[mid]:
                r=mid-1
            elif k>arr[mid]:
                l=mid+1
            else:
                arr.insert(mid+1,k)
                return
        arr.insert(r+1, k)

    def median(self, arr):
        n=len(arr)
        if n%2==1:
            return arr[int((n-1)/2)]
        else:
            mid=int((n-1)/2)
            return (arr[mid]+arr[mid+1])/2