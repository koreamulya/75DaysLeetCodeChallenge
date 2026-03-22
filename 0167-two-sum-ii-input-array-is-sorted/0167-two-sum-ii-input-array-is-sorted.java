class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;//two pointers(arr is sorted)
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }else{
                return new int[] {left+1,right+1};//+1 becoz 1-based index
            }
        }
        return new int[] {};//TC:O(n)
    }
}