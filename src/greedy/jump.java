package greedy;

public class jump {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int curDistance=0;
        int nextDistance=0;
        int count=0;
        for(int i=0;i<=curDistance;i++){
            nextDistance=Math.max(nums[i]+i,nextDistance);
            if(curDistance>=nums.length-1){
                break;
            }
            if(i==curDistance){
                curDistance=nextDistance;
                count++;
            }
        }
        return count;
    }
}
