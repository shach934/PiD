package com.SDAproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testToString() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);
        assertEquals("LinkedList(10,20)", list.toString());
    }

    @Test
    void testAdd() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
    }

    @Test
    void testIsEmpty() {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
        list.add(10);
        list.add(20);
        assertFalse(list.isEmpty());
    }

    @Test
    void testSize() {
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(0, list.size());
        list.add(10);
        list.add(20);
        assertEquals(2, list.size());
    }

    @Test
    void testSearch() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        assertEquals(0, list.search(10));
        assertEquals(1, list.search(20));
    }

    @Test
    void testGet() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        assertEquals(10, list.get(0).value);
        assertEquals(20, list.get(1).value);
        assertEquals(null, list.get(20));
        assertEquals(null, list.get(-1));
    }

    @Test
    void testRemove() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        assertEquals(20, list.remove(1).value);
        assertEquals(null, list.remove(19));
        assertEquals((Integer)10, list.remove((Integer) 10).value);
    }
}