class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(0, head);
        if(head == null ) return null;
        ListNode curr = head;
        ListNode pre = dummyNode;

        while(curr != null){
            if(curr.next != null && curr.val == curr.next.val){
                while(curr.next != null && curr.val == curr.next.val){
                    curr = curr.next;
                }

                pre.next = curr.next;
            }else{
                pre = pre.next;
            }
            curr = curr.next;

        }
        return dummyNode.next;
        
    }
}