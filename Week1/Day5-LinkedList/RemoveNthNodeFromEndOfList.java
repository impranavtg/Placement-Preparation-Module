class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode newNode=new ListNode();
      newNode.next=head;
      ListNode fast=newNode,slow=newNode;
        for(int i=0;i<n;i++)fast=fast.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        if(slow==newNode)head=head.next;
        slow.next=slow.next.next;
        return head;
    }
}