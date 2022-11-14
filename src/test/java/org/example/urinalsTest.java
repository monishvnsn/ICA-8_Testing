package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void main() {

    }
    @Test
    void goodString() {
        System.out.println("=======Monish V N S Nallamilli========TEST ONE EXECUTED");
        assertFalse(urinals.goodString("10011001"));
        assertTrue(urinals.goodString("0101001001"));
        assertTrue(urinals.goodString("10001"));
        assertEquals(-1,urinals.countUrinals("10011001"));
        assertEquals(0,urinals.countUrinals("0101001001"));
        assertEquals(1,urinals.countUrinals("10001"));
        System.out.println(urinals.goodString("10011001"));
        System.out.println(urinals.countUrinals("10011001"));
        System.out.println(urinals.goodString("0101001001"));
        System.out.println(urinals.countUrinals("0101001001"));
        System.out.println(urinals.goodString("10001"));
        System.out.println(urinals.countUrinals("10001"));


    }
//    @Test
//    void getString() {
//        assertEquals(true,urinals.getString());
//    }
//
//    @Test
//    void openFile() {
//        assertEquals("Should be implemented",urinals.openFile());
//    }

//    @Test
//    void countUrinals() {
//        assertEquals(1,urinals.countUrinals());
//    }
}