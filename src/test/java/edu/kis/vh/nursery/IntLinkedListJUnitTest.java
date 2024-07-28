package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntLinkedListJUnitTest {

    private IntLinkedList list;

    @Before
    public void setUp() {
        list = new IntLinkedList();
    }

    @Test
    public void testPushAndTop() {
        Assert.assertTrue(list.isEmpty());
        list.push(10);
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(10, list.top());
    }

    @Test
    public void testPushMultipleAndTop() {
        for(int i = 0; i < 100; i++) {
            list.push(i);
            Assert.assertEquals(i, list.top());
        }
        list.push(30);
        Assert.assertEquals(30, list.top());
    }

    @Test
    public void testTopWhenEmpty() {
        Assert.assertEquals(-1, list.top());
    }

    @Test
    public void testPopWhenEmpty() {
        Assert.assertEquals(-1, list.pop());
    }

    @Test
    public void testPopSingleElement() {
        list.push(10);
        Assert.assertEquals(10, list.pop());
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testPopAndTopMultipleElements() {
        list.push(100);
        list.push(200);
        list.push(300);

        Assert.assertEquals(300, list.pop());
        Assert.assertEquals(200, list.top());

        Assert.assertEquals(200, list.pop());
        Assert.assertEquals(100, list.top());

        Assert.assertEquals(100, list.pop());
        Assert.assertTrue(list.isEmpty());
    }
}