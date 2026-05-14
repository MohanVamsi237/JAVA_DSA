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



    }
}
