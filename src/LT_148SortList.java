import java.util.List;

public class LT_148SortList {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        // Call sort
        head = sortList(head);

        // Print sorted list
        printList(head);
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode mid=getMid(head);
        ListNode right=mid.next;
        mid.next=null;

        ListNode left=sortList(head);
        right=sortList(right);
        return merge(left,right);
    }
    public static ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                curr.next=l2;
                l2=l2.next;
            }else{
                curr.next=l1;
                l1=l1.next;
            }
            curr=curr.next;
        }
        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
