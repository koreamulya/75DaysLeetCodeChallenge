class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;//optimal-TC:O(n),SC:O(1)
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }
}

//brute force: TC:O(n),SC:O(n)
       /* ArrayList<Integer>result=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=1;i<nums.length+1;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;*/