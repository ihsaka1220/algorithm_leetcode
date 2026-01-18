package greedy;

import java.util.Arrays;

public class canJump {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int maxJump=0;
        for(int i=0;i<=maxJump;i++){
            maxJump=Math.max(nums[i]+i,maxJump);
            if(maxJump>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}
