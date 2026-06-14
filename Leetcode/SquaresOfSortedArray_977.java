class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] result= new int[nums.length];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=nums[i]*nums[i];
            result[i]=ans;
        }
        Arrays.sort(result);
        return result;
    }
}