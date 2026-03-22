class Solution {
    public int majorityElement(int[] nums) {
        int ele=0,count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count==0){
                ele=nums[i];
                count+=1;
            }else if(ele==nums[i]){
                count++;
            }else
            count--;
        }
        return ele;
    }
}
/*Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];*/

        //hash-map
        /*int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        
        return 0;*/