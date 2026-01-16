package greedy;

import java.util.Arrays;

public class findContentChildren {
    /**
     * 先用小饼干满足胃口小的
     * */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        for (int i : s) {
            if (i >= g[j]) {
                j++;
            }
            if (j == g.length) {
                break;
            }
        }
        return j;
    }

}
