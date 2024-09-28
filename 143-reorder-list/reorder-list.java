/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null)return;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        // System.out.println(count);
        Stack<ListNode>st=new Stack<>();
        if(count%2==0){
            ListNode newtemp=head;
            int tempcount=0;
            while(tempcount<count/2){
                tempcount++;
                newtemp=newtemp.next;
            }
            // System.out.println(newtemp.val);
            while(newtemp!=null){
                st.push(newtemp);
                newtemp=newtemp.next;
            }
            newtemp=head;
            int a=0;
            while(a<count/2){
                a++;
                ListNode nexttemp=newtemp.next;
                ListNode next1=st.pop();
                newtemp.next=next1;
                next1.next=nexttemp;
                newtemp=nexttemp;
            }
            newtemp.next=null;
            // newte
        }
        else if(count%2==1){
            ListNode newtemp=head;
            int tempcount=0;
            while(tempcount<count/2){
                tempcount++;
                newtemp=newtemp.next;
            }
            // System.out.println(newtemp.val);
            while(newtemp!=null){
                st.push(newtemp);
                newtemp=newtemp.next;
            }
            newtemp=head;
            int a=0;
            while(a<count/2){
                a++;
                ListNode nexttemp=newtemp.next;
                ListNode next1=st.pop();
                newtemp.next=next1;
                next1.next=nexttemp;
                newtemp=nexttemp;
            }
            newtemp.next=null;
            // newte
        }
    }
}