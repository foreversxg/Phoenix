package com.sxg;

import com.sxg.base.TowPoint;
import com.sxg.base.Unfinish;

@Unfinish
@TowPoint
public class Test019 {


    /**
     * right下一个节点是要删除的节点，所以right的初始化要比left落后一个！！！！！！！！
     * 保证left和right中间隔了n个节点，left == null时，right.next就是倒数第n个节点
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode mark = new ListNode(0, head);
        ListNode left = head;
        ListNode right = mark;
        while (n > 0) {
            n--;
            left = left.next;
        }
        while (left != null) {
            left = left.next;
            right = right.next;
        }
        right.next = right.next.next;
        return mark.next;
    }

}
