package com.SDAproject;

public class manualTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        Node nn =  list.remove(2);
        System.out.println(nn.value);
    }
}
