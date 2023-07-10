class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode temp=head,prevNode=null,ans=null;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int T=count/k;
        temp=head;
        prevNode=temp;
        while(T-->0){
            ListNode prev=null,curr=temp,temp2=temp;
            int i=k;
            while(i-->0){
                temp2=temp2.next;
                curr.next=prev;
                prev=curr;
                curr=temp2;
            }
            if(T+1!=count/k)prevNode.next=prev;
            else ans=prev;
            prevNode=temp;
            temp.next=temp2;
            temp=temp2;
        }
        return ans;
    }
}