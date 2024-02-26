package LeetCode;

import java.util.LinkedList;

public class 滑动窗口最大值239 {
    static public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1){
            return nums;
        }
        int[] in = new int[nums.length];
        for(int i = 0; i<nums.length; i++)in[i] = i;
        int[] out = new int[nums.length - k + 1];
        LinkedList<Integer> list = new LinkedList<>();
        int index = 0;
        for(int i = 0; i<in.length; i++){
            while(!list.isEmpty() && list.peekLast() <= nums[i])list.pollLast();
            list.add(nums[i]);
            if(list.peekFirst() == i - k) list.pollFirst();
            if(i >= k-1)out[index++] = nums[list.peekFirst()];
        }
        return nums;

    }
    public static void main(String[] args) {
        int[] a = {1,3,-1,-3,5,3,6,7};
        int[] re = maxSlidingWindow(a, 3);
        for(int i = 0; i<re.length; i++){
            System.out.print(re[i] + " ");
        }

    }
}