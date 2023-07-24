import java.util.*;
class LinkedList {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public ListNode head = null;
    public ListNode tail = null;
    public void add(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        ListNode headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }
    public void print(){
        ListNode current = head;
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode newLeft = mergeSort(head);
        ListNode newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);

    }

    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode mergedLL = new ListNode(-1);
        ListNode temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }else{
                temp.next = head2;
                temp= temp.next;
                head2 = head2.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }

        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 =head2.next;
        }
        return mergedLL.next;
    }
}

public class MergeSortLinkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            ll.add(x);
        }
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        ll.head = ll.reverseList(ll.head);
        ll.print();
        sc.close();
    }
}