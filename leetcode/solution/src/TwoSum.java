import java.util.HashMap;

/**
 * https://leetcode.com/articles/two-sum/
 */
public class TwoSum {

    /**
     * 如果符合条件的不止一组呢？则找到一组就从map删除一组
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null && index != i) {
                return new int[] {
                        i, index
                };
            }
        }
        return null;
    }
}
