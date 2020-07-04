package com.company;

import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class MyQueue{

    private Node head;
    private Node tail;

    public void add(Integer value){
        if(head == null){
            head = new Node(value);
            tail = head;
            return;
        }
        tail.setNext(new Node(value));
        tail = tail.getNext();
    }

    public Integer get() throws Exception {
        if (head == null)
            throw new Exception("No values.");
        Integer result = head.getValue();
        head = head.getNext();
        return result;
    }

    private class Node {
        private Integer value;
        private Node next;

        public Integer getValue() {
            return value;
        }
        public Node getNext() {
            return next;
        }
        public void setValue(Integer value) {
            this.value = value;
        }
        public void setNext(Node next) {
            this.next = next;
        }


        public Node(Integer value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(Integer value) {
            this(value, null);
        }
        public Node() {
            this(null);
        }
    }
}
