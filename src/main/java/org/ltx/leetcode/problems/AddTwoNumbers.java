package org.ltx.leetcode.problems;

/** @author ltxlouis 2020-04-17 */
public class AddTwoNumbers {

  /**
   *
   *
   * <pre>
   * 1. carry
   * 2. sum mod 10
   * </pre>
   *
   * <pre>
   * Definition for singly-linked list.
   * public class ListNode {
   *     int val;
   *     ListNode next;
   *     ListNode(int x) { val = x; }
   * }
   *
   * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
   * Output: 7 -> 0 -> 8
   * Explanation: 342 + 465 = 807.
   * </pre>
   */
  class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

      ListNode rootNode = new ListNode(0);

      int increment = 0;
      int addition;
      int result;
      ListNode currentNode = rootNode;

      while (l1 != null || l2 != null || increment > 0) {

        addition = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + increment;
        result = addition % 10;
        increment = addition / 10;

        currentNode.next = new ListNode(result);
        currentNode = currentNode.next;

        if (l1 != null) {
          l1 = l1.next;
        }
        if (l2 != null) {
          l2 = l2.next;
        }
      }

      return rootNode.next;
    }
  }

  class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
