package greedy;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int count=0;
        int result=nums[0];
        for (int num : nums) {
            count += num;
            result = Math.max(result, count);
            if (count < 0) {
                count = 0;
            }
        }
        return result;
    }
}
