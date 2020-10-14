package com.SDAproject;

class Node<T>{
    T value;
    Node next;
    Node(T num){
        value = num;
        next = null;
    }
}

/**
 * This class implements a standard single linked list.
 */
public class LinkedList<T> {
    // Always keep a node as head
    // Tail pointer to the last node, initialized to point to head.
    // Field Length to keep track of the number of elements in the LinkedList

    private Node head = new Node(-1);
    private Node tail = head;
    private int Length = 0;
    /**
     * Adds the integer element `num` to the end of
     * the list. Calling this method grows the size
     * of this list by one.
     *
     * @param num the element to be added.
     */

    public void add(T num) {
        // append the new node to the tail, move tail to the new tail node.
        tail.next = new Node(num);
        tail = tail.next;
        Length += 1;
    }
    /**
     * Returns a string representation of this list,
     * containing all elements in their insertion order.
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LinkedList(");
        Node current = head;
        if (current != null) { // list is non-empty
            current = current.next;
            builder.append(current.value);
            while (current.next != null) {
                current = current.next;
                builder.append("," + current.value);
            }
        }
        builder.append(")");
        return builder.toString();
    }

    public Boolean isEmpty(){
        return head == tail;
    }

    public int size(){
        /*
        int count = 0;
        Node current = head;
        while(current.next != null){
            current = current.next;
            count += 1;
        }
        return count;
        */
        return Length;
    }

    public int search(T num){
        Node current = head.next;
        int index = -1;
        while (current != null){
            index += 1;
            if(current.value.equals(num)){
                break;
            }else {
                current = current.next;
            }
        }
        return index;
    }

    public Node get(int index){
        int count = -1;
        Node current = head.next;
        while(current != null) {
            count += 1;
            if(count == index){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node remove(int index){
        // remove the node at index, return the pointer to the remove node
        if(Length == 0 || index > Length - 1){
            return null;
        }
        if(Length == 1 && index == 0){
            Node toRemove = head.next;
            tail = head;
            head.next = null;
            Length -= 1;
            return toRemove;
        }else if(Length > 1 && index == 0){
            Node toRemove = head.next;
            head.next = toRemove.next;
            Length -= 1;
            return toRemove;
        }else{
            Node ahead = get(index -1);
            Node toRemove = ahead.next;
            if(toRemove == tail){
                tail = ahead;
            }
            ahead.next = toRemove.next;
            Length -= 1;
            return toRemove;
        }
    }

    public Node remove(T data){
        // remove the first node with the same data
        int index = search(data);
        return remove(index);
    }
}
