package com.mrk.leecode;

/**
 * TODO
 *
 * @author 王一鸣
 */
public class $021_01 {
    public static void main(String[] args) {
        $021_01 test = new $021_01();
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,4};
        test.sout(test.mergeTwoLists(test.arrayToListNode(arr1), test.arrayToListNode(arr2)));

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        StringBuilder str = new StringBuilder();
        while (l1 != null || l2 != null) {
            if (l2 == null) {
                str.append(l1.val + ",");
                l1 = l1.next;
            } else if (l1 == null) {
                str.append(l2.val + ",");
                l2 = l2.next;
            } else if (l2.val < l1.val) {
                str.append(l2.val + ",");
                l2 = l2.next;
            } else {
                str.append(l1.val + ",");
                l1 = l1.next;
            }

        }
        if (!"".equals(str.toString())){
            String[] arr = str.toString().split("\\,");
            if (arr != null && arr.length > 0){
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (result == null) {
                        result = new ListNode(Integer.parseInt(arr[i]));
                    } else {
                        ListNode temp = new ListNode(Integer.parseInt(arr[i]));
                        temp.next = result;
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
    public ListNode arrayToListNode(int[] arr) {
        ListNode result = null;
        if (arr != null && arr.length > 0){
            for (int i = arr.length - 1; i >= 0; i--) {
                if (result == null) {
                    result = new ListNode(arr[i]);
                } else {
                    ListNode temp = new ListNode(arr[i]);
                    temp.next = result;
                    result = temp;
                }
            }
        }
        return result;
    }

    public void sout(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
