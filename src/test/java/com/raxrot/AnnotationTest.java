package com.raxrot;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnnotationTest {
    private ArrayList<String> testList;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    public void beforeEach() {
        testList = new ArrayList<>();
        System.out.println("Before each test");
    }

    @AfterEach
    public void afterEach() {
        testList.clear();
        System.out.println("After each test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all tests");
    }

    @Test
    public void testOneItem() {
        testList.add("item");
        assertEquals(1, testList.size());
    }

    @Test
    public void testEmpty() {
        assertTrue(testList.isEmpty());
    }
}
