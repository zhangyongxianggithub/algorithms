package com.bestzyx.algorithms.list;

/**
 * @author zhangyongxiang
 *         created on 2021/3/25 下午7:30.
 **/
public class DeleteDuplicates_82 {
    
    public static ListNode deleteDuplicates(final ListNode head) {
        ListNode tmp = head;
        ListNode newHead = null;
        ListNode tailNode = null;
        while (tmp != null) {
            final ListNode start = tmp;
            while (tmp.next != null && tmp.val == tmp.next.val) {
                tmp = tmp.next;
            }
            if (start == tmp) {
                if (tailNode == null) {
                    newHead = new ListNode(start.val);
                    tailNode = newHead;
                } else {
                    tailNode.next = new ListNode(start.val);
                    tailNode = tailNode.next;
                }
            }
            tmp = tmp.next;
        }
        return newHead;
    }
}

class ListNode {
    public int val;
    
    public ListNode next;
    
    public ListNode() {}
    
    public ListNode(final int val) {
        this.val = val;
    }
    
    public ListNode(final int val, final ListNode next) {
        this.val = val;
        this.next = next;
    }
}
