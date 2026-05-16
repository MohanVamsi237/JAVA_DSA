package linkedlist;
public class LLqueries{
    public static void main(String[] args){
        /**
        * Definition for singly-linked list.
        * public class ListNode {
        *     int val;
        *     ListNode next;
        *     ListNode() {}
        *     ListNode(int val) {
                this.val = val;
            }
        *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        * }
        */


    //Removal of nth node from the end of the list  

        // class Solution {
        //     public ListNode removeNthFromEnd(ListNode head, int n) {

        //         if(head.next == null){
        //             return null;
        //         }

        //         int size = 0;
        //         ListNode curr = head;

        //         while(curr != null){
        //             curr = curr.next;
        //             size++;
        //         }

        //         int k = size - n;
        //         if(k == 0){
        //             return head.next;
        //         }

        //         ListNode prev = head;
        //         int i = 0;

        //         while(i < k-1){
        //                 prev = prev.next;
        //             i++;
        //         }

        //         prev.next = prev.next.next;

        //         return head;
        //     }
        // }    


    // palindrome check
        //     class Solution {
        //     public ListNode reverse(ListNode head){
        //         ListNode prev=null;
        //         ListNode curr=head;

        //         while(curr!=null){
        //             ListNode next=curr.next;
        //             curr.next=prev;
        //             prev=curr;
        //             curr=next;
        //         }
        //         return prev;
        //     }

        //     public ListNode findMiddle(ListNode head){
        //         ListNode slow=head;
        //         ListNode fast=head;

        //         while(fast.next!=null && fast.next.next!=null){
        //             fast=fast.next.next;
        //             slow=slow.next;
        //         }
        //         return slow;
        //     }

        //     public boolean isPalindrome(ListNode head) {
        //         if(head==null || head.next==null){
        //             return true;
        //         }
        //         ListNode middle=findMiddle(head);
        //         ListNode secondHalfStart=reverse(middle.next);
        //         ListNode firstHalfStart=head;
        //         while(secondHalfStart!=null){
        //             if(firstHalfStart.val!=secondHalfStart.val){
        //                 return false;
        //             }
        //             firstHalfStart=firstHalfStart.next;
        //             secondHalfStart=secondHalfStart.next;
        //         }
        //         return true;
        //     }
        // }


    // Floyd's Algorithm or hare-turtle method
        //         public class Solution {
        //     public boolean hasCycle(ListNode head) {
        //         ListNode hare=head;
        //         ListNode turtle=head;

        //         while(hare!=null && hare.next!=null){
        //             hare=hare.next.next;
        //             turtle=turtle.next;
        //             if(hare==turtle){
        //                 return true;
        //             }
        //         }
        //         return false;
        //     }
        // }


    // Merge two sorted Lists
        //         class Solution {
        //     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //         ListNode temp=new ListNode(-1);
        //         ListNode curr=temp;

        //         while(list1!=null && list2!=null){
        //             if(list1.val<=list2.val){
        //                 curr.next=list1;
        //                 list1=list1.next;
        //             }
        //             else{
        //                 curr.next=list2;
        //                 list2=list2.next;
        //             }
        //             curr=curr.next;
        //         }
        //         if (list1 != null) {
        //             curr.next = list1;
        //         } 
        //         else {
        //             curr.next = list2;
        //         }
        //         return temp.next;
        //     }
        // }
    }
}
