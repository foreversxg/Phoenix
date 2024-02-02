package com.sxg;

import com.sxg.base.Unfinish;

@Unfinish
public class Test019 {


    /**
     * second下一个节点是要删除的节点，所以second的初始化要比first落后一个！！！！！！！！
     * 保证first和second中间隔了n个节点，first == null时，second.next就是倒数第n个节点
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode mark = new ListNode(0, head);
        ListNode first = head;
        ListNode second = mark;
        while (n > 0) {
            n--;
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return mark.next;
    }

}
