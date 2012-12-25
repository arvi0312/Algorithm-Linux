/**
 * Sanqiang Zhao Www.131X.Com Dec 24, 2012
 */
package LeetCode.OnlineJudge;

import Util.LinkedListNode;

public class Q89_RotateList {

    public LinkedListNode<Integer> rotateRight(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> loop = head;
        int count = 1;
        while (count++ != n) {
            loop = loop.Next;
        }
        LinkedListNode<Integer> NewHead = loop.Next;
        loop.Next = null;
        loop = NewHead;
        while (loop.Next != null) {
            loop = loop.Next;
        }
        loop.Next = head;
        return NewHead;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> list = LinkedListNode.getSampleLinkedList();
        list.print();
        System.out.println("-=-=-=-=-=-=-");
        LinkedListNode<Integer> new_list = new Q89_RotateList().rotateRight(list, 3);
        new_list.print();
    }
}
