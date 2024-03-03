package contest;

import java.util.*;

public class L100231 {
    static public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k)
            queue.add((long)nums[i]);
            else
                break;
        }
        int sum = 0;
        while (queue.size() > 1) {
            long tmp1 = queue.poll();
            long tmp2 = queue.poll();
            sum ++;
            long tmp3 = Math.min(tmp1, tmp2) * 2 + Math.max(tmp1, tmp2);
            if(tmp3 < k) queue.add(tmp3);
        }
        sum += queue.size();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{999999999,999999999,999999999}, 1000000000));
    }
}
