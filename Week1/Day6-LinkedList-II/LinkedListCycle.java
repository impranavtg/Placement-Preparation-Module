public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
       do{
           if((slow==null || fast==null) || (slow.next==null || fast.next==null))return false;
           slow=slow.next;
           fast=fast.next.next;
       }while(slow!=fast);
        return true;
    }
}