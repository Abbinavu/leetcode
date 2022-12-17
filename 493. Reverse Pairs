class Solution {
    public int reversePairs(int[] nums) {
        int reversePairCount=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>2*(long)nums[j])
                reversePairCount++;
            }
        }
        return reversePairCount;
    }
}
