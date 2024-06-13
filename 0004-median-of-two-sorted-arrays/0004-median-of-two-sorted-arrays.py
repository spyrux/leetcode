class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        A,B = nums1, nums2
        if len(A) > len(B):
            A,B = B,A
    
        total = len(nums1)+len(nums2)
        half = total//2
        l = 0
        r = len(A)-1
        
        while True:
            mid2 = (r+l)//2
            w1 = half-(mid2+1)-1 
            Aleft = A[mid2] if mid2>=0 else float("-infinity")
            Aright = A[mid2+1] if mid2+1<len(A) else float("infinity")
            Bleft = B[w1] if w1 >= 0 else float("-infinity")
            Bright = B[w1+1] if w1+1<len(B) else float("infinity")
            
            if Aleft <= Bright and Bleft <= Aright:
                if total%2:
                    return min(Aright,Bright)
                else:
                    return (max(Aleft,Bleft) + min(Aright,Bright))/2
            elif Bleft>Aright:
                l = mid2+1
            else:
                r = mid2-1