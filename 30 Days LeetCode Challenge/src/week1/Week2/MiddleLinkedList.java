/*
 public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 */
class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        
        while(second!=null && second.next!=null){
            System.out.println("second="+second.val);
            first = first.next;
            if(first==null){
                break;
            }
            second = second.next.next;
            if(second==null){
                break;
            }
        }
        
        System.out.println("first="+first.val);
        return first;
    }
}