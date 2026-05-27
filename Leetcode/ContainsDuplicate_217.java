class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> a= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        for(Integer i : a.values()){
            if(i>1){
                return true;
            }
        }
        return false;
    }
}