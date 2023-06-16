package in.ineuron;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static List<String> findRangesOfMissing(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        if (lower < nums[0]) {
            result.add(formRange(lower, nums[0] - 1));
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] + 1) {
                result.add(formRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }

        if (upper > nums[nums.length - 1]) {
            result.add(formRange(nums[nums.length - 1] + 1, upper));
        }

        return result;
    }

    private static String formRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        List<String> result = findRangesOfMissing(nums, lower, upper);
        System.out.println(result);
    }
}
