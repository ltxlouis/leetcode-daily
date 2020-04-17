package org.ltx.leetcode.problems;

import java.util.HashMap;

/** @author ltxlouis 2020-04-17 */
public class TwoSum {

  /**
   *
   *
   * <pre>
   * 1. complement
   * 2. one-pass two-pass
   * </pre>
   *
   * <pre>
   *   Given nums = [2, 7, 11, 15], target = 9,
   *
   * Because nums[0] + nums[1] = 2 + 7 = 9,
   * return [0, 1].
   * </pre>
   */
  class Solution {

    public int[] twoSum(int[] nums, int target) {

      int length = nums.length;

      HashMap<Integer, Integer> map = new HashMap<>(length);

      for (int i = 0; i < length; i++) {

        int diff = target - nums[i];

        if (map.containsKey(diff)) {
          return new int[] {i, map.get(diff)};
        } else {
          map.put(nums[i], i);
        }
      }

      return new int[] {};
    }
  }
}
