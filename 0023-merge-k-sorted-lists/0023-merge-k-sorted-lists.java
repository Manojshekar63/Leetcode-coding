import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        // Min-heap based on node values
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head of each list
        for (ListNode node : lists) {
            if (node != null) minHeap.add(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {
            ListNode smallest = minHeap.poll();
            tail.next = smallest;
            tail = tail.next;

            if (smallest.next != null) {
                minHeap.add(smallest.next);
            }
        }

        return dummy.next;
    }
}
