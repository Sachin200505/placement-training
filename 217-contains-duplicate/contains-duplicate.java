import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> fre = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (fre.containsKey(nums[i])) {
                return true;
            } else {
                fre.put(nums[i], 1);
            }
        }

        return false;
    }
}
