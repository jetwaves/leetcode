class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int v1, v2;
        int[] res = new int[nums1.length + nums2.length];
        while(i< nums1.length || j<nums2.length){
            v1 = (i<nums1.length)?nums1[i]:2147483647;
            v2 = (j<nums2.length)?nums2[j]:2147483647;
            if(v1 <= v2){
                res[i+j] = v1;
                i++;
            } else {
                res[i+j] = v2;
                j++;
            }
        }
        if(res.length %2 ==0){
            return ((float)res[res.length/2 - 1 ]  + (float)res[res.length/2 ])/2;
        } else {
            return res[(res.length-1) /2] ;
        }
    }
}