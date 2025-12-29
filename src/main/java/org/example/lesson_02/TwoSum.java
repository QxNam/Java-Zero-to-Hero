package org.example.lesson_02;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public int[] twoSum3(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    /**
     * Hàm hỗ trợ chạy test case và đo thời gian (ms)
     */
    public static void runTestCase(int caseNum, int[] nums, int target, int[] expected) {
        TwoSum solver = new TwoSum();

        System.out.println("--- Case " + caseNum + " ---");
        System.out.println("Input: nums=" + Arrays.toString(nums) + ", target=" + target);

        // Đo thời gian bằng nanoTime để có độ chính xác cao, sau đó đổi sang ms
        long startTime = System.nanoTime();
        int[] result = solver.twoSum2(nums, target);
        long endTime = System.nanoTime();

        // Tính toán thời gian (1ms = 1,000,000 ns)
        double durationMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("Output:   " + Arrays.toString(result));
        System.out.println("Expected: " + Arrays.toString(expected));

        // So sánh kết quả
        boolean isCorrect = Arrays.equals(result, expected);
        System.out.println("Status:   " + (isCorrect ? "✅ PASS" : "❌ FAIL"));
        System.out.printf("Time:     %.4f ms\n\n", durationMs);
    }

    public static void main(String[] args) {
        // Case 1
        runTestCase(1, new int[]{2, 7, 11, 15}, 9, new int[]{0, 1});

        // Case 2
        runTestCase(2, new int[]{3, 2, 4}, 6, new int[]{1, 2});

        // Case 3
        runTestCase(3, new int[]{3, 3}, 6, new int[]{0, 1});
    }
}