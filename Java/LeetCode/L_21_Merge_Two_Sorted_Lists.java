package Algorithm.LeetCode;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class L_21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        ListNode node111 = new ListNode(4);
        ListNode node11 = new ListNode(2, node111);
        ListNode node1 = new ListNode(1, node11);

        ListNode node222 = new ListNode(4);
        ListNode node22 = new ListNode(3, node222);
        ListNode node2 = new ListNode(1, node22);

        ListNode result = mergeTwoLists(node1, node2);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 예외 처리 추가
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }

        ListNode result;
        ListNode temp;
        if(list2.val < list1.val) {
            result = new ListNode(list2.val);
            list2 = list2.next;
        }
        else {
            result = new ListNode(list1.val);
            list1 = list1.next;
        }

        temp = result;
        while(list1 != null && list2 != null) {
            // 값이 더 노드를 뒤에 붙여준다.
            if(list2.val < list1.val) {
                temp.next = list2;
                list2 = list2.next;
            }
            else {
                temp.next = list1;
                list1 = list1.next;
            }
            // 다음 노드를 현재 노드에 넣어준다.
            temp = temp.next;
        }

        // list 가 null 이라면 다른 노드를 뒤에 쭉 붙여 버린다.
        if(list1 == null) {
            temp.next = list2;
        }
        else if(list2 == null) {
            temp.next = list1;
        }

        return result;
    }


    //      Definition for singly-linked list.
    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
