package com.lsy.algorithm.link;

/**
 * 打印两个有序链表的公共部分
 * P 41
 */
public class PrintCommonPart {

    public static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        printCommonPart(node,node3);

    }

    public static void printCommonPart(Node head1,Node head2){
        while (head1.next!=null && head2.next!=null){
            int v1 = head1.value;
            int v2 = head2.value;
            if(v1>v2)
                head2=head2.next;
            else if (v1<v2)
                head1=head1.next;
            else {
                System.out.println(v1);
                head1=head1.next;
                head2=head2.next;
            }
        }
    }
}
