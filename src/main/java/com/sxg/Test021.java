package com.sxg;

public class Test021 {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 边界
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        // 每次运算都选最小的返回，这样就能保证顺序
        // 同时将选取的节点排除后，继续寻找最小的节点
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        list2.next = mergeTwoLists(list1, list2.next);
        return list2;
    }
}
