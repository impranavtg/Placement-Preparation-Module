class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next,temp=slow.next,prev=null;
        while(temp!=null){
            temp=temp.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        slow.next=prev;
        fast=head;
        while(prev!=null){
            if(fast.val!=prev.val)return false;
            prev=prev.next;
            fast=fast.next;
        }
        return true;
    }
}