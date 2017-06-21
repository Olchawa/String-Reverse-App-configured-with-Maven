package com.reverse;

import junit.framework.TestCase;

public class StringReverseTest 
    extends TestCase
{
    public void testEmptyString() {
        assertEquals("", StringReverse.reverseString(""));
    }
  
    public void testWithSingleWord() {
        assertEquals("god", StringReverse.reverseString("dog"));
    }

    public void testWithTwoWords() {
        assertEquals("si a god", StringReverse.reverseString("is a dog"));
    }
   
    public void testWithSentence() {
        assertEquals("sihT si a gib god", StringReverse.reverseString("This is a big dog"));
    }
    
    public void testWithLeadingSpaces() {
        assertEquals("  sihT si a gib god", StringReverse.reverseString("  This is a big dog"));
    }

    public void testWithMultipleSpaces() {
        assertEquals("sihT   si a gib god", StringReverse.reverseString("This   is a big dog"));
    }
}
