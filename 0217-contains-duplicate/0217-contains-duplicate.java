class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int elt:nums){
            map.put(elt,map.getOrDefault(elt,0)+1);
        }
        for (int count : map.values()) {
            if (count > 1) {
                return true;
            }
        }
        return false;
        }
    }

    /*class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            set.add(num);
            }
        }
        return false;
    }
}
*/