public class LT_4000LoopLengthLInkedList {
    public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

            // Creating loop (5 → 3)
            head.next.next.next.next.next = head.next.next;

            int length = findLoopLength(head);
            System.out.println("Length of loop: " + length);
        }
        public static int findLoopLength(Node head){
           Node slow=head;
           Node fast=head;
           while (fast!=null && fast.next!=null){
               slow=slow.next;
               fast=fast.next.next;
               if(slow==fast){
                   return loopLen(slow);
               }
           }
           return 0;
        }

        public static int loopLen(Node slow){
          int count=1;
          Node test=slow;
          while (test.next!=slow){
              test=test.next;
              count++;
          }
          return count;
        }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}