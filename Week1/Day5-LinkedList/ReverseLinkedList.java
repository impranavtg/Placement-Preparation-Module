class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null,curr=head,temp=head;
        while(temp!=null){
            temp=temp.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}