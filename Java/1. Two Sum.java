
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] rr = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j< nums.length - i; j++){
                // System.out.println(String.format("i = %d, j = %d", i,j));
                // System.out.println(String.format("nums[i] = %d, nums[i+j] = %d", nums[i], nums[i+j]));
                if(nums[i] + nums[i+j] == target){
                    rr[0]=i;
                    rr[1]=i+j;
                    return rr;
                }
            }
        }
    return rr;
    }
}